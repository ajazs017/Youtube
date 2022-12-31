package com.Booking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class book1
 */
@WebServlet("/book1")
public class book1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Servlet S1 </title>");
		out.println("<head>");
		
		
		String a = request.getParameter("N1");
		String b = request.getParameter("N2");
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		//Adding the above Numbers
		
		int c = a1+b1;
		
		request.setAttribute("sum", c);
		
		//Request Dispatcher
		
		RequestDispatcher rd = request.getRequestDispatcher("book3");
		
		out.println("</body>");
		out.println("</html>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
