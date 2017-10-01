package Telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TelaRelatorio extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String [] colunasrela = {"Qtd_Clientes","Qtd_Guias","Media Hora Guia", "Lugar mais Visitado"};
	Object [][] dadosrela = {
			{"23","10","R$ 20,00","lugar 1"},
		
	};
	
	String [] colunasrelabusca = {"Clientes","Guias","Lugares"};
	Object [][] dadosrelabusca = {
			{"Cliente2","Guia2","Lugar2"},
			{"Cliente2","Guia2","Lugar2"},
			{"Cliente2","Guia2","Lugar2"},
			{"Cliente2","Guia2","Lugar2"},
			{"Cliente2","Guia2","Lugar2"},
			{"Cliente2","Guia2","Lugar2"},
			{"Cliente2","Guia2","Lugar2"},
			{"Cliente2","Guia2","Lugar2"},
			{"Cliente2","Guia2","Lugar2"},
			
	};	
	
	TelaRelatorio(){
	JPanel jp = new JPanel();
	JLabel lbbusca = new JLabel("    Buscar   ");
	JTextField tfbusca = new JTextField(40); 
	JButton btnbusca = new JButton("   Buscar  ");
	JTable tabelarela = new JTable(dadosrela,colunasrela);
	JScrollPane rolagemtotal = new JScrollPane(tabelarela);
	JTable tabelarelabusca = new JTable(dadosrelabusca,colunasrelabusca);
	JScrollPane rolagembusca = new JScrollPane(tabelarelabusca);
	
	jp.setLayout(null);
	
	lbbusca.setBounds(15, 25, 80, 30);
	jp.add(lbbusca);
	
	tfbusca.setBounds(100,25,450,30);
	jp.add(tfbusca);
	
	btnbusca.setBounds(580, 25, 100, 30);
	jp.add(btnbusca);

	rolagemtotal.setBounds(0, 80, 700, 39);
	jp.add(rolagemtotal);
	
	rolagembusca.setBounds(0, 150, 700, 400);
	jp.add(rolagembusca);
	
	setTitle("TurismoSO v1.0 - Relatório");
	setVisible(true);
	setSize(700, 408);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setLocationRelativeTo(null);
	setResizable(false);
	add(jp);
	}
}
