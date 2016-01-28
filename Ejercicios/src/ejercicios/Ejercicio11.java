package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11 {
	
	public static void main (String [] args){
		String numero = JOptionPane.showInputDialog("Introduzca la longitud del cateto 1");
		String numero2 = JOptionPane.showInputDialog("Introduzca la longitud del cateto 2");
		int n= Integer.parseInt(numero);
		int n2= Integer.parseInt(numero2);
		
		JOptionPane.showMessageDialog(null,"La Hipotenusa es: " + Math.sqrt(n2*n2 + n*n));


		
	}
}
