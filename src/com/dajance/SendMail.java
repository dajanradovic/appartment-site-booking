package com.dajance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendMail extends HttpServlet {
	
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws  IOException {
		
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		
		
		String to = "dajo1986@gmail.com";
		String user = "dajo1986";
		String pass = "enanoa2014";
		String msg = "proba maila ako salje odlicno";
		
		String sub = "proba";
		
		Mailer pf = new Mailer();
		pf.send(to, sub, msg, user, pass);
		
		 out.println("Mail send successfully");
		
	}

}
