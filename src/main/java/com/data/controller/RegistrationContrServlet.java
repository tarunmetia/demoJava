package com.data.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.data.Dao.RegstrationDao;
import com.data.model.RegistrationVarModel;


@WebServlet("/register")
public class RegistrationContrServlet extends HttpServlet {
	private RegstrationDao regDao = new RegstrationDao();

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher rd = request.getRequestDispatcher("/LoginRegistrationMaven/src/main/webapp/Reg.jsp");
//		rd.forward(request, response);
//	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		RegistrationVarModel regModelVar = new RegistrationVarModel();
		regModelVar.setFname(fname);
		regModelVar.setLname(lname);
		regModelVar.setEmail(email);
		regModelVar.setUname(uname);
		regModelVar.setPwd(pwd);
		int i = regDao.RegisterEmpl(regModelVar);
		if (i > 0) {
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("Error", "error");
			 response.sendRedirect("Reg.jsp");
		}
	}

}
