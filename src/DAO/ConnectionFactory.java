package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException{
		
		Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/turismoso","root","");
			System.out.println("Conexao Aberta!");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			conexao.close();
		}
		
		return conexao;
		
	}
	
	
	
}
