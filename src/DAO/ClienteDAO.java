package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Models.ClienteModel;
import Models.GuiaModel;
import Models.LugarModel;

public class ClienteDAO extends GenericDAO{
	
	public ClienteDAO() throws SQLException {
		// Herda construtor da super classe
		super();
		
	}
	
	// Metodo salvar que salva um objeto no banco
	public void salvar(ClienteModel cliente) throws SQLException {
		// Sql para ser preparado para Statement
		String adicionacliente = "INSERT INTO cliente(nome) VALUES(?)";
		
		//salva o objeto no banco
		salvar(adicionacliente,cliente.getNome());
	
		
	}
	
	// Metodo que apaga um objeto do banco
	public void apagar(ClienteModel cliente) throws SQLException {
		// Sql para ser preparado para Statement
		String apagacliente = "DELETE FROM cliente WHERE id_cliente = ?";
		
		//apaga objeto do banco
		apagar(apagacliente,cliente.getId());
	}
	
	// Metodo que altera objeto no banco
	public void alterar(ClienteModel cliente) throws SQLException {
		// Sql para ser preparado para Statement
		String alteracliente = "UPDATE cliente SET id_cliente = ?";
		
		//altera objeto do banco
		alterar(alteracliente,cliente.getId());
	}
	
	public List<ClienteModel> listarCliente() throws SQLException {
		//Instancia da lista de lugares
		List<ClienteModel> listadecliente = new ArrayList<>();
		try {
		//Query de Pesquisa 
		String select = "SELECT * FROM cliente";
		
		//Preparando query para o banco
		PreparedStatement ptsmt = getConnection().prepareStatement(select);
		
		// Criando resultset para percorrer
		ResultSet rs = ptsmt.executeQuery();
		
		//Percorrendo resultset
		while (rs.next()) {
			
			ClienteModel cliente = new ClienteModel();
			GuiaModel guia = new GuiaModel();
			LugarModel lugar = new LugarModel();

			cliente.setNome(rs.getString("nome"));
			guia.setId(rs.getInt("lugar_guia_idguia"));
			lugar.setId(rs.getInt("lugar_idlugar"));
			

			listadecliente.add(cliente);
			listadecliente.add(guia);
			listadecliente.add(lugar);
			
			// fecha conexao resultset
			rs.close();
			// fecha conexao prepareStatement
			ptsmt.close();
			
		}
		
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO no ResultSet cliente "+e);
		}
		
		
		//retorna valores de List<>
		return listadecliente;

	}

}