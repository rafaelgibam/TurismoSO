package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TelaLugar extends JFrame{
	
	/**
	 * Version 1.0.0
	 */
	private static final long serialVersionUID = 1L;
	
		String [] dadoscbdv = new String[] {"13-08-2018","13-05-2019","15-01-2018"};
		String [] colunaslugar = {"Guias","Lugar"};
		Object [][] dadoslugar = {
				{"Lugar1","12-02-2018"},
				{"Lugar2","12-04-2018"},
				{"Lugar3","12-08-2018"},
				{"Lugar4","12-03-2018"},
				{"Lugar4","12-03-2018"},
				{"Lugar4","12-03-2018"},
				{"Lugar4","12-03-2018"},
				{"Lugar4","12-03-2018"},
				{"Lugar4","12-03-2018"},
				{"Lugar4","12-03-2018"},
				{"Lugar4","12-03-2018"},
				{"Lugar4","12-03-2018"}
		};	

		JTable tabela = new JTable(dadoslugar,colunaslugar);
		JScrollPane barrarolagem = new JScrollPane(tabela);
		
		void criaTelaLugar(){
			JPanel jp = new JPanel();
			JButton addlug = new JButton("Adicionar");
			JButton editlug = new JButton("Editar");
			JButton apagalug = new JButton("Apagar");
			JButton voltar = new JButton("Voltar");
			JLabel lbnomelugar = new JLabel("Nome:");
			JTextField tfnomelugar = new JTextField(30);
			JLabel lbendereco = new JLabel("Endereço");
			JTextField tfendereco = new JTextField(30);
			JLabel lbdata = new JLabel("Data Disponivel");
			JComboBox<String> combodata = new JComboBox<String>(dadoscbdv);
			
			jp.setLayout(null);
			
			//Label Nome
			lbnomelugar.setBounds(5, 5, 150, 30);
			jp.add(lbnomelugar);
			
			//Input de Nome
			tfnomelugar.setBounds(5, 35, 150, 30);
			jp.add(tfnomelugar);
			
			// Label endereço
			lbendereco.setBounds(160, 5, 180, 30);
			jp.add(lbendereco);
			tfendereco.setBounds(160, 35, 180, 30);
			jp.add(tfendereco);
			
			// Label Seleciona data com ComboBox
			lbdata.setBounds(350, 5, 155, 30);
			jp.add(lbdata);
			combodata.setBounds(350, 35, 155, 30);
			jp.add(combodata);
			
			// Configurações Botão Adicionar
			addlug.setBounds(510, 80, 180, 40);
			addlug.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			jp.add(addlug);
			
			//Configurações Botão Editar
			editlug.setBounds(510, 130, 180, 40);
			editlug.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			jp.add(editlug);
			
			// Configurações Botão Apagar
			apagalug.setBounds(510, 180, 180, 40);
			apagalug.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			jp.add(apagalug);
			
			// Configurações Botão Voltar
			voltar.setBounds(510, 335, 180, 40);
			voltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fechaTelaLugar();
				}
			});
			jp.add(voltar);
			
			//Configurações Tabela
			barrarolagem.setBounds(0, 80, 507, 300);
			jp.add(barrarolagem);
			
			setTitle("TurismoSO v1.0 - Lugares");
			setVisible(true);
			setSize(700, 408);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			setResizable(false);
			add(jp);
		}
		
		
		
		void fechaTelaLugar(){
			this.dispose();
		}
}


