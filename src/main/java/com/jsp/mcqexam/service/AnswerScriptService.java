package com.jsp.mcqexam.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.mcqexam.dao.AnswerScriptDAO;
import com.jsp.mcqexam.dao.QuestionDAO;
import com.jsp.mcqexam.daoImpl.AnswerScriptDAOImpl;
import com.jsp.mcqexam.dto.AnswerScriptDTO;
import com.jsp.mcqexam.entity.AnswerScriptEntity;
import com.jsp.mcqexam.entity.ParticipantEntity;
import com.jsp.mcqexam.entity.QuestionEntity;

public class AnswerScriptService {

	public AnswerScriptDAO answerScriptDAO;
	public QuestionDAO questionDAO;

	public AnswerScriptService() {
		answerScriptDAO = new AnswerScriptDAOImpl();
	}

	public void saveAnswerScript(AnswerScriptDTO answerScriptDTO) {
		answerScriptDAO.saveOrUpdateAnswerScript(copyDtoToEntity(answerScriptDTO));
	}

	// Save Method
	public AnswerScriptEntity copyDtoToEntity(AnswerScriptDTO answerScriptDTO) {
		AnswerScriptEntity answerScriptEntity = new AnswerScriptEntity();
		answerScriptEntity.setGivenAnswer(answerScriptDTO.getGivenAnswer());
		answerScriptEntity.setSetNo(answerScriptDTO.getSetNo());
		answerScriptEntity.setActiveStatus(answerScriptDTO.getActiveStatus());
		answerScriptEntity.setDateTime(answerScriptDTO.getDateTime());
	
		answerScriptEntity.setQuestionEntity(provideQuestionId(answerScriptDTO.getQuestionId()));
		answerScriptEntity.setParticipantEntity(provideParticipantById(answerScriptDTO.getParticipantId()));
		return answerScriptEntity;

	}
	
	private QuestionEntity provideQuestionId(Long questionId) {
		QuestionEntity questionEntity = new QuestionEntity();
		questionEntity.setQuestionId(Long.valueOf(questionId));
		return questionEntity;
	}
	private ParticipantEntity provideParticipantById(Long participantId) {
		ParticipantEntity participantEntity = new ParticipantEntity();
		participantEntity.setParticipantId(Long.valueOf(participantId));
		return participantEntity;
	}

 //view........
	public List<AnswerScriptDTO> findAllAnswerScript() {
		List<AnswerScriptDTO> answerScriptDTOList = new ArrayList<>();
		List<AnswerScriptEntity> answerScriptEntitieList = new ArrayList<>();
		answerScriptEntitieList = answerScriptDAO.findAllAnswerScript();
		for (AnswerScriptEntity answerScript : answerScriptEntitieList) {
			answerScriptDTOList.add(copyEntityToDto(answerScript));
		}
		return answerScriptDTOList;
	}

	// view list method
	public AnswerScriptDTO copyEntityToDto(AnswerScriptEntity answerScriptEntity) {
		AnswerScriptDTO answerScriptDTO = new AnswerScriptDTO();
		answerScriptDTO.setAnswerScriptId(answerScriptEntity.getAnswerScriptId());
		answerScriptDTO.setGivenAnswer(answerScriptEntity.getGivenAnswer());
		answerScriptDTO.setActiveStatus(answerScriptEntity.getActiveStatus());
		answerScriptDTO.setDateTime(answerScriptEntity.getDateTime());
		answerScriptDTO.setQuestionEntity(answerScriptEntity.getQuestionEntity());
		answerScriptDTO.setParticipantEntity(answerScriptEntity.getParticipantEntity());		
		return answerScriptDTO;

	}

	

	
}
