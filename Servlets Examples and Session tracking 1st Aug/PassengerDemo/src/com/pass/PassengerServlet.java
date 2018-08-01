package com.pass;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PassengerServlet")
public class PassengerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PassengerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dest = request.getParameter("dest");
		dest = dest.toUpperCase();
		PrintWriter pw = response.getWriter();
		String str1 = "<table border=1>" +
		"<tr>"+
		"<th> First Name </th>"+
		"<th> Second Name </th>"+
		"<th> Source </th>"+
		"<th> Destination </th>"+
		"<th> Gender </th> </tr>";
		pw.println(str1);
		//JDBC code
		DBHelper dbHelper = new DBHelper();
		try {
			ArrayList<PassengerVO> al = dbHelper.getAllPassengers(dest);
			if(al.isEmpty()) {
				pw.println("<tr> <td colspan=5> NO DATA FOUND </td> </tr> </table>");
			} else {
			for(int i = 0 ; i < al.size() ; i++) {
				PassengerVO pvo = al.get(i);
				String str2 = "<tr>"+
				"<td>"+pvo.getFname()+"</td>"+
				"<td>"+pvo.getLname()+"</td>"+
				"<td>"+pvo.getSource()+"</td>"+
				"<td>"+pvo.getDest()+"</td>"+
				"<td>"+pvo.getGender()+"</td>"+
				"</tr>";
				pw.println(str2);
			}
			pw.println("</table>"); }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
