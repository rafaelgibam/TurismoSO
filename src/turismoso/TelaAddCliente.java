package turismoso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAddCliente extends JFrame {
	
	String [] dadoscbg = new String[] {"guia1","guia2","guia3"};
	String [] dadoscbl = new String[] {"lugar1","lugar2","lugar3"};
	String [] dadoscbdv = new String[] {"13-08-2018","13-05-2019","15-01-2018"};
	
	TelaAddCliente() {
		JPanel jpaddcli = new JPanel();
		JLabel lbnomecli = new JLabel("Nome:");
		JTextField tfnomecli = new JTextField(30);
		JLabel lbguia = new JLabel("Escolha o Guia:");
		JComboBox<String> comboguia = new JComboBox<String>(dadoscbg);
		JLabel lblugar = new JLabel("Escolha o Lugar");
		JComboBox<String> combolugar = new JComboBox<String>(dadoscbl);
		JLabel lbdataviagem = new JLabel("Data da Viagem:");
		JComboBox<String> combodataviagem = new JComboBox<String>(dadoscbdv);
		JButton adicionarcli = new JButton("Adicionar");
		JButton voltaraddcli = new JButton("Voltar");
		
		
		jpaddcli.setLayout(null);
		
		//Label Nome
		lbnomecli.setBounds(30, 10, 280, 40);
		jpaddcli.add(lbnomecli);
		
		//Input de Nome
		tfnomecli.setBounds(30, 40, 280, 40);
		jpaddcli.add(tfnomecli);
		
		// Label Seleciona Guia com ComboBox
		lbguia.setBounds(380, 10, 280, 40);
		jpaddcli.add(lbguia);
		comboguia.setBounds(380, 40, 280, 40);
		jpaddcli.add(comboguia);
		
		// Label Seleciona Lugar com ComboBox
		lblugar.setBounds(30, 120, 280, 40);
		jpaddcli.add(lblugar);
		combolugar.setBounds(30, 150, 280, 40);
		jpaddcli.add(combolugar);
		
		
		// Label Seleciona data com ComboBox
		lbdataviagem.setBounds(380, 120, 280, 40);
		jpaddcli.add(lbdataviagem);
		combodataviagem.setBounds(380, 150, 280, 40);
		jpaddcli.add(combodataviagem);
		
		
		// Configurações Botão Add cliente
		adicionarcli.setBounds(30, 310, 180, 40);
		voltaraddcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpaddcli.add(adicionarcli);
		
		
		
		// Configurações Botão Voltar Add cliente
		voltaraddcli.setBounds(480, 310, 180, 40);
		voltaraddcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
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


