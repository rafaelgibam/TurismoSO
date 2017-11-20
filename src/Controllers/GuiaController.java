package Controllers;

import java.sql.SQLException;
import DAO.GuiaDAO;
import Models.GuiaModel;

public class GuiaController {
	
	public void cadastraGuia(String nome, Double valorhora) throws SQLException {
		GuiaModel guia = new GuiaModel();
		
		guia.setNome(nome);
		guia.setValorHora(valorhora);
		
		new GuiaDAO().salvar(guia);
	}
	
	public void alterarGuia(int id, String nome, Double valorhora) throws SQLException {
		GuiaModel guia = new GuiaModel();
		
		guia.setId(id);
		guia.setNome(nome);
		guia.setValorHora(valorhora);
		
		
		new GuiaDAO().alterar(guia);
	}
	
	public void apagarGuia(int id) throws SQLException {
		GuiaModel guia = new GuiaModel();
		
		guia.setId(id);
		
		new GuiaDAO().apagar(guia);
	}
	
	
	
}
