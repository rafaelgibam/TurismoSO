package Controllers;

import java.sql.SQLException;
import DAO.LugarDAO;
import Models.LugarModel;

public class LugarController {
	
	public void cadastraLugar(String nome, String datadisponivel) throws SQLException {
		LugarModel lugar = new LugarModel();
		
		lugar.setNome(nome);
		lugar.setDataDisponivel(datadisponivel);

		
		new LugarDAO().salvar(lugar);
	}
	
	public void alterarLugar(int id, String nome, String datadisponivel, int idguia) throws SQLException {
		LugarModel lugar = new LugarModel();
		
		lugar.setId(id);
		lugar.setNome(nome);
		lugar.setDataDisponivel(datadisponivel);
		lugar.getGuia().setId(idguia);
		new LugarDAO().alterar(lugar);
	}
	
	public void apagarCliente(int id) throws SQLException {
		LugarModel lugar = new LugarModel();
		
		lugar.setId(id);
		
		new LugarDAO().apagar(lugar);
	}

}
		