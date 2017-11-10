package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Models.ClienteModel;

public class ClienteDAO {
	
	private Connection connection;
	
	ClienteDAO() throws SQLException{
		// Instancia da Conexão no Construtor.
		this.connection = ConnectionFactory.getConnection();
		
	}
	
	// Metodo adiciona cliente
	
	public void adiciona(ClienteModel cliente) {
		String sql = "INSERT INTO cliente(nome) VALUES(?)";
		
		try {
			//Prepara a Inserção de valor 
			PreparedStatement pstm = connection.prepareStatement(sql); 
			
			//Seta os valores
			pstm.setString(1, cliente.getNome());
			pstm.execute();
			connection.close();
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
	}
	
	public void apaga(ClienteModel cliente) {
			String sql = "DELETE FROM cliente WHERE nome = ?";
			
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
