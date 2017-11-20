package Views;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadCadastro extends Thread {
	
	public static int contador;
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			TelaGuia guiav = new TelaGuia();
			ImageIcon image = new ImageIcon("carregando.gif");
			
			
			JOptionPane.showMessageDialog(null,"Message","Guia adicionado com sucesso!",JOptionPane.INFORMATION_MESSAGE,image);
			
			contador++;
		}
	}
}
