package com.jsp.mcqexam.servlet;

import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.mcqexam.dto.AnswerOptionDTO;
import com.jsp.mcqexam.service.ExamService;

@WebServlet("/question/paper")
public class QuestionPaperServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		ExamService examService = new ExamService();
		
		Map<String, List<AnswerOptionDTO>> map = examService.findQuestionPaper();
		
		List<AnswerOptionDTO> list1 =  map.get("questions1");
		
		List<AnswerOptionDTO> list2 =  map.get("questions2");
		
		request.setAttribute("questions1", list1);  
		
		for(AnswerOptionDTO dto : list1) {
			System.out.println(dto.getOptionLabel()); 
		}
		
		request.setAttribute("questions2",list2);  
		
		for(AnswerOptionDTO dto : list2) {
			System.out.println(dto.getOptionLabel()); 
		}
		
		
		try {
			request.getRequestDispatcher("/views/question-paper.jsp").forward(request, response);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
