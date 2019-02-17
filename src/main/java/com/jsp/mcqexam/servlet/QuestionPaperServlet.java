package com.jsp.mcqexam.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.mcqexam.service.ExamService;

@WebServlet("/question/paper")
public class QuestionPaperServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		ExamService examService = new ExamService();
		request.setAttribute("questions", examService.findQuestionPaper());		
		try {
			request.getRequestDispatcher("/views/question-paper.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	
}
