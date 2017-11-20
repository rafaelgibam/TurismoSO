package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Models.LugarModel;

public class LugarDAO extends GenericDAO {

	public LugarDAO() throws SQLException {
		// Herda construtor da super classe
		super();
	}

	// Metodo salvar que salva um objeto no banco
	public void salvar(LugarModel lugar) throws SQLException {
		
		// Sql para ser preparado para Statement
		String adicionalugar = "INSERT INTO lugar(nome,data_disponivel) VALUES(?,?)";
		
		// salva o objeto no banco
		salvar(adicionalugar, lugar.getNome(), lugar.getDataDisponivel(),lugar.getGuia().getId());
		
	}

	// Metodo que apaga um objeto do banco
	public void apagar(LugarModel lugar) throws SQLException {
		// Sql para ser preparado para Statement
		String apagalugar = "DELETE FROM lugar WHERE idlugar = ?";

		// apaga objeto do banco
		apagar(apagalugar, lugar.getId());
	}

	// Metodo que altera objeto no banco
	public void alterar(LugarModel lugar) throws SQLException {
		// Sql para ser preparado para Statement
		String alteralugar = "UPDATE lugar SET nome = ?, endereco = ?, data_disponivel = ?, guia_idguia = ? WHERE id_lugar = ?";

		// altera objeto do banco
		alterar(alteralugar, lugar.getId());
	}

	public List<LugarModel> listarLugar() throws SQLException {
		// Instancia da lista de lugares
		List<LugarModel> listadelugar = new ArrayList<>();

		// Query de Pesquisa.
		String sql = "SELECT idlugar,lugar.nome,data_disponivel,guia.nome FROM lugar INNER JOIN guia ON lugar.idlugar = guia.idguia";

		// Preparando query para o banco
		PreparedStatement ptsmt = getConnection().prepareStatement(sql);

		// Criando resultset para percorrer
		ResultSet rs = ptsmt.executeQuery();

		// Percorrendo resultset
		while (rs.next()) {

			LugarModel lugar = new LugarModel();

			lugar.setId(rs.getInt("idlugar"));
			lugar.setNome(rs.getString("nome"));
			lugar.setDataDisponivel(rs.getString("data_disponivel"));
			lugar.setGuiaNome((rs.getString("guia.nome")));

			listadelugar.add(lugar);
		}
		// fecha conexao resultset
		rs.close();
		// fecha conexao prepareStatement
		ptsmt.close();

		// retorna valores de List<>
		return listadelugar;

	}
	
	


}