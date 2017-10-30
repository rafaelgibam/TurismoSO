package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaEditGuia extends JFrame {
	
	String [] dadosguia = new String[] {"guia1","guia2","guia3"};
	
	public TelaEditGuia() {
		JPanel jpeditguia = new JPanel();
		JLabel lbseleguia = new JLabel("Selecione o guia para editar");
		JComboBox<String> comboguia = new JComboBox<String>(dadosguia);
		JTextField tfeditguia = new JTextField(20);
		JButton editguia = new JButton("Editar");
		JButton voltaraddcli = new JButton("Voltar");
		
		jpeditguia.setLayout(null);
		
		
		// Configurações lbselecli
		lbseleguia.setBounds(260, 10, 400, 30);
		jpeditguia.add(lbseleguia);
		
		// Configurações combobox
		comboguia.setBounds(150,50,400,40);
		jpeditguia.add(comboguia);
		
		// Configurações tfeditcli
		tfeditguia.setBounds(150, 170, 400, 40);
		jpeditguia.add(tfeditguia);
		
		// Configurações Botão editar cliente
		editguia.setBounds(40, 310, 180, 40);
		editguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpeditguia.add(editguia);
		
		// Configurações Botão Voltar Add cliente
		voltaraddcli.setBounds(480, 310, 180, 40);
		voltaraddcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpeditguia.add(voltaraddcli);
		
		
		setTitle("TurismoSO v1.0 - Editar Guia");
		setVisible(true);
		setSize(700, 408);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(jpeditguia);
	}
	
	void fechaTelaCliente(){
		this.dispose();
	}
}


