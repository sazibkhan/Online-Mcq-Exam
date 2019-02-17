package com.jsp.mcqexam.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.mcqexam.dao.QuestionDAO;
import com.jsp.mcqexam.daoImpl.QuestionDAOImpl;
import com.jsp.mcqexam.dto.QuestionDTO;
import com.jsp.mcqexam.entity.QuestionEntity;

public class QuestionService {

	public QuestionDAO questionDAO;

	public QuestionService() {
		questionDAO = new QuestionDAOImpl();

	}

	public void saveQuestion(QuestionDTO questionDTO) {
		questionDAO.saveOrUpdateQuestion(copyDtoToEntity(questionDTO));
	}

	// Save Method
	public QuestionEntity copyDtoToEntity(QuestionDTO questionDTO) {
		QuestionEntity questionEntity = new QuestionEntity();
		questionEntity.setQuestionName(questionDTO.getQuestionName());
		questionEntity.setQuestionAnswer(questionDTO.getQuestionAnswer());
		questionEntity.setQuestionSetNo(questionDTO.getQuestionSetNo());
		questionEntity.setActiveStatus(questionDTO.getActiveStatus());
		questionEntity.setDateTime(questionDTO.getDateTime());
		return questionEntity;

	}

	// view list
	public List<QuestionDTO> findAllQuestions() {
		List<QuestionEntity> questionEntitiesList = new ArrayList<>();
		List<QuestionDTO> questionDTOsList = new ArrayList<>();
		questionEntitiesList = questionDAO.findAllQuestions();
		
		for (QuestionEntity question : questionEntitiesList) {
			System.out.println("mcq Queries: " + question.getQuestionName());
			questionDTOsList.add(copyEntityToDto(question));
		}
		return questionDTOsList;

	}

	// View List Method
	public QuestionDTO copyEntityToDto(QuestionEntity questionEntity) {
		QuestionDTO questionDTO = new QuestionDTO();
		questionDTO.setQuestionId(questionEntity.getQuestionId());
		questionDTO.setQuestionName(questionEntity.getQuestionName());
		questionDTO.setQuestionAnswer(questionEntity.getQuestionAnswer());
		questionDTO.setQuestionSetNo(questionEntity.getQuestionSetNo());
		questionDTO.setActiveStatus(questionEntity.getActiveStatus());
		questionDTO.setDateTime(questionEntity.getDateTime());
		return questionDTO;

	}

	// Update/Edit
	public void updateQuestion(QuestionDTO questionDTO) {
		questionDAO.saveOrUpdateQuestion(copyDtoToEntity(questionDTO));

	}

	// edit
	public QuestionDTO findQuestionEntityById(Long questionId) {
		QuestionDAO questionDAO = new QuestionDAOImpl();
		QuestionEntity questionEntity = new QuestionEntity();
		questionDAO.findQuestionEntityById(questionId);
		return copyEntityToDto(questionEntity);

	}

	// delete
	public void deleteQuestion(Long questionId) {
		QuestionEntity questionEntity = new QuestionEntity();
		questionEntity.setQuestionId(questionId);
		questionDAO.deleteQuestionEntity(questionEntity);
	}

}
