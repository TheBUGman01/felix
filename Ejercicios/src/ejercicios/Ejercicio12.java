package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12 {
	public static void main(String [] args){
		String numero = JOptionPane.showInputDialog("Indique el radio de la circunferencia");
		int n= Integer.parseInt(numero);
		
		JOptionPane.showMessageDialog( null, "El volumen de la circunferencia es " + (4/3)*(Math.PI)*Math.pow(n, 3));
		
		
		
	}
}
