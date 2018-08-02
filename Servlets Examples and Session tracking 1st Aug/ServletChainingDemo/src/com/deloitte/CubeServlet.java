package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CubeServlet")
public class CubeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public CubeServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		int no = Integer.parseInt(request.getParameter("value"));
		int cube = no * no * no;
		int sq = (int) request.getAttribute("sq");
		pw.println("<h1>Your no. is : "+no+"<br>"+"Square is : "+sq+"<br>Cube is : "+ cube+"</h1>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
