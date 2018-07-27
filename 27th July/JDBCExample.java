import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	public static Connection getConnection() {
		Connection con;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
			String userName = "scott";
			String pass = "tiger";
			con = DriverManager.getConnection(jdbcURL, userName, pass);
			return con;
		} catch (ClassNotFoundException e1) {
			System.out.println("Unable to find the driver...");
			return null;
		} catch(SQLException e) {
			return null;
		}
	}
	
	public static ResultSet executeQuery(String query, Connection con) throws SQLException {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		return rs;
	}
	
	public static void main(String[] args) {
		Connection con = getConnection();
		try {
			String query = "select account_no, customer_id, initial_deposit from account_info where initial_deposit >= 10000";
			ResultSet rs = executeQuery(query, con);
			while(rs.next()) {
				System.out.println("Account Number is : "+rs.getLong(1)+" Cust_ID is : "+rs.getString(2)+" and initial deposit is : "+rs.getLong(3));
			}
		} catch (SQLException e) {
			
		}
		
	}
}
