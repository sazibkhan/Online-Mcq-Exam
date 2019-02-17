package com.jsp.mcqexam.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.mcqexam.dto.ParticipantDTO;
import com.jsp.mcqexam.service.ParticipantService;

public class ParticipantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		findAllParticipant(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		saveOrUpdateParticipant(request,response);
	}

	public void saveOrUpdateParticipant(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		ParticipantService participantService = new ParticipantService();
		ParticipantDTO participantDTO = new ParticipantDTO();
		participantDTO.setParticipantName(request.getParameter("participantName"));
		participantDTO.setParticipantRoll(Integer.parseInt(request.getParameter("participantRoll")));
		participantDTO.setActiveStatus(1);
		participantDTO.setDateTime(new Date());
		participantService.saveParticipant(participantDTO);
		findAllParticipant(request, response);
		request.getRequestDispatcher("/views/participant_list.jsp").forward(request, response);
	
	}

	public void findAllParticipant(HttpServletRequest request, HttpServletResponse response) {
		ParticipantService questionService = new ParticipantService();
		List<ParticipantDTO> participantDTOList = questionService.findAllParticipant();
		request.setAttribute("participants", participantDTOList);
		try {
			request.getRequestDispatcher("/views/participant_list.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
