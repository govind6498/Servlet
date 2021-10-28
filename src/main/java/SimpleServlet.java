package com.firstservlet;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import.io.IOException

@WebServlet("/Hello")
public class SimpleServlet extends HttpServlet{

	@Override
	protected void doGet("HttpServletRequest req , HttpServletResponse response") throw ServletException,IOException{
		response.setContenttype("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>Hello Wolrd Govind My First Servlet!</h3>");
		out.close();
	}
	
}
