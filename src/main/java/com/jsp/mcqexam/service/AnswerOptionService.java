package com.jsp.mcqexam.service;

import com.jsp.mcqexam.dao.AnswerOptionDAO;
import com.jsp.mcqexam.daoImpl.AnswerOptionDAOImpl;
import com.jsp.mcqexam.dto.AnswerOptionDTO;
import com.jsp.mcqexam.entity.AnswerOptionEntriy;
import com.jsp.mcqexam.entity.QuestionEntity;

public class AnswerOptionService {
	public AnswerOptionDAO answerOptionDAO;

	public AnswerOptionService() {
		answerOptionDAO = new AnswerOptionDAOImpl();
	}

	// Save.............
	public void saveOrUpdateAnswerOption(AnswerOptionDTO answerOptionDTO) {
		answerOptionDAO.saveOrUpdateAnswerOption(copyDtoToEntity(answerOptionDTO));
	}

	public AnswerOptionEntriy copyDtoToEntity(AnswerOptionDTO answerOptionDTO) {
		AnswerOptionEntriy answerOptionEntriy = new AnswerOptionEntriy();
		answerOptionEntriy.setOptionLabel(answerOptionDTO.getOptionLabel());
		answerOptionEntriy.setOptionTitle(answerOptionDTO.getOptionTitle());
		answerOptionEntriy.setQuestionEntity(provideQuestionEntityById(answerOptionDTO.getQuestionId()));
		return answerOptionEntriy;
	}

	public QuestionEntity provideQuestionEntityById(Long questionId) {
		QuestionEntity questionEntity = new QuestionEntity();
		questionEntity.setQuestionId(questionId);
		return questionEntity;
	}

}
