package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import turismoso.Sair;



public class TelaInicial extends JFrame {
	
	/**
	 * Version 1.0.0
	 */
	private static final long serialVersionUID = 1L;

	public TelaInicial(){
		JPanel jp = new JPanel();
		JButton btnc = new JButton("Clientes");
		JButton btng = new JButton("Guias");
		JButton btnl = new JButton("Lugares");
		JButton btnr = new JButton("Relatório");
		JButton btnsu = new JButton("Suporte");
		JButton btnsa = new JButton("Sair");
		jp.setLayout(null);
		
		// Configurações btnCliente 
		btnc.setBounds(35, 35, 200, 147);
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCliente c = new TelaCliente();
				c.criaTelaCliente();
			}
		});
		jp.add(btnc);
		
		// Configurações btnGuias
		btng.setBounds(248, 35, 200, 147);
		btng.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaGuia g = new TelaGuia();
				g.criaTelaGuia();
			}
		});
		jp.add(btng);
		
		// Configurações btnLugares
		btnl.setBounds(460, 35, 200, 147);
		btnl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLugar l = new TelaLugar();
				l.criaTelaLugar();
			}
		});
		jp.add(btnl);
		
		// Configurações btnRelatorio
		btnr.setBounds(35, 200, 200, 147);
		btnr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaRelatorio();
			}
		});
		jp.add(btnr);
		
		// Configurações btnSuporte
		btnsu.setBounds(248, 200, 200, 147);
		btnsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = "Contato: suporte@turismo.com.br\n",tel ="Telefones: 3000-0000 / 98888-8888";
				JOptionPane.showMessageDialog(null, email+tel);
			}
		});
		jp.add(btnsu);
		
		// Configurações btnSair
		btnsa.setBounds(460, 200, 200, 147);
		btnsa.addActionListener(new Sair());
		jp.add(btnsa);
		
		
		
		setTitle("TurismoSO v1.0");
		setVisible(true);
		setSize(700, 408);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(jp);
	}
}
