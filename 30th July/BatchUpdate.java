import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdate {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "scott";
		String pass = "tiger";
		try {
			Connection con = DriverManager.getConnection(jdbcURL, userName, pass);
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO SAILORS VALUES (?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 101);
			pstmt.setString(2, "Katy Perry");
			pstmt.addBatch();
			
			//2nd set of data
			pstmt.setInt(1, 102);
			pstmt.setString(2, "Perry The Platypus");
			pstmt.addBatch();
			pstmt.executeBatch();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
