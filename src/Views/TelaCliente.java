package Views;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaCliente extends JFrame{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		String [] colunascli = {"Clientes","Guias","Lugar","Data"};
		Object [][] dadoscli = {
				{"Cliente1","Guia1","Lugar1","12-02-2018"},
		};	
		
		String [] dadoscbg = new String[] {"guia1","guia2","guia3"};
		String [] dadoscbl = new String[] {"lugar1","lugar2","lugar3"};
		String [] dadoscbdv = new String[] {"13-08-2018","13-05-2019","15-01-2018"};
	
		JTable tabela = new JTable(dadoscli,colunascli);
		JScrollPane barrarolagem = new JScrollPane(tabela);
		
		void criaTelaCliente(){
			JPanel jp = new JPanel();
			JButton addcli = new JButton("Adicionar");
			JButton editcli = new JButton("Editar");
			JButton apagacli = new JButton("Apagar");
			JButton voltar = new JButton("Voltar");
			JLabel lbnomecli = new JLabel("Nome do Cliente");
			JTextField tfnomecli = new JTextField();
			JLabel lbguia = new JLabel("Escolha o Guia:");
			JComboBox<String> comboguia = new JComboBox<String>(dadoscbg);
			JLabel lblugar = new JLabel("Escolha o Lugar");
			JComboBox<String> combolugar = new JComboBox<String>(dadoscbl);
			JLabel lbdataviagem = new JLabel("Data da Viagem:");
			JComboBox<String> combodataviagem = new JComboBox<String>(dadoscbdv);
			
			
			jp.setLayout(null);
			
			//Label Nome
			lbnomecli.setBounds(5, 5, 150, 30);
			jp.add(lbnomecli);
			
			//Input de Nome
			tfnomecli.setBounds(5, 35, 150, 30);
			jp.add(tfnomecli);
			
			// Label Seleciona Guia com ComboBox
			lbguia.setBounds(160, 5, 180, 30);
			jp.add(lbguia);
			comboguia.setBounds(160, 35, 180, 30);
			jp.add(comboguia);
			
			// Label Seleciona Lugar com ComboBox
			lblugar.setBounds(350, 5, 220, 30);
			jp.add(lblugar);
			combolugar.setBounds(350, 35, 220, 30);
			jp.add(combolugar);
			
			
			// Label Seleciona data com ComboBox
			lbdataviagem.setBounds(580, 5, 105, 30);
			jp.add(lbdataviagem);
			combodataviagem.setBounds(580, 35, 105, 30);
			jp.add(combodataviagem);
			
			// Configurações Botão Adicionar
			addcli.setBounds(510, 80, 180, 40);
			addcli.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
				}
			});
			jp.add(addcli);
			
			//Configurações Botão Editar
			editcli.setBounds(510, 130, 180, 40);
			editcli.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			jp.add(editcli);
			
			// Configurações Botão Apagar
			apagacli.setBounds(510, 180, 180, 40);
			apagacli.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			jp.add(apagacli);
			
			// Configurações Botão Voltar
			voltar.setBounds(510, 335, 180, 40);
			voltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fechaTelaCliente();
				}
			});
			jp.add(voltar);
			
			//Configurações Tabela
			barrarolagem.setBounds(0, 80, 507, 300);
			jp.add(barrarolagem);
			
			setTitle("TurismoSO v1.0 - Clientes");
			setVisible(true);
			setSize(700, 408);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			setResizable(false);
			add(jp);
		}
		
		
		void fechaTelaCliente(){
			this.dispose();
		}
}
