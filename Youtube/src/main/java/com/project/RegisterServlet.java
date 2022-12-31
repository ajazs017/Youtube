package com.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		
		System.out.println("Web container executing the Post Method..!!!");
		res.setContentType("text/Html");
		PrintWriter out = res.getWriter();
		
	out.println("<h1><em><u>Welcome to Qatar-Fifa World Cup 2022</u></em></h1>");
	out.println();
	out.println(new Date().toString());
	
	String p1 = req.getParameter("User_name");
	String p2 = req.getParameter("User_password");
	String p3 = req.getParameter("User_Email");
	String p4 = req.getParameter("User_Gender");
	String p5 = req.getParameter("User_choice");
	String p6 = req.getParameter("condition");
	
	if(p6!=null)
	{
		
	
	if(p6.equals("checked"))
	{
		out.println("<h2> Name: " +p1+"</h2>" );
		out.println("<h2> Password: " +p2+"</h2>" );
		out.println("<h2> Email: " +p3+"</h2>" );
		out.println("<h2> Gender: " +p4+"</h2>" );
		out.println("<h2> Choice: " +p5+"</h2>" );
		
		RequestDispatcher rd = req.getRequestDispatcher("SS");
		rd.forward(req, res);
		
	}
	else
	{
		out.println("<h2>Sorry for the inconvenience..Registration has been Failed..!!</h2>");
		out.println("<h2>Please Try again..!!</h2>");
	}
	}
	else
	{
		out.println("<h2>Sorry for the inconvenience..Registration has been Failed..!!</h2>");
		out.println("<h2>Please Try again..!!</h2>");
		
		//I want to include the output of the index.html
		
		//Creating the object of the requestDispatcher
		
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		
		//Using Include method()
		rd.include(req, res);
	}
		
	}
	
	

}
