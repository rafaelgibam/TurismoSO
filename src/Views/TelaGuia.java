package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Controllers.GuiaController;
import DAO.GuiaDAO;
import Models.GuiaModel;

public class TelaGuia extends JFrame{
	
	/**
	 * Version 1.0.0
	 */
	private static final long serialVersionUID = 1L;
	
	private	DefaultTableModel modelo = new DefaultTableModel();
	private static JTable tabela;
	private JPanel jp;
	JButton addguia;
	JButton editguia;
	JButton apagaguia;
	JButton voltarguia;
	JLabel lbnomeguia;
	JTextField tfnomeguia;
	JLabel lbprecoguia;
	JTextField tfprecoguia;
	JLabel lblugarguia;
	JScrollPane barrarolagem;
	
	void criaTelaGuia(){
		jp = new JPanel();
		addguia = new JButton("Adicionar");
		editguia = new JButton("Editar");
		apagaguia = new JButton("Apagar");
		voltarguia = new JButton("Voltar");
		lbnomeguia = new JLabel("Nome:");
		tfnomeguia = new JTextField(30);
		lbprecoguia = new JLabel("Preço por Hora");
		tfprecoguia = new JTextField(30);
		lblugarguia = new JLabel("Escolha um Lugar");
		tabela = new JTable(modelo);
		barrarolagem = new JScrollPane(tabela);
	
		
		jp.setLayout(null);
		
		//Label Nome
		lbnomeguia.setBounds(5, 5, 200, 30);
		jp.add(lbnomeguia);
		
		//Input de Nome
		tfnomeguia.setBounds(5, 35, 200, 30);
		jp.add(tfnomeguia);
		
		// Label preco guia
		lbprecoguia.setBounds(210, 5, 100, 30);
		jp.add(lbprecoguia);
		tfprecoguia.setBounds(210, 35, 100, 30);
		jp.add(tfprecoguia);
		
		// Configurações Botão Adicionar
		addguia.setBounds(510, 80, 180, 40);
		addguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiaController guia = new GuiaController();
				try {
					if(tfnomeguia == null && tfprecoguia == null) {
						JOptionPane.showMessageDialog(null, "Campos vazio, preencha os campos");
					}else {
						guia.cadastraGuia(tfnomeguia.getText(), Double.parseDouble(tfprecoguia.getText()));
						JOptionPane.showMessageDialog(null, "Guia adicionado com sucesso!");
					}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "ERRO no formato dos caracteres! " + e1);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "ERRO ao salvar no banco de dados " + e1);
				}
				tfnomeguia.setText("");
				tfprecoguia.setText("");
				modelo.fireTableDataChanged();
			}
		});
		jp.add(addguia);
		
		//Configurações Botão Editar
		editguia.setBounds(510, 130, 180, 40);
		editguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GuiaModel guia = new GuiaModel();
				GuiaController guiacontrol = new GuiaController();
				
				guia.setId((int)tabela.getValueAt(tabela.getSelectedRow(), 0));
				tfnomeguia.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
				tfprecoguia.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
				
				try {
					guiacontrol.alterarGuia(guia.getId(), tfnomeguia.getText(), Double.parseDouble(tfprecoguia.getText()));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Erro nos caracteres no alterar "+e1);
					e1.printStackTrace();
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, "Erro Banco de dados ");
					System.out.println(e1);
				}
			
			}
		});
		
		jp.add(editguia);
		
		// Configurações Botão Apagar
		apagaguia.setBounds(510, 180, 180, 40);
		apagaguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiaModel guia = new GuiaModel();
				GuiaController guiac = new GuiaController();
				guia.setId( (int) tabela.getValueAt(tabela.getSelectedRow(), 0));
				
				try {
					guiac.apagarGuia(guia.getId());
					JOptionPane.showMessageDialog(null,"Guia apagado com sucesso!");
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null,"ERRO ao excluir guia "+e1);
				}
				
				modelo.fireTableRowsDeleted(tabela.getSelectedRow(), tabela.getSelectedRow());
			}
		});
		jp.add(apagaguia);
		
		// Configurações Botão Voltar
		voltarguia.setBounds(510, 335, 180, 40);
		voltarguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaGuia();
			}
		});
		jp.add(voltarguia);
		
		//Configurações Tabela
		barrarolagem.setBounds(0, 80, 507, 300);
		jp.add(barrarolagem);
		
		setTitle("TurismoSO v1.0 - Guias");
		setVisible(true);
		setSize(700, 408);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(jp);
		
		criarTabela();
		
	}
	
	public void criarTabela(){
		modelo.addColumn("id");
		modelo.addColumn("Nome Guia");
		modelo.addColumn("Valor Hora");
		modelo.fireTableDataChanged();
		leiaJTable(modelo);
		
	}
	
	public static void leiaJTable(DefaultTableModel modelo) {
		
		modelo.setNumRows(0);
		
		try {
			
		GuiaDAO guiadao = new GuiaDAO();
		
		for (GuiaModel g : guiadao.listarGuia()) {
			modelo.addRow(new Object[] {
				g.getId(),
				g.getNome(),
				g.getValorHora()
			});
		}
		
		}catch(SQLException ex) {
			System.out.println("Erro no Listar Tabela!!! "+ex);
		}
	}
	
	public void tabelaMouseClicked(MouseEvent event){
		if(tabela.getSelectedRow() != -1) {
			tfnomeguia.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 1));
			tfprecoguia.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 2));
		}
	}
	
	
	
	void fechaTelaGuia(){
		this.dispose();
	}

}
