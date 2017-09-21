package turismoso;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaCliente extends JFrame{
		
		/**
	 * Version 1.0.0
	 */
	private static final long serialVersionUID = 1L;
	
		String [] colunascli = {"Clientes","Guias","Lugar","Data"};
		Object [][] dadoscli = {
				{"Cliente1","Guia1","Lugar1","12-02-2018"},
				{"Cliente2","Guia2","Lugar2","12-04-2018"},
				{"Cliente3","Guia3","Lugar3","12-08-2018"},
				{"Cliente4","Guia4","Lugar4","12-03-2018"},
				{"Cliente4","Guia4","Lugar4","12-03-2018"},
				{"Cliente4","Guia4","Lugar4","12-03-2018"},
				{"Cliente4","Guia4","Lugar4","12-03-2018"},
				{"Cliente4","Guia4","Lugar4","12-03-2018"},
				{"Cliente4","Guia4","Lugar4","12-03-2018"},
				{"Cliente4","Guia4","Lugar4","12-03-2018"},
				{"Cliente4","Guia4","Lugar4","12-03-2018"},
				{"Cliente4","Guia4","Lugar4","12-03-2018"}
		};	
	
		JTable tabela = new JTable(dadoscli,colunascli);
		JScrollPane barrarolagem = new JScrollPane(tabela);
		
		void criaTelaCliente(){
			JPanel jp = new JPanel();
			JButton addcli = new JButton("Adicionar");
			JButton editcli = new JButton("Editar");
			JButton apagacli = new JButton("Apagar");
			JButton voltar = new JButton("Voltar");
			
			jp.setLayout(null);
			
			// Configura��es Bot�o Adicionar
			addcli.setBounds(510, 5, 180, 40);
			addcli.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					criaTelaAddCliente();
				}
			});
			jp.add(addcli);
			
			//Configura��es Bot�o Editar
			editcli.setBounds(510, 55, 180, 40);
			jp.add(editcli);
			
			// Configura��es Bot�o Apagar
			apagacli.setBounds(510, 105, 180, 40);
			jp.add(apagacli);
			
			// Configura��es Bot�o Voltar
			voltar.setBounds(510, 335, 180, 40);
			voltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fechaTelaCliente();
				}
			});
			jp.add(voltar);
			
			//Configura��es Tabela
			barrarolagem.setBounds(0, 0, 507, 500);
			jp.add(barrarolagem);
			
			setTitle("TurismoSO v1.0 - Clientes");
			setVisible(true);
			setSize(700, 408);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			setResizable(false);
			add(jp);
		}
		
		void criaTelaAddCliente() {
			JPanel jpaddcli = new JPanel();
			JLabel lbnomecli = new JLabel("Nome:");
			JTextField tfnomecli = new JTextField(30);
			JLabel lbguia = new JLabel("Escolha o Guia:");
			//JComboBox<String> comboguia = new JComboBox<String>();
			//JLabel lblugar = new JLabel("Escolha o Lugar");
			//JComboBox<String> combolugar = new JComboBox<String>();
			//JLabel lbdataviagem = new JLabel("Data da Viagem:");
			//JTextField tfdataviagem = new JTextField(30);
			JButton voltaraddcli = new JButton("Voltar");
			
			
			jpaddcli.setLayout(null);
			
			//Configura��es Bot�o Adicionar
			lbnomecli.setBounds(510, 5, 180, 40);
			jpaddcli.add(lbnomecli);
			
			//Configura��es Bot�o Editar
			tfnomecli.setBounds(510, 55, 180, 40);
			jpaddcli.add(tfnomecli);
			
			// Configura��es Bot�o Apagar
			lbguia.setBounds(510, 105, 180, 40);
			jpaddcli.add(lbguia);
			
			// Configura��es Bot�o Voltar Add cliente
			voltaraddcli.setBounds(510, 335, 180, 40);
			voltaraddcli.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					criaTelaCliente();
				}
			});
			jpaddcli.add(voltaraddcli);
			
			
			setTitle("TurismoSO v1.0 - Adicionar Cliente");
			setVisible(true);
			setSize(700, 408);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			setResizable(false);
			add(jpaddcli);
		}
		
		void fechaTelaCliente(){
			this.dispose();
		}
}
