package com.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init()
	{
		System.out.println("Init method is invoked by the container");
	}

public void doGet(HttpServletRequest req, HttpServletResponse res ) throws ServletException,IOException
{
	System.out.println("This is get method of my servlet");
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	out.println("<h1>This is get method using dynamic response</h1>");
	out.println("<h1>"+new Date().toString()+"</h1>");
	
	
}
public void destroy()
{
	System.out.println("Destroy method is invoked...!!!");
}
}
