package com.jsp.mcqexam.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.jsp.mcqexam.dao.AnswerOptionDAO;
import com.jsp.mcqexam.daoImpl.AnswerOptionDAOImpl;
import com.jsp.mcqexam.dto.AnswerOptionDTO;
import com.jsp.mcqexam.dto.QuestionDTO;
import com.jsp.mcqexam.entity.AnswerOptionEntriy;
import com.jsp.mcqexam.entity.QuestionEntity;

public class ExamService {

	AnswerOptionDAO answerOptionDao;

	public ExamService() {
		answerOptionDao = new AnswerOptionDAOImpl();
	}

	public Map<String, List<AnswerOptionDTO>> findQuestionPaper() {

		List<AnswerOptionEntriy> answers = answerOptionDao.findAllAnswerOptions();
		
		List<AnswerOptionEntriy> answers1 = new ArrayList<>();
		
		List<AnswerOptionEntriy> answers2 = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			
			if(i<answers.size()) {
				answers1.add(answers.get(i)); 	
			}			
		}
		
		for(int i=10; i<20; i++) {
			
			if(i<answers.size()) {
			answers2.add(answers.get(i));
			}
		}
		
		List<AnswerOptionDTO> answerOptionDTOs1 = new ArrayList<>();
		
		List<AnswerOptionDTO> answerOtionDTOs2 = new ArrayList<>();
		
		for (AnswerOptionEntriy answer : answers1) {
			answerOptionDTOs1.add(copyAnswerOptionToDTO(answer, answers));
		}
		
		for (AnswerOptionEntriy answer : answers2) {
			answerOtionDTOs2.add(copyAnswerOptionToDTO(answer, answers));
		}
		
		Map<String, List<AnswerOptionDTO>> map = new HashMap<>();
		
		map.put("questions1", answerOptionDTOs1);
		map.put("questions2", answerOtionDTOs2);		

		return map;
	}

	public AnswerOptionDTO copyAnswerOptionToDTO(AnswerOptionEntriy answer, List<AnswerOptionEntriy> options) {
		AnswerOptionDTO answerOptionDto = new AnswerOptionDTO();
		answerOptionDto.setOptionId(answer.getOptionId());
		answerOptionDto.setOptionLabel(answer.getOptionLabel());
		answerOptionDto.setOptionTitle(answer.getOptionTitle());

		List<AnswerOptionEntriy> singeQuestionAnswerOptions = options.stream().filter(
				option -> option.getQuestionEntity().getQuestionId().equals(answer.getQuestionEntity().getQuestionId()))
				.collect(Collectors.toList());

		QuestionDTO questionDTO = new QuestionDTO();
		questionDTO.setOptionEntites(singeQuestionAnswerOptions);
		questionDTO.setQuestionName(answer.getQuestionEntity().getQuestionName());
		questionDTO.setQuestionId(answer.getQuestionEntity().getQuestionId());
		answerOptionDto.setQuestionDTO(questionDTO);

		return answerOptionDto;
	}

}
