package Models;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import javax.swing.table.AbstractTableModel;

public class LugarTableModel extends AbstractTableModel {

	private List<LugarModel> dadoslugar = new ArrayList<>();
	
	private String[] colunas = {"Nome do Lugar","Endere�o","Data Disponivel"};
	
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
		
		return dadoslugar.size();

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
				return dadoslugar.get(linha).getNome();
			case 1:
				return dadoslugar.get(linha).getEndereco();
			case 2:
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
			dadoslugar.get(linha).setNome((String) valor);
		case 1:
			dadoslugar.get(linha).setEndereco((String) valor);
		case 2: 
			dadoslugar.get(linha).setDataDisponivel((Date) valor);
		
	}
		//atualiza tabela
		this.fireTableCellUpdated(linha, linha);
	
	}
	
	
	/* Adiciona dados na linha da tabela 
	* @return dados
	*/
	public void addRow(LugarModel lugar) {
		
		this.dadoslugar.add(lugar);
		
		//atualiza tabela
		this.fireTableDataChanged();
	}
	
	/* Remove os dados das linhas da tabela
	* @return romove.dados
	*/
	public void removeRow(int linha) {
		this.dadoslugar.remove(linha);
		//atualiza tabela
		this.fireTableRowsDeleted(linha, linha);
	}
	
}


