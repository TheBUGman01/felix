package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3c {
	public static void main (String [] args){
		String numero = JOptionPane.showInputDialog("Indique un numero");
		int n = Integer.parseInt(numero);
		
		if (n < 0){
			JOptionPane.showMessageDialog(null, n + " es NEGATIVO");
		}
		
		if (n > -1){
			JOptionPane.showMessageDialog(null, n + " es POSITIVO");
		}
		int resto = n%2;
		
		if (resto == 0){
			JOptionPane.showMessageDialog(null, n + " es PAR");
		}else{
			JOptionPane.showMessageDialog(null, n + " es IMPAR");
		}
		
		int resto2 = n%5;
		if (resto2 == 0){
			JOptionPane.showMessageDialog(null, n + " es multiplo de 5");
		}else{
			JOptionPane.showMessageDialog(null, n + " NO es multiplo de 5");
		}
		int resto3 = n%10;
		if (resto3 == 0){
			JOptionPane.showMessageDialog(null, n + " es multiplo de 10");
		}else{
			JOptionPane.showMessageDialog(null, n + " NO es multiplo de 10");
		}
		
		if (n < 100){
			JOptionPane.showMessageDialog(null, n + " es menor que 100");
		}
		
		if (n > 100){
			JOptionPane.showMessageDialog(null, n + " es mayor que 100");
		}
	}
}
