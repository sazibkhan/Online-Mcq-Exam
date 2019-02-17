package com.jsp.mcqexam.servlet;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.mcqexam.dto.AnswerOptionDTO;
import com.jsp.mcqexam.dto.QuestionDTO;
import com.jsp.mcqexam.service.AnswerOptionService;
import com.jsp.mcqexam.service.QuestionService;

public class AnswerOptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		ShowAllQuestions(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		saveOrUpdateAnswerOption(request, response);
	}

	public void saveOrUpdateAnswerOption(HttpServletRequest request, HttpServletResponse response) {
		AnswerOptionService answerOptionService = new AnswerOptionService();

		AnswerOptionDTO answerOptionDTO = new AnswerOptionDTO();
		answerOptionDTO.setOptionLabel(request.getParameter("optionLabel"));
		answerOptionDTO.setOptionTitle(request.getParameter("optionTitle"));
		answerOptionDTO.setQuestionId(Long.parseLong(request.getParameter("questionId")));
		answerOptionService.saveOrUpdateAnswerOption(answerOptionDTO);
	}

	private void ShowAllQuestions(HttpServletRequest request, HttpServletResponse response) {
		QuestionService questionService = new QuestionService();
		List<QuestionDTO> questionDTOs = questionService.findAllQuestions();
		request.setAttribute("questionDTOs", questionDTOs);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/answer_option.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
