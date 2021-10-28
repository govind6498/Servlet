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
	description = "First Letter should Cap",
	initParam = {
			@WebInitParam(name="user",value="^([A-Z]{1}[a-zA-Z]{2,}$"),
		}
)	
public class FirstLetterCap extends HttpServlet{
	@Override
	protected void doGet("HttpServletRequest request , HttpServletResponse response") throw ServletException,IOException{
		@Override
		
		String user = request.getParameter("user");
		
		String userID = getServletConfig().getInitparameter("user");		
		if(userID.equals(user)) {
			request.setAttribute("user",user);

			
		}
		else {
			RequestDispatcher rd= getServletContext().getRequestDispatcher("/login.html");
			PrinterWriter out= response.getWriter();
			out.println("<font color=red> Either user name is wrong.</font>");
			rd.include(request,response)
		}
	}

}
