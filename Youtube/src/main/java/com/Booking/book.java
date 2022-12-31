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
 * Servlet implementation class book
 */
@WebServlet(name = "book3", urlPatterns = { "/book3" })
public class book extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Servlet S2 </title>");
		out.println("<head>");
		
		int a1 = Integer.parseInt(request.getParameter("a"));
		int b1 = Integer.parseInt(request.getParameter("b"));
		
		//Adding the above Numbers
		
		int c1 = a1*b1;
		
		int sum = (int) request.getAttribute("sum");
		
		out.println("<h1>");
		
	out.println("Sum is "+sum);
	out.println("Product is "+c1);
		out.println("</h1>");
		
		//Request Dispatcher
		
		RequestDispatcher rd = request.getRequestDispatcher("book3");
		
		out.println("</body>");
		out.println("</html>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
