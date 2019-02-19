package com.jsp.mcqexam.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.mcqexam.dao.QuestionDAO;
import com.jsp.mcqexam.dto.QuestionDTO;
import com.jsp.mcqexam.entity.QuestionEntity;
import com.jsp.mcqexam.service.QuestionService;

public class QuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		findAllQuestions(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		saveOrUpdateQuestion(request, response);
	}
//save
	public void saveOrUpdateQuestion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		QuestionService questionService = new QuestionService();
		QuestionDTO questionDTO = new QuestionDTO();
		questionDTO.setQuestionName(request.getParameter("questionName"));
		questionDTO.setQuestionAnswer(request.getParameter("questionAnswer"));
		questionDTO.setQuestionSetNo(request.getParameter("questionSetNo"));
		questionDTO.setActiveStatus(1);
		questionDTO.setDateTime(new Date());
		questionService.saveQuestion(questionDTO);
		findAllQuestions(request, response);
		try {
			request.getRequestDispatcher("/views/question_list.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//view
	public void findAllQuestions(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		QuestionService questionService = new QuestionService();
		List<QuestionDTO> questionDTO = questionService.findAllQuestions();
		request.setAttribute("questions", questionDTO);
		try {
			request.getRequestDispatcher("/views/question_list.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	

}
