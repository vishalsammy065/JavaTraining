import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStmtDemo {
	public static void main(String[] ars) throws ClassNotFoundException, IOException {
		String name = "";
		int id = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		name = br.readLine();
		id = Integer.parseInt(br.readLine());
		Class.forName("oracle.jdbc.OracleDriver");
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "scott";
		String pass = "tiger";
		try {
			Connection con = DriverManager.getConnection(jdbcURL, userName, pass);
			//dynamic sql
			String sql = "INSERT INTO SAILORS VALUES (?, ?)";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.setString(2, name);
			System.out.println("No. of rows affected.. "+pstm.executeUpdate());
			
			//deleting
			String deleteSQL = "DELETE FROM SAILORS WHERE SID = ?";
			int sidToDelete = Integer.parseInt(br.readLine());
			PreparedStatement psmt = con.prepareStatement(deleteSQL);
			psmt.setInt(1, sidToDelete);
			System.out.println("Deleting row with sid : "+sidToDelete+".. "+psmt.executeUpdate()+" rows affected..");
		} catch (SQLException e) {
			System.out.println(e.getMessage()); 
		}
	}
}
