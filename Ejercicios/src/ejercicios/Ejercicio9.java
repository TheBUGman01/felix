package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio9 {
	public static void main(String [] args){
		String numero = JOptionPane.showInputDialog("Introduzca el radio de la circunferencia");
		int n= Integer.parseInt(numero);
		JOptionPane.showMessageDialog(null, "La longitud de la circunferencia es: "+ 2*(Math.PI)*n);
		JOptionPane.showMessageDialog(null, "El area de la circunferencia es: " + (Math.PI)*n*n);
		
	}
}
