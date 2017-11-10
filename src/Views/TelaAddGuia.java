package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAddGuia extends JFrame{
	
	String [] dadoscbg = new String[] {"guia1","guia2","guia3"};
	
	public TelaAddGuia() {
		JPanel jpaddguia = new JPanel();
		JLabel lbnomeguia = new JLabel("Nome:");
		JTextField tfnomeguia = new JTextField(30);
		JLabel lbprecoguia = new JLabel("Preço por Hora");
		JTextField tfprecoguia = new JTextField(30);
		JLabel lblugarguia = new JLabel("Escolha um Lugar");
		JComboBox<String> combolugar = new JComboBox<String>(dadoscbg);
		
		// Botões voltar e adicionar
		JButton adicionarguia = new JButton("Adicionar");
		JButton voltaraddguia = new JButton("Voltar");
		
		
		jpaddguia.setLayout(null);
		
		//Label Nome
		lbnomeguia.setBounds(30, 10, 280, 40);
		jpaddguia.add(lbnomeguia);
		
		//Input de Nome
		tfnomeguia.setBounds(30, 40, 280, 40);
		jpaddguia.add(tfnomeguia);
		
		// Label preco guia
		lbprecoguia.setBounds(380, 10, 280, 40);
		jpaddguia.add(lbprecoguia);
		tfprecoguia.setBounds(380, 40, 280, 40);
		jpaddguia.add(tfprecoguia);
		
		// Label Seleciona Lugar com ComboBox
		lblugarguia.setBounds(30, 120, 280, 40);
		jpaddguia.add(lblugarguia);
		combolugar.setBounds(30, 150, 280, 40);
		jpaddguia.add(combolugar);
		
		adicionarguia.setBounds(30, 310, 180, 40);
		adicionarguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpaddguia.add(adicionarguia);
		
		
		// Configurações Botão Voltar Add cliente
		voltaraddguia.setBounds(480, 310, 180, 40);
		voltaraddguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpaddguia.add(voltaraddguia);
		
		
		setTitle("TurismoSO v1.0 - Adicionar Guia");
		setVisible(true);
		setSize(700, 408);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(jpaddguia);
	}
	
	void fechaTelaCliente(){
		this.dispose();
	}
}
