package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Deloitte2" , 
		initParams = @WebInitParam(name = "Country", value = "India")
		)
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter pw;
	
	@Override
	public void init() throws ServletException {
		super.init();
	}
	
    public Servlet2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		pw = response.getWriter();
		//getting the init-parameter
		pw.println(getInitParameter("Country"));
		
		//getting the context parameter
		String companyName = getServletContext().getInitParameter("Company");
		pw.print(companyName);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
