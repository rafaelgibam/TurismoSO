package Models;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class GuiaTableModel extends AbstractTableModel {

	private List<GuiaModel> dadosguia = new ArrayList<>();
	
	private String[] colunas = {"id","Nome do Guia","Preço por Hora"};
	
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
		
		return dadosguia.size();

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
				return dadosguia.get(linha).getNome();
			case 1:
				return dadosguia.get(linha).getValorHora();
				
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
			dadosguia.get(linha).setNome((String) valor);
		case 1:
			dadosguia.get(linha).setValorHora((Double) valor);
		
	}
		//atualiza tabela
		this.fireTableCellUpdated(linha, linha);
	
	}
	
	
	/* Adiciona dados na linha da tabela 
	* @return dados
	*/
	public void addRow(GuiaModel guia) {
		
		this.dadosguia.add(guia);
		
		//atualiza tabela
		this.fireTableDataChanged();
	}
	
	/* Remove os dados das linhas da tabela
	* @return romove.dados
	*/
	public void removeRow(int linha) {
		this.dadosguia.remove(linha);
		//atualiza tabela
		this.fireTableRowsDeleted(linha, linha);
	}
	
}

