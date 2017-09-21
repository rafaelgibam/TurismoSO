package turismoso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaLugar extends JFrame{
	
	/**
	 * Version 1.0.0
	 */
	private static final long serialVersionUID = 1L;
	
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
			JButton addcli = new JButton("Adicionar");
			JButton editcli = new JButton("Editar");
			JButton apagacli = new JButton("Apagar");
			JButton voltar = new JButton("Voltar");
			
			jp.setLayout(null);
			
			// Configurações Botão Adicionar
			addcli.setBounds(510, 5, 180, 40);
			jp.add(addcli);
			
			//Configurações Botão Editar
			editcli.setBounds(510, 55, 180, 40);
			jp.add(editcli);
			
			// Configurações Botão Apagar
			apagacli.setBounds(510, 105, 180, 40);
			jp.add(apagacli);
			
			// Configurações Botão Voltar
			voltar.setBounds(510, 335, 180, 40);
			voltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fechaTelaLugar();
				}
			});
			jp.add(voltar);
			
			//Configurações Tabela
			barrarolagem.setBounds(0, 0, 507, 500);
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


