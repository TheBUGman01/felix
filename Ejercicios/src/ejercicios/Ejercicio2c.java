package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2c {
	public static void main (String [] args){
		
		String numero = JOptionPane.showInputDialog("Indique un numero, por favor");
		int n= Integer.parseInt(numero);
		
		int resto = n%2 ;
		
		if (resto == 0){
			JOptionPane.showMessageDialog(null,n + " Es PAR" );
		}else{
			JOptionPane.showMessageDialog(null,n + " Es IMPAR");
		}
		
		
	}
}
