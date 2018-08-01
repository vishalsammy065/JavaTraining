package com.pass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBHelper {
	
	public ArrayList<PassengerVO> getAllPassengers(String dest) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		ArrayList<PassengerVO> al = new ArrayList<>();
		try {
			String sql = "SELECT * FROM PASSENGERS WHERE DEST = ?";
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, dest);
			ResultSet rs = pst.executeQuery();
			
			//convert this ResultSet into arrayList of objects and return it in servlet
			
			while(rs.next()) {
				String fname = rs.getString(1);
				String lname = rs.getString(2);
				String source = rs.getString(3);
				String destionation = rs.getString(4);
				String gender = rs.getString(5);
				PassengerVO pvo = new PassengerVO();
				pvo.setLname(lname);
				pvo.setFname(fname);
				pvo.setSource(source);
				pvo.setDest(destionation);
				pvo.setGender(gender);
				al.add(pvo);
				
			}
			
			rs.close();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
}
