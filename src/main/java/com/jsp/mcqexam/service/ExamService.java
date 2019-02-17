package com.jsp.mcqexam.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.mcqexam.dao.AnswerOptionDAO;
import com.jsp.mcqexam.daoImpl.AnswerOptionDAOImpl;
import com.jsp.mcqexam.dto.AnswerOptionDTO;
import com.jsp.mcqexam.entity.AnswerOptionEntriy;

public class ExamService {

	AnswerOptionDAO answerOptionDao;

	public ExamService() {
		answerOptionDao = new AnswerOptionDAOImpl();
	}

	public List<AnswerOptionDTO> findQuestionPaper() {

		List<AnswerOptionEntriy> answers = answerOptionDao.findAllAnswerOptions();

		List<AnswerOptionDTO> answerOptionDTOs = new ArrayList<>();

		for (AnswerOptionEntriy answer : answers) {
			answerOptionDTOs.add(copyAnswerOptionToDTO(answer));
		}

		return answerOptionDTOs;

	}

	public AnswerOptionDTO copyAnswerOptionToDTO(AnswerOptionEntriy answer) {
		AnswerOptionDTO answerOptionDto = new AnswerOptionDTO();
		answerOptionDto.setOptionId(answer.getOptionId());
		answerOptionDto.setOptionLabel(answer.getOptionLabel());
		answerOptionDto.setOptionTitle(answer.getOptionTitle());
		answerOptionDto.setQuestionEntity(answer.getQuestionEntity());
		answerOptionDto.setQuestionId(answer.getQuestionEntity().getQuestionId());
		return answerOptionDto;
	}

}
