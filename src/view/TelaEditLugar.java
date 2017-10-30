package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaEditLugar extends JFrame {
	
	String [] dadoslugar = new String[] {"lugar1","lugar2","lugar3"};
	
	public TelaEditLugar() {
		JPanel jpeditlugar = new JPanel();
		JLabel lbselecli = new JLabel("Selecione o lugar para editar");
		JComboBox<String> combolugar = new JComboBox<String>(dadoslugar);
		JTextField tfeditlugar = new JTextField(20);
		JButton editlugar = new JButton("Editar");
		JButton voltaraddcli = new JButton("Voltar");
		
		jpeditlugar.setLayout(null);
		
		
		// Configurações lbselecli
		lbselecli.setBounds(260, 10, 400, 30);
		jpeditlugar.add(lbselecli);
		
		// Configurações combobox
		combolugar.setBounds(150,50,400,40);
		jpeditlugar.add(combolugar);
		
		// Configurações tfeditcli
		tfeditlugar.setBounds(150, 170, 400, 40);
		jpeditlugar.add(tfeditlugar);
		
		// Configurações Botão editar cliente
		editlugar.setBounds(40, 310, 180, 40);
		editlugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpeditlugar.add(editlugar);
		
		// Configurações Botão Voltar Add cliente
		voltaraddcli.setBounds(480, 310, 180, 40);
		voltaraddcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpeditlugar.add(voltaraddcli);
		
		
		setTitle("TurismoSO v1.0 - Editar Lugar");
		setVisible(true);
		setSize(700, 408);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(jpeditlugar);
	}
	
	void fechaTelaCliente(){
		this.dispose();
	}
}


