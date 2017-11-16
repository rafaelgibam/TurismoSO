package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class GenericDAO {
	
	private Connection connection;

	protected GenericDAO() throws SQLException {

		this.connection = ConnectionFactory.getConnection();

	}
	
	protected Connection getConnection() {

		return connection;

	}

	protected void salvar(String insertSQL, Object... parametros) throws SQLException {

		PreparedStatement pstmt = getConnection().prepareStatement(insertSQL);
		
		for (int i = 0; i < parametros.length; i++) {	

			pstmt.setObject(i + 1, parametros[i]);

		}
		
		pstmt.execute();
		
		pstmt.close();

	}

	protected void alterar(String updateSQL, Object id, Object ...parametros) throws SQLException {

		PreparedStatement pstmt = getConnection().prepareStatement(updateSQL);
		
		for(int i =0;i<parametros.length;i++) {
			
		pstmt.setObject(i+1,parametros[i]);	
			
		}

		pstmt.setObject(parametros.length+1,id);
		
		pstmt.execute();
		System.out.println("Alterou!!!");
		pstmt.close();
	
	}

	protected void apagar(String deleteSQL,Object id,Object... parametros) throws SQLException {
		
		PreparedStatement pstmt = getConnection().prepareStatement(deleteSQL);
		
		pstmt.setObject(parametros.length+1,id);

		pstmt.execute();
		System.out.println("Apagou!!!");
		pstmt.close();
			
	}
	
	
}
