package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Models.ClienteModel;
import Models.GuiaModel;

public class GuiaDAO {
	private Connection connection;
	
	GuiaDAO() throws SQLException{
		// Instancia da Conexão no Construtor.
		this.connection = ConnectionFactory.getConnection();
		
	}
	
	// Metodo adiciona cliente
	
	public void adiciona(GuiaModel guia) {
		String sql = "INSERT INTO guia (nome,valor_hora) VALUES(?,?)";
		
		try {
			//Prepara a Inserção de valor 
			PreparedStatement pstm = connection.prepareStatement(sql); 
			
			//Seta os valores
			pstm.setString(1, guia.getNome());
			pstm.setDouble(1, guia.getValorHora());
			pstm.execute();
			connection.close();
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
	}
	
	public void apaga(GuiaModel guia) {
			String sql = "DELETE FROM guia WHERE nome = ?";
			
			try {
				//Prepara a Inserção de valor 
				PreparedStatement pstm = connection.prepareStatement(sql); 
				
				//Seta os valores
				pstm.setString(1,guia.getNome());
				pstm.execute();
				connection.close();
				
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
	}
	
	public void altera(ClienteModel cliente) {
		String sql = "UPDATE cliente SET nome = ?";
		
		try {
			//Prepara a Inserção de valor 
			PreparedStatement pstm = connection.prepareStatement(sql); 
			
			//Seta os valores
			pstm.setString(1,cliente.getNome());
			pstm.execute();
			connection.close();
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
}
}
