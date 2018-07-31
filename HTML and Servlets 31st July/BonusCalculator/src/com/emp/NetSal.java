package com.emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NetSal")
public class NetSal extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public NetSal() {
        super();
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		double netSal = 0, bonus = 0;
		String name = request.getParameter("name");
		int salary = Integer.parseInt(request.getParameter("sal"));
		String grade = request.getParameter("grade");
		if(salary > 100000 && grade.equals("A")) {
			bonus = (salary * 0.05);
			netSal = bonus + salary - (0.25*salary);
		} else if (salary < 100000 && salary > 50000 && grade.equals("B")) {
			bonus = (salary * 0.07);
			netSal = bonus + salary - (0.25*salary);
		} else if (salary < 50000 && grade.equals("C")) {
			bonus = (salary * 0.2);
			netSal = bonus + salary - (0.25*salary);
		} else {
			netSal = 0;
		}
		response.setContentType("text/html");
		String strTable = " <br><center><table border=1>\r\n" + 
				"  <tr>\r\n" + 
				"    <th>Emp Name</th>\r\n" + 
				"    <th>Basic Salary</th> \r\n" + 
				"    <th>Bonus</th>\r\n" + 
				"    <th>Net Salary</th>\r\n" + 
				"  </tr>";
		String strData = "<tr>\r\n" + 
				"    <td>"+name+"</td>\r\n" + 
				"    <td>"+salary+"</td> \r\n" + 
				"    <td>"+bonus+"</td>\r\n" + 
				"    <td>"+netSal+"</td>\r\n" +
				"  </tr> </table> </center>";
		
		pw.println(strTable+strData);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
