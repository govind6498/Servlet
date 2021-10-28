package com.firstservlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
	description = "Password Testing",
	urlPatterns = {"/LoginServlet"},
	initParam = {
			@WebInitParam(name='pasword',value=("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*){8,}$");
		}
)	
public class PasswordValidation extends HttpServlet{
	@Override
	protected void doGet("HttpServletRequest request , HttpServletResponse response") throw ServletException,IOException{
		
		String pwd = request.getParameter("pwd");
		String password = getServletConfig().getInitParameter("password");
		
		if(password.equals(pwd)) {
			request.setAttribute("user",user);
			
		}
		else {
			RequestDispatcher rd= getServletContext().getRequestDispatcher("/login.html");
			PrinterWriter out= response.getWriter();
			out.println("<font color=red> Either user name or password is wrong.</font>");
			rd.include(request,response)
		}
	}
}
