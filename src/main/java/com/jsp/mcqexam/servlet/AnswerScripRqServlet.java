package com.jsp.mcqexam.servlet;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.mcqexam.dto.QuestionDTO;
import com.jsp.mcqexam.service.QuestionService;

@WebServlet("/answerscript/view/list")
public class AnswerScripRqServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setAttribute("questions", findAllQuestions());
			request.getRequestDispatcher("/views/answerScript.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.println(e); 
		}
		
	}
	
	public List<QuestionDTO> findAllQuestions() throws ServletException {
		QuestionService questionService = new QuestionService();
		return questionService.findAllQuestions();
	}

}
