package Views;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Controllers.ClienteController;
import DAO.ClienteDAO;
import DAO.GuiaDAO;
import Models.ClienteModel;
import Models.GuiaModel;
import Models.LugarModel;

public class TelaCliente extends JFrame{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTable tabela;
	JScrollPane barrarolagem;
	JPanel jp;
	JButton addcli;
	JButton editcli;
	JButton apagacli;
	JButton voltar;
	JLabel lbnomecli;
	JTextField tfnomecli;
	JLabel lbguia;
	JComboBox<GuiaModel> comboguia;
	JLabel lblugar;
	JComboBox<LugarModel> combolugar;
	JLabel lbdataviagem;
	JComboBox<LugarModel> combodataviagem;
	DefaultTableModel modelo;
		
		void criaTelaCliente(){
			modelo = new DefaultTableModel();
			tabela = new JTable(modelo);
			barrarolagem = new JScrollPane(tabela);
			jp = new JPanel();
			addcli = new JButton("Adicionar");
			editcli = new JButton("Editar");
			apagacli = new JButton("Apagar");
			voltar = new JButton("Voltar");
			lbnomecli = new JLabel("Nome do Cliente");
			tfnomecli = new JTextField();
			lbguia = new JLabel("Escolha o Guia:");
			comboguia = new JComboBox<GuiaModel>();
			lblugar = new JLabel("Escolha o Lugar");
			combolugar = new JComboBox<LugarModel>();
			lbdataviagem = new JLabel("Data da Viagem:");
			combodataviagem = new JComboBox<LugarModel>();
		
			
			//Setando o modelo da tabela

			
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
					ClienteController cliente = new ClienteController();
					
					try {
						cliente.cadastraCliente(tfnomecli.getText());
						JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!");
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null,"Erro ao cadastrar cliente! "+e1);
					}
				
				}
			});
			jp.add(addcli);
			
			//Configurações Botão Editar
			editcli.setBounds(510, 130, 180, 40);
			editcli.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(tabela.getSelectedRow() != -1) {
						
					}
				}
			});
			jp.add(editcli);
			
			// Configurações Botão Apagar
			apagacli.setBounds(510, 180, 180, 40);
			apagacli.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(tabela.getSelectedRow() != -1) {
						
					}
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
			
			criarTabela();
		}
		
		public void criarTabela(){
			
			modelo.addColumn("Id");
			modelo.addColumn("Nome do Cliente");
			modelo.addColumn("Guia");
			modelo.addColumn("Lugar");
			modelo.addColumn("Data Disponivel");
			
			leiaJTable(modelo);
			
		}
		
		public static void leiaJTable(DefaultTableModel modelo) {
			
			modelo.setNumRows(0);
			
			try {
				
			ClienteDAO clientedao = new ClienteDAO();
			
			for (ClienteModel c : clientedao.listarCliente()) {
				modelo.addRow(new Object[] {
					c.getId(),
					c.getNome(),
					c.getGuia().getNome(),
					c.getLugar().getNome(),
					c.getLugar().getDataDisponivel()
				});
			}
			
			}catch(SQLException ex) {
				System.out.println("Erro no Listar Tabela!!! "+ex);
			}
		}
	
		
		void fechaTelaCliente(){
			this.dispose();
		}
		
}
