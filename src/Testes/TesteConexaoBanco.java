package Testes;



import java.sql.SQLException;

import DAO.ConnectionFactory;

public class TesteConexaoBanco {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory con = new ConnectionFactory();
		con.getConnection();

	}

}
