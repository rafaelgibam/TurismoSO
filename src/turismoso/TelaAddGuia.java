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
		JPanel jpaddguia = new JPanel();
		JLabel lbnomeguia = new JLabel("Nome:");
		JTextField tfnomeguia = new JTextField(30);
		JLabel lbguia = new JLabel("Escolha o Guia:");
		JComboBox<String> comboguia = new JComboBox<String>();
		
		JButton voltaraddcli = new JButton("Voltar");
		
		
		jpaddguia.setLayout(null);
		
		//Configurações Botão Adicionar
		lbnomeguia.setBounds(510, 5, 180, 40);
		jpaddguia.add(lbnomecli);
		
		//Configurações Botão Editar
		tfnomeguia.setBounds(510, 55, 180, 40);
		jpaddguia.add(tfnomecli);
		
		// Configurações Botão Apagar
		lbguia.setBounds(510, 105, 180, 40);
		jpaddguia.add(lbguia);
		
		// Configurações Botão Voltar Add cliente
		voltaraddcli.setBounds(510, 335, 180, 40);
		voltaraddcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpaddguia.add(voltaraddcli);
		
		
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
