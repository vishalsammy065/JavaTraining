import java.sql.*;
public class JDBCDemo {
	
	/*types of drivers
	 * 1. Bridge
	 * 2. Native
	 * 3. Middleware
	 * 4. Pure Java*/
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.out.println("Unable to find the driver...");
		}
		
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "scott";
		String pass = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(jdbcURL, userName, pass);
			Statement stmt = con.createStatement(); 
			
			//Querying a table
			String query = "select account_no, customer_id, initial_deposit from account_info where initial_deposit >= 10000";
			ResultSet rs = stmt.executeQuery(query );  
			System.out.println("Simple Query..");
			while(rs.next()) {
				System.out.println("Account Number is : "+rs.getLong(1)+" Cust_ID is : "+rs.getString(2)+" and initial deposit is : "+rs.getLong(3));
			}
			rs.close();
			//inserting into table
			String insertQuery = "INSERT INTO Sailors VALUES (11, 'Aman')";
			stmt.executeQuery(insertQuery);
			
			//deleting from a table 
			String deleteQuery = "DELETE FROM Sailors WHERE SID = 11";
			stmt.execute(deleteQuery);
			
			//join statements
			String joinQuery = "SELECT CUSTOMER_ID,ACCOUNT_TYPE,ACCOUNT_NO,BANK_NAME FROM BANK_INFO,ACCOUNT_INFO WHERE BANK_INFO.IFSC_CODE=ACCOUNT_INFO.IFSC_CODE";
			rs = stmt.executeQuery(joinQuery);
			System.out.println("\nJoin Query...");
			while (rs.next()) {
				System.out.println("Cust_id : "+rs.getString(1)+" Account_type is : "+rs.getString(2) + " Account_No is : "+rs.getLong(3)+" and Bank Name is : "+rs.getString(4));
			}
			
			//DDL statment
			String dropDataBaseTable = "DROP TABLE XY";
			boolean isDeleted = stmt.execute(dropDataBaseTable);
			if(!isDeleted)
				System.out.println("\nTable deleted");
			rs.close();
			stmt.close();
			con.commit();
			con.close();
			
		} catch (SQLException e) {
			String errmsg = e.getMessage();
			if (errmsg.contains("ORA-00942"))
				System.out.println("\nTable not found");
		}
	}
}
