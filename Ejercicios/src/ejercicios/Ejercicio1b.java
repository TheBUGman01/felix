package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1b {
	public static void main (String [] args){
		
String numero = JOptionPane.showInputDialog("Indique un Nº");

		double n = Integer.parseInt(numero);
		
		int nc=0;
		while(n >= 1){
			nc++;
			n = n/10;
		}
		JOptionPane.showMessageDialog(null, "El Nº tiene " +nc+" cifras" );
	}
}
