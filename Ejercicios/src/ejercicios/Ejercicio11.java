package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11 {
	
	public static void main(String [] args){
		String numero1 = JOptionPane.showInputDialog("Indique un cateto");
		String numero2 = JOptionPane.showInputDialog("Indique otro cateto");
		
		double a = Double.parseDouble(numero1);
		double b = Double.parseDouble(numero2);
		double c = Math.sqrt((a*a) +(b*b));
		
		JOptionPane.showMessageDialog(null,c);
		
		
	}
}
