package TelasCRUD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAddLugar extends JFrame {
	
	String [] dadoscbdv = new String[] {"13-08-2018","13-05-2019","15-01-2018"};
	
	public TelaAddLugar() {
		JPanel jpaddlugar = new JPanel();
		JLabel lbnomelugar = new JLabel("Nome:");
		JTextField tfnomelugar = new JTextField(30);
		JLabel lbendereco = new JLabel("Endereço");
		JTextField tfendereco = new JTextField(30);
		JLabel lbdata = new JLabel("Data Disponivel");
		JComboBox<String> combodata = new JComboBox<String>(dadoscbdv);
		
		
		// Botões voltar e adicionar
		JButton adicionarguia = new JButton("Adicionar");
		JButton voltaraddguia = new JButton("Voltar");
		
		
		jpaddlugar.setLayout(null);
		
		//Label Nome
		lbnomelugar.setBounds(30, 10, 280, 40);
		jpaddlugar.add(lbnomelugar);
		
		//Input de Nome
		tfnomelugar.setBounds(30, 40, 280, 40);
		jpaddlugar.add(tfnomelugar);
		
		// Label preco guia
		lbendereco.setBounds(380, 10, 280, 40);
		jpaddlugar.add(lbendereco);
		tfendereco.setBounds(380, 40, 280, 40);
		jpaddlugar.add(tfendereco);
		
		// Label Seleciona Lugar com ComboBox
		lbdata.setBounds(30, 120, 280, 40);
		jpaddlugar.add(lbdata);
		combodata.setBounds(30, 150, 280, 40);
		jpaddlugar.add(combodata);
		
		adicionarguia.setBounds(30, 310, 180, 40);
		adicionarguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpaddlugar.add(adicionarguia);
		
		
		// Configurações Botão Voltar Add cliente
		voltaraddguia.setBounds(480, 310, 180, 40);
		voltaraddguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpaddlugar.add(voltaraddguia);
		
		
		setTitle("TurismoSO v1.0 - Adicionar Cliente");
		setVisible(true);
		setSize(700, 408);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(jpaddlugar);
	}
	
	void fechaTelaCliente(){
		this.dispose();
	}
}
