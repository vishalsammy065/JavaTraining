import java.io.ObjectInputStream.GetField;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "scott";
		String pass = "tiger";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try {
			Connection con = DriverManager.getConnection(jdbcURL, userName, pass);
			//output = call BIG1(val1 , val2)
			String sql = "{?=call BIG1(?,?)}";
			CallableStatement cstmt = con.prepareCall(sql);
			
			//register the datatype for out parameter
			cstmt.registerOutParameter(1, Types.INTEGER);

			//provide the int parameter
			cstmt.setInt(2, 2500);
			cstmt.setInt(3, 300);
			
			
			//getting the result
			cstmt.execute() ;
			System.out.println("Result is : " + cstmt.getInt(1));
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
