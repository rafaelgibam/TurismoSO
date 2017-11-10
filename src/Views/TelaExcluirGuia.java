package Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaExcluirGuia extends JFrame {
	
	String [] dadosguia = new String[] {"guia1","guia2","guia3"};
	
	public TelaExcluirGuia() {
		JPanel jpapagaguia = new JPanel();
		JLabel lbseleguia = new JLabel("Selecione o guia para apagar");
		JComboBox<String> comboguia = new JComboBox<String>(dadosguia);
		JButton editguia = new JButton("Apagar");
		JButton voltaraddcli = new JButton("Voltar");
		
		jpapagaguia.setLayout(null);
		
		
		// Configurações lbselecli
		lbseleguia.setBounds(260, 80, 400, 30);
		jpapagaguia.add(lbseleguia);
		
		// Configurações combobox
		comboguia.setBounds(150,120,400,40);
		jpapagaguia.add(comboguia);
		
		
		// Configurações Botão editar cliente
		editguia.setBounds(40, 310, 180, 40);
		editguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpapagaguia.add(editguia);
		
		// Configurações Botão Voltar Add cliente
		voltaraddcli.setBounds(480, 310, 180, 40);
		voltaraddcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpapagaguia.add(voltaraddcli);
		
		
		setTitle("TurismoSO v1.0 - Apagar Guia");
		setVisible(true);
		setSize(700, 408);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(jpapagaguia);
	}
	
	void fechaTelaCliente(){
		this.dispose();
	}
}


