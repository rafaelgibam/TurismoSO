package Controllers;

import java.sql.Date;
import java.sql.SQLException;
import DAO.LugarDAO;
import Models.LugarModel;

public class LugarController {
	
	public void cadastraLugar(String nome, String endereco, Date datadisponivel) throws SQLException {
		LugarModel lugar = new LugarModel();
		
		lugar.setNome(nome);
		lugar.setEndereco(endereco);
		lugar.setDataDisponivel(datadisponivel);
		
		new LugarDAO().salvar(lugar);
	}
	
	public void alterarLugar(int id, String nome, String endereco, Date datadisponivel ) throws SQLException {
		LugarModel lugar = new LugarModel();
		
		lugar.setId(id);
		lugar.setNome(nome);
		lugar.setEndereco(endereco);
		lugar.setDataDisponivel(datadisponivel);
		
		
		new LugarDAO().alterar(lugar);
	}
	
	public void apagarCliente(int id) throws SQLException {
		LugarModel lugar = new LugarModel();
		
		lugar.setId(id);
		
		new LugarDAO().apagar(lugar);
	}
	
	public void listarLugar() throws SQLException {
		LugarDAO lugar = new LugarDAO();
		
		lugar.listarLugar();
		
	}
}
		