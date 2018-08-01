package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieExample")
public class CookieExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public CookieExample() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		response.setContentType("text/html");
		Cookie[] allCookies = request.getCookies();
		PrintWriter pw = response.getWriter();
		if(allCookies == null) {
			Cookie c = new Cookie("location", "Banglore");
			c.setMaxAge(24*60*60); //one day
			response.addCookie(c);
			pw.println("<body bgcolor='yellow'> Welcome to my site for the first time...! </body>");;
		} else {
			pw.print("Welcome back user<br>");
			for(Cookie c : allCookies) {
				pw.println("<body bgcolor='pink'>"+c.getName()+" is : "+c.getValue()+"</body>");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
