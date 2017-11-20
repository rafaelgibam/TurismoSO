package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.swing.table.AbstractTableModel;

public class ClienteTableModel extends AbstractTableModel {

	private List<GuiaModel> dadosguia = new ArrayList<>();
	private List<LugarModel> dadoslugar = new ArrayList<>();
 	private List<ClienteModel> dadosclientes = new ArrayList<>();
	private String[] colunas = {"Nome do Cliente","Guia","Lugar","Data"};
	
	/* Pega nome para adiociona no topo das colunas 
	* @return coluna
	*/
	@Override
	public String getColumnName(int coluna) {
		
		return colunas[coluna];
	}
	/* Pega a quantidade de linha da tabela 
	* @return dadosclientes.size()
	*/
	@Override
	public int getRowCount() {
		
		return dadosclientes.size();

	}
	
	/* Pega a quantidade de coluna  
	* @return colunas.length
	*/
	@Override
	public int getColumnCount() {
		return colunas.length;
	}
	
	/* Pega os valores das colunas para adiciona na linha
	* @return dados para linhas
	*/
	@Override
	public Object getValueAt(int linha, int colunas) {
		switch(colunas) {
		
			case 0:
				return dadosclientes.get(linha).getNome();
			case 1:
				return dadosguia.get(linha).getNome();
			case 2:
				return dadoslugar.get(linha).getNome();
			case 3:
				return dadoslugar.get(linha).getDataDisponivel();
				
		}
		return null;
	}
	
	/* Pega seta os valores para da tabela
	* @return dados das linhas
	*/
	@Override
	public void setValueAt(Object valor, int linha, int colunas){
		switch(colunas) {
		
		case 0:
			dadosclientes.get(linha).setNome((String) valor);
		case 1:
			dadosguia.get(linha).setNome((String) valor);
		case 2:
			dadoslugar.get(linha).setNome((String) valor);
		case 3:
			dadoslugar.get(linha).setDataDisponivel((Date) valor);
	}
		//atualiza tabela
		this.fireTableCellUpdated(linha, linha);
	
	}
	
	
	
	/* Adiciona dados na linha da tabela 
	* @return dados
	*/
	public void addRow(ClienteModel cliente, GuiaModel guia,LugarModel lugar) {
		this.dadosclientes.add(cliente);
		this.dadosguia.add(guia);
		this.dadoslugar.add(lugar);
		//atualiza tabela
		this.fireTableDataChanged();
	}
	
	/* Remove os dados das linhas da tabela
	* @return romove.dados
	*/
	public void removeRow(int linha) {
		this.dadosclientes.remove(linha);
		//atualiza tabela
		this.fireTableRowsDeleted(linha, linha);
	}
	
}
