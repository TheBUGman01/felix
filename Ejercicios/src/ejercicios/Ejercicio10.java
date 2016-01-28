package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10 {
	public static void main (String [] args){
		String numero = JOptionPane.showInputDialog("Introduzca una velocidad Km/h");
		int n= Integer.parseInt(numero);
		JOptionPane.showMessageDialog(null, "Su velocidad en Km/h es " + n + " y en m/s es " + n*1000/3600);

	}
}
