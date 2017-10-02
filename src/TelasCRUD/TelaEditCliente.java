package TelasCRUD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaEditCliente extends JFrame {
	
	String [] dadoscli = new String[] {"cliente1","cliente2","cliente3"};
	
	public TelaEditCliente() {
		JPanel jpeditcli = new JPanel();
		JLabel lbselecli = new JLabel("Selecione o cliente para editar");
		JComboBox<String> combocli = new JComboBox<String>(dadoscli);
		JTextField tfeditcli = new JTextField(20);
		JButton editcli = new JButton("Editar");
		JButton voltaraddcli = new JButton("Voltar");
		
		jpeditcli.setLayout(null);
		
		
		// Configurações lbselecli
		lbselecli.setBounds(260, 10, 400, 30);
		jpeditcli.add(lbselecli);
		
		// Configurações combobox
		combocli.setBounds(150,50,400,40);
		jpeditcli.add(combocli);
		
		// Configurações tfeditcli
		tfeditcli.setBounds(150, 170, 400, 40);
		jpeditcli.add(tfeditcli);
		
		// Configurações Botão editar cliente
		editcli.setBounds(40, 310, 180, 40);
		editcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpeditcli.add(editcli);
		
		// Configurações Botão Voltar Add cliente
		voltaraddcli.setBounds(480, 310, 180, 40);
		voltaraddcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpeditcli.add(voltaraddcli);
		
		
		setTitle("TurismoSO v1.0 - Editar Cliente");
		setVisible(true);
		setSize(700, 408);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(jpeditcli);
	}
	
	void fechaTelaCliente(){
		this.dispose();
	}
}


