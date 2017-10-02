package TelasCRUD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaExcluirLugar extends JFrame {
	
	String [] dadoslugar = new String[] {"lugar1","lugar2","lugar3"};
	
	public TelaExcluirLugar() {
		JPanel jpapagalugar = new JPanel();
		JLabel lbselec = new JLabel("Selecione o lugar para apagar");
		JComboBox<String> combolugar = new JComboBox<String>(dadoslugar);
		JButton editlugar = new JButton("Apagar");
		JButton voltaraddcli = new JButton("Voltar");
		
		jpapagalugar.setLayout(null);
		
		
		// Configurações lbselecli
		lbselec.setBounds(260, 80, 400, 30);
		jpapagalugar.add(lbselec);
		
		// Configurações combobox
		combolugar.setBounds(150,120,400,40);
		jpapagalugar.add(combolugar);
		
		
		// Configurações Botão editar cliente
		editlugar.setBounds(40, 310, 180, 40);
		editlugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpapagalugar.add(editlugar);
		
		// Configurações Botão Voltar Add cliente
		voltaraddcli.setBounds(480, 310, 180, 40);
		voltaraddcli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaCliente();
			}
		});
		jpapagalugar.add(voltaraddcli);
		
		
		setTitle("TurismoSO v1.0 - Apagar Lugar");
		setVisible(true);
		setSize(700, 408);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(jpapagalugar);
	}
	
	void fechaTelaCliente(){
		this.dispose();
	}
}


