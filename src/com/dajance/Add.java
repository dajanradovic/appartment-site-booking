package com.dajance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet{
	
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String a = req.getParameter("username");
		String b = req.getParameter("password");
		if (a.equals("dajan") && b.equals("radovic")) {
		res.sendRedirect("guestmanagement.html");}
		
		else {
			
		PrintWriter out = res.getWriter();
		out.println("Wrong username or password, please try again");
			
		
		}
		
		
	}

}
