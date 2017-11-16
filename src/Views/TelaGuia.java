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

public class TelaGuia extends JFrame{

	
	/**
	 * Version 1.0.0
	 */
	private static final long serialVersionUID = 1L;
	
	String [] dadoscbg = new String[] {"Lugar1","Lugar2","Lugar3"};
	String [] colunasguia = {"Guias","Preço Hora","Lugar"};
	Object [][] dadosguia = {
			{"Guia1","R$ 30,00","Lugar1"},
			{"Guia2","R$ 30,00","Lugar2"},
			{"Guia3","R$ 30,00","Lugar3"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"}
	};	

	JTable tabela = new JTable(dadosguia,colunasguia);
	JScrollPane barrarolagem = new JScrollPane(tabela);
	
	void criaTelaGuia(){
		JPanel jp = new JPanel();
		JButton addguia = new JButton("Adicionar");
		JButton editguia = new JButton("Editar");
		JButton apagaguia = new JButton("Apagar");
		JButton voltarguia = new JButton("Voltar");
		JLabel lbnomeguia = new JLabel("Nome:");
		JTextField tfnomeguia = new JTextField(30);
		JLabel lbprecoguia = new JLabel("Preço por Hora");
		JTextField tfprecoguia = new JTextField(30);
		JLabel lblugarguia = new JLabel("Escolha um Lugar");
		JComboBox<String> combolugar = new JComboBox<String>(dadoscbg);
		
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
		
		// Label Seleciona Lugar com ComboBox
		lblugarguia.setBounds(315, 5, 190, 30);
		jp.add(lblugarguia);
		combolugar.setBounds(315, 35, 190, 30);
		jp.add(combolugar);
		
		// Configurações Botão Adicionar
		addguia.setBounds(510, 80, 180, 40);
		addguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		jp.add(addguia);
		
		//Configurações Botão Editar
		editguia.setBounds(510, 130, 180, 40);
		editguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jp.add(editguia);
		
		// Configurações Botão Apagar
		apagaguia.setBounds(510, 180, 180, 40);
		apagaguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
	}
	
	void fechaTelaGuia(){
		this.dispose();
	}

}
