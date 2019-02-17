package com.jsp.mcqexam.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.mcqexam.entity.LoginUser;
import com.jsp.mcqexam.service.UserLoginService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	LoginUser loginUser;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 checkPassword( request,  response);
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doLogin(request, response);
	}

	public void doLogin(HttpServletRequest request, HttpServletResponse response) {
		String userEmail = request.getParameter("email");
		UserLoginService service = new UserLoginService();
		loginUser = service.findLoginUserByEamil(userEmail);
		try {
			if (loginUser != null) {
				request.getRequestDispatcher("/password.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/userLogin.jsp").forward(request, response);
			}
		} catch (Exception e) {

		}
	}
	
	public void checkPassword(HttpServletRequest request, HttpServletResponse response) {
		String pass = request.getParameter("password");
		try {
			if (loginUser.getPassword().equals(pass)) {
				request.getRequestDispatcher("/home.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/userLogin.jsp").forward(request, response);
			}
		} catch (Exception e) {

		}
		
	}
	

}
