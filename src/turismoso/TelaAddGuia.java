package turismoso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaAddGuia extends JFrame{
	
	TelaAddGuia() {
		JPanel jpaddcli = new JPanel();
		JLabel lbnomecli = new JLabel("Nome:");
		JTextField tfnomecli = new JTextField(30);
		JLabel lbguia = new JLabel("Escolha o Guia:");
		//JComboBox<String> comboguia = new JComboBox<String>();
		//JLabel lblugar = new JLabel("Escolha o Lugar");
		//JComboBox<String> combolugar = new JComboBox<String>();
		//JLabel lbdataviagem = new JLabel("Data da Viagem:");
		//JTextField tfdataviagem = new JTextField(30);
		JButton voltaraddcli = new JButton("Voltar");
		
		
		jpaddcli.setLayout(null);
		
		//Configurações Botão Adicionar
		lbnomecli.setBounds(510, 5, 180, 40);
		jpaddcli.add(lbnomecli);
		
		//Configurações Botão Editar
		tfnomecli.setBounds(510, 55, 180, 40);
		jpaddcli.add(tfnomecli);
		
		// Configurações Botão Apagar
		lbguia.setBounds(510, 105, 180, 40);
		jpaddcli.add(lbguia);
		
		// Configurações Botão Voltar Add cliente
		voltaraddcli.setBounds(510, 335, 180, 40);
		voltaraddcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpaddcli.add(voltaraddcli);
		
		
		setTitle("TurismoSO v1.0 - Adicionar Guia");
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
