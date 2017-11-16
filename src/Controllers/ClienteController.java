package Controllers;

import java.sql.SQLException;

import DAO.ClienteDAO;
import Models.ClienteModel;

public class ClienteController {
	
	public void cadastraCliente(String nome) throws SQLException {
		ClienteModel cliente = new ClienteModel();
		
		cliente.setNome(nome);
		
		new ClienteDAO().salvar(cliente);
	}
	
	public void alterarCliente(int id, String nome) throws SQLException {
		ClienteModel cliente = new ClienteModel();
		
		cliente.setId(id);
		cliente.setNome(nome);
		
		new ClienteDAO().alterar(cliente);
	}
	
	public void apagarCliente(int id) throws SQLException {
		ClienteModel cliente = new ClienteModel();
			
		cliente.setId(id);
		
		new ClienteDAO().apagar(cliente);
	}
	
	public void listarCliente() throws SQLException {
		
		ClienteDAO cliente = new ClienteDAO();
		
		cliente.listarCliente();
		
	}
	
	
	
}