package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Controllers.LugarController;
import DAO.LugarDAO;
import Models.LugarModel;

public class TelaLugar extends JFrame{
	
	/**
	 * Version 1.0.0
	 */
	private static final long serialVersionUID = 1L;
		private JPanel jp;
		private JButton addlug;
		private JButton editlug;
		private JButton apagalug;
		private JButton voltar;
		private JLabel lbnomelugar;
		private JTextField tfnomelugar;
		private JLabel lbdata;
		private JLabel lbguia;
		private JTextField tfdata;
		private JComboBox<String> comboguia;
		private DefaultTableModel modelo;
		private JTable tabela;
		private JScrollPane barrarolagem;
		
		void criaTelaLugar(){
			
			jp = new JPanel();
			addlug = new JButton("Adicionar");
			editlug = new JButton("Editar");
			apagalug = new JButton("Apagar");
			voltar = new JButton("Voltar");
			lbnomelugar = new JLabel("Nome:");
			tfnomelugar = new JTextField(30);
			lbdata = new JLabel("Data Disponivel");
			lbguia = new JLabel("Selecione o guia");
			tfdata = new JTextField();
			comboguia = new JComboBox<String>();
			modelo = new DefaultTableModel();
			tabela = new JTable(modelo);
			barrarolagem = new JScrollPane(tabela);
			jp.setLayout(null);
			
			//Label Nome
			lbnomelugar.setBounds(5, 5, 180, 30);
			jp.add(lbnomelugar);
			
			//Input de Nome
			tfnomelugar.setBounds(5, 35, 180, 30);
			jp.add(tfnomelugar);
			
			// Label Seleciona data com ComboBox
			lbdata.setBounds(190, 5, 155, 30);
			jp.add(lbdata);
			tfdata.setBounds(190, 35, 155, 30);
			jp.add(tfdata);
			
			// Label Seleciona guia com ComboBox
			lbguia.setBounds(350, 5, 155, 30);
			jp.add(lbguia);
			comboguia.setBounds(350, 35, 155, 30);
			jp.add(comboguia);
			
			// Configurações Botão Adicionar
			addlug.setBounds(510, 80, 180, 40);
			addlug.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					LugarController lugarc = new LugarController();
				
					
					try {
						lugarc.cadastraLugar(tfnomelugar.getText(), tfdata.getText());
						JOptionPane.showMessageDialog(null,"Lugar adicionado com sucesso!");
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null, "Erro no cadastro ao banco de dados "+e1);
					}
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
			criarTabela();
		}
		
		public void criarTabela() {
			modelo.addColumn("Id");
			modelo.addColumn("Nome do Lugar");
			modelo.addColumn("Data Disponivel");
			modelo.addColumn("Guia");
			leiaJTable(modelo);
		}
		
		public static void leiaJTable(DefaultTableModel modelo) {
		
			modelo.setNumRows(0);
			
			try {
				
			LugarDAO lugardao = new LugarDAO();
			
			for (LugarModel l : lugardao.listarLugar()) {
				modelo.addRow(new Object[] {
					l.getId(),
					l.getNome(),
					l.getDataDisponivel(),
					l.getNomeGuia()
				});
			}
			}catch(SQLException ex) {
				System.out.println("Erro no Listar Tabela!!! "+ex);
			}
		}
		
		
		void fechaTelaLugar(){
			this.dispose();
		}
}


