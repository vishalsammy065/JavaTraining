import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "scott";
		String pass = "tiger";
		try {
			Connection con = DriverManager.getConnection(jdbcURL, userName, pass);
			Statement stmt = con.createStatement();
			//meta data about db
			DatabaseMetaData dmd = con.getMetaData();
			System.out.println(dmd.getDatabaseProductName());
			System.out.println(dmd.getDriverName());
			
			//meta data about tables
			ResultSet rs = stmt.executeQuery("Select * from sailors");
			ResultSetMetaData md = rs.getMetaData();
			System.out.println("No of char : "+md.getColumnCount());
			System.out.println(md.getColumnType(2) == 12 ? "varchar" : "Not Varchar");
			System.out.print(md.getColumnName(2));
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
