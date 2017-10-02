package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import TelasCRUD.TelaAddGuia;
import TelasCRUD.TelaEditCliente;
import TelasCRUD.TelaEditGuia;
import TelasCRUD.TelaExcluirCliente;
import TelasCRUD.TelaExcluirGuia;

public class TelaGuia extends JFrame{

	
	/**
	 * Version 1.0.0
	 */
	private static final long serialVersionUID = 1L;
	
	String [] colunasguia = {"Guias","Preço Hora","Lugar"};
	Object [][] dadosguia = {
			{"Guia1","R$ 30,00","Lugar1"},
			{"Guia2","R$ 30,00","Lugar2"},
			{"Guia3","R$ 30,00","Lugar3"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"},
			{"Guia4","R$ 30,00","Lugar4"}
	};	

	JTable tabela = new JTable(dadosguia,colunasguia);
	JScrollPane barrarolagem = new JScrollPane(tabela);
	
	void criaTelaGuia(){
		JPanel jp = new JPanel();
		JButton addguia = new JButton("Adicionar");
		JButton editguia = new JButton("Editar");
		JButton apagaguia = new JButton("Apagar");
		JButton voltarguia = new JButton("Voltar");
		
		jp.setLayout(null);
		
		// Configurações Botão Adicionar
		addguia.setBounds(510, 5, 180, 40);
		addguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaAddGuia();
				
			}
		});
		jp.add(addguia);
		
		//Configurações Botão Editar
		editguia.setBounds(510, 55, 180, 40);
		editguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaEditGuia();
			}
		});
		jp.add(editguia);
		
		// Configurações Botão Apagar
		apagaguia.setBounds(510, 105, 180, 40);
		apagaguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaExcluirGuia();
			}
		});
		jp.add(apagaguia);
		
		// Configurações Botão Voltar
		voltarguia.setBounds(510, 335, 180, 40);
		voltarguia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fechaTelaGuia();
			}
		});
		jp.add(voltarguia);
		
		//Configurações Tabela
		barrarolagem.setBounds(0, 0, 507, 500);
		jp.add(barrarolagem);
		
		setTitle("TurismoSO v1.0 - Guias");
		setVisible(true);
		setSize(700, 408);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(jp);
	}
	
	void fechaTelaGuia(){
		this.dispose();
	}

}
