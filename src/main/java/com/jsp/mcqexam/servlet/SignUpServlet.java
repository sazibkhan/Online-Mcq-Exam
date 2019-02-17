package com.jsp.mcqexam.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.jsp.mcqexam.dto.LoginUserDTO;
import com.jsp.mcqexam.service.UserLoginService;

public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// findAllQuestions(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		saveOrUpdateSignUp(request, response);
		//saveOrUpdateLogin(request);
	}

	public void saveOrUpdateSignUp(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserLoginService userLoginService = new UserLoginService();
		LoginUserDTO userSignUpDTO = new LoginUserDTO();
		userSignUpDTO.setUserName(request.getParameter("userName"));
		userSignUpDTO.setEmail(request.getParameter("email"));
		userSignUpDTO.setPassword(request.getParameter("password"));
		userSignUpDTO.setNationalId(request.getParameter("nationalId"));
		userSignUpDTO.setPhone(request.getParameter("Phone"));
		userSignUpDTO.setCreateDate(new Date());
		userLoginService.saveSignUpInfo(userSignUpDTO);

	}
	

}
