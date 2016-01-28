package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio8 {
	public static void main(String [] args){
		String numero = JOptionPane.showInputDialog("Indique grados centigrados");
		int n= Integer.parseInt(numero);
		
		System.out.println(32+(9*n/5));
		
	}
}
