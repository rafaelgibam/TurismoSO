package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Models.GuiaModel;

public class GuiaDAO extends GenericDAO {

	public GuiaDAO() throws SQLException {
		// Herda construtor da super classe
		super();

	}

	// Metodo salvar que salva um objeto no banco
	public void salvar(GuiaModel guia) throws SQLException {
		// Sql para ser preparado para Statement
		String adicionaguia = "INSERT INTO guia(nome,valor_hora) VALUES(?,?)";

		// salva o objeto no banco
		salvar(adicionaguia, guia.getNome(), guia.getValorHora());
	}

	// Metodo que apaga um objeto do banco
	public void apagar(GuiaModel guia) throws SQLException {
		// Sql para ser preparado para Statement
		String apagaguia = "DELETE FROM guia WHERE id_guia = ?";

		// apaga objeto do banco
		apagar(apagaguia, guia.getId());
	}

	// Metodo que altera objeto no banco
	public void alterar(GuiaModel guia) throws SQLException {
		// Sql para ser preparado para Statement
		String alteraguia = "UPDATE guia SET id_guia = ?";

		// altera objeto do banco
		alterar(alteraguia, guia.getId());
	}

	public List listarGuia() throws SQLException {
		// Instancia da lista de lugares
		List listadeguia = new ArrayList();

		// Query de Pesquisa
		String select = "SELECT * FROM guia";

		// Preparando query para o banco
		PreparedStatement ptsmt = getConnection().prepareStatement(select);

		// Criando resultset para percorrer
		ResultSet rs = ptsmt.executeQuery();

		// Percorrendo resultset
		while (rs.next()) {

			GuiaModel guia = new GuiaModel();

			guia.setId(rs.getInt("id_guia"));
			guia.setNome(rs.getString("nome"));
			guia.setValorHora(rs.getDouble("valor_hora"));

			listadeguia.add(guia);
		}
		
		// fecha conexao resultset
		rs.close();
		
		// fecha conexao prepareStatement
		ptsmt.close();

		// retorna valores de List<>
		return listadeguia;

	}

}