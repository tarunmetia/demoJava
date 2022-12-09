package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.data.model.LogInVar;

@WebServlet("/LogInAction")
public class LogInServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		syso
		System.out.println("test");
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		LogInDao LogInDao1 = new LogInDao();
		LogInVar l1 = LogInDao1.getLogInVar(uname, pwd);
		request.setAttribute("uname", l1);
		HttpSession s=request.getSession();
		s.setAttribute("uname",l1);
		RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request, response);
	}

}
