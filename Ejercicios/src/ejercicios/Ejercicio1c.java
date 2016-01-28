package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1c {
	public static void main(String [] args){
		String numero = JOptionPane.showInputDialog("Indique un numero");
		int n = Integer.parseInt(numero);
		
		if (n < 0){
			JOptionPane.showMessageDialog(null, n + " Es NEGATIVO");
		}
		
		if (n > -1){
			JOptionPane.showMessageDialog(null,n + " Es POSITIVO");
		}

	}
}
