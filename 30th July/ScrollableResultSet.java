import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResultSet {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "scott";
		String pass = "tiger";
		try {
			Connection con = DriverManager.getConnection(jdbcURL, userName, pass);
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE , ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("Select * from Sailors");
			rs.absolute(2);
			//System.out.println(rs.getString(2));
			
			//moving the cursor to end 
			rs.afterLast();
			while(rs.previous()) {
				System.out.println(rs.getString(2));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
		}
	}

}
