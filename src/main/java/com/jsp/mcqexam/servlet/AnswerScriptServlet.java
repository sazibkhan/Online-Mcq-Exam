package com.jsp.mcqexam.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.mcqexam.dto.AnswerScriptDTO;
import com.jsp.mcqexam.dto.ParticipantDTO;
import com.jsp.mcqexam.dto.QuestionDTO;
import com.jsp.mcqexam.service.AnswerScriptService;
import com.jsp.mcqexam.service.ParticipantService;
import com.jsp.mcqexam.service.QuestionService;

public class AnswerScriptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		showAllAnswerScript(request, response);
		// ShowAllParticipant(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		saveOrUpdateAnswerScript(request, response);

	}

	public void saveOrUpdateAnswerScript(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AnswerScriptService answerScriptService = new AnswerScriptService();

		AnswerScriptDTO answerScriptDTO = new AnswerScriptDTO();
		answerScriptDTO.setGivenAnswer(request.getParameter("givenAnswer"));
		answerScriptDTO.setSetNo(request.getParameter("setNo"));
		answerScriptDTO.setActiveStatus(1);
		answerScriptDTO.setDateTime(new Date());
		answerScriptDTO.setQuestionId(Long.parseLong(request.getParameter("questionId")));
		answerScriptDTO.setParticipantId(Long.parseLong(request.getParameter("participantId")));
		answerScriptService.saveAnswerScript(answerScriptDTO);

	}

	private void showAllAnswerScript(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AnswerScriptService answerScriptService = new AnswerScriptService();
		List<AnswerScriptDTO> answerScriptDTOList = answerScriptService.findAllAnswerScript();
				
		request.setAttribute("lists", answerScriptDTOList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/answerScript_list.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

/*	private List<QuestionDTO> findAllQuestions() throws ServletException {
		QuestionService questionService = new QuestionService();
		return questionService.findAllQuestions();
	}

	private List<ParticipantDTO> showAllParticipant() throws ServletException {
		ParticipantService participantService = new ParticipantService();
		return participantService.findAllParticipant();

	}*/

}
