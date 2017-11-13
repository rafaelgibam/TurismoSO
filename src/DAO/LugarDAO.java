package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.LugarModel;

public class LugarDAO extends GenericDAO {

	protected LugarDAO() throws SQLException {
		// Herda construtor da super classe
		super();

	}

	// Metodo salvar que salva um objeto no banco
	public void salvar(LugarModel lugar) throws SQLException {
		// Sql para ser preparado para Statement
		String adicionalugar = "INSERT INTO lugar(nome,endereco,data_disponivel) VALUES(?,?,?)";

		// salva o objeto no banco
		salvar(adicionalugar, lugar.getNome(), lugar.getEndereco(), lugar.getDataDisponivel());
	}

	// Metodo que apaga um objeto do banco
	public void apagar(LugarModel lugar) throws SQLException {
		// Sql para ser preparado para Statement
		String apagalugar = "DELETE FROM lugar WHERE id_lugar = ?";

		// apaga objeto do banco
		apagar(apagalugar, lugar.getId());
	}

	// Metodo que altera objeto no banco
	public void alterar(LugarModel lugar) throws SQLException {
		// Sql para ser preparado para Statement
		String alteralugar = "UPDATE cliente SET id_lugar = ?";

		// altera objeto do banco
		alterar(alteralugar, lugar.getId());
	}

	public List listarLugar() throws SQLException {
		//Instancia da lista de lugares
		List listadelugar = new ArrayList();
		
		//Query de Pesquisa 
		String select = "SELECT * FROM lugar";
		
		//Preparando query para o banco
		PreparedStatement ptsmt = getConnection().prepareStatement(select);
		
		// Criando resultset para percorrer
		ResultSet rs = ptsmt.executeQuery();
		
		//Percorrendo resultset
		while (rs.next()) {
			
			LugarModel lugar = new LugarModel();

			lugar.setId(rs.getInt("id_lugar"));
			lugar.setNome(rs.getString("nome"));
			lugar.setEndereco(rs.getString("endereco"));
			lugar.setDataDisponivel(rs.getDate("data_disponivel"));

			listadelugar.add(lugar);
		}
		// fecha conexao resultset
		rs.close();
		// fecha conexao prepareStatement
		ptsmt.close();
		
		//retorna valores de List<>
		return listadelugar;

	}

}
