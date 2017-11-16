package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {
	
	public static Connection getConnection() throws SQLException{
		
		Connection conexao = null;
		
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/turismoso","root","root");
			System.out.println("Conexão com o banco bem sucedida!");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return conexao;
		
	}
	
	
	
}
