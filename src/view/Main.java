package view;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import factory.ConnectionFactory;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/turismoso","root","");
		conn.close();
		
		new TelaInicial();

	}

}
