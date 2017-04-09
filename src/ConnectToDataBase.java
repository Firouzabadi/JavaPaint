import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDataBase {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/Paint";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "golf";

	Connection conn = null;
	Statement stmt = null;

	public void connection() {
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
//			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
//			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
//			System.out.println("Creating statement...");
			stmt = conn.createStatement();

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();

		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
	}
	
	public void closing() {
		try {
			stmt.close();
		    conn.close();
		    System.out.println("GoodBye...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}