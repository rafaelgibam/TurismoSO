package factory;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			DriverManager.getConnection("jdbc:mysql://localhost/turismoso","root","");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
