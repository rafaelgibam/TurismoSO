package TelasCRUD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaExcluirCliente extends JFrame {
	
	String [] dadoscli = new String[] {"cliente1","cliente2","cliente3"};
	
	public TelaExcluirCliente() {
		JPanel jpapagacli = new JPanel();
		JLabel lbselecli = new JLabel("Selecione o cliente para apagar");
		JComboBox<String> combocli = new JComboBox<String>(dadoscli);
		JButton editcli = new JButton("Apagar");
		JButton voltaraddcli = new JButton("Voltar");
		
		jpapagacli.setLayout(null);
		
		
		// Configurações lbselecli
		lbselecli.setBounds(260, 80, 400, 30);
		jpapagacli.add(lbselecli);
		
		// Configurações combobox
		combocli.setBounds(150,120,400,40);
		jpapagacli.add(combocli);
		
		
		// Configurações Botão editar cliente
		editcli.setBounds(40, 310, 180, 40);
		editcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpapagacli.add(editcli);
		
		// Configurações Botão Voltar Add cliente
		voltaraddcli.setBounds(480, 310, 180, 40);
		voltaraddcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpapagacli.add(voltaraddcli);
		
		
		setTitle("TurismoSO v1.0 - Apagar Cliente");
		setVisible(true);
		setSize(700, 408);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(jpapagacli);
	}
	
	void fechaTelaCliente(){
		this.dispose();
	}
}


