package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2b {
	public static void main (String [] args){
		
		String numero= JOptionPane.showInputDialog(null, "Introduce un Nº para multiplicarlo");
		int n = Integer.parseInt(numero);
		int i = 0;
		
		System.out.println("La tabla de multiplicar de "+ n +" es =>");
		
		while (i < 11){
			System.out.println(n + " por " + i + " = "+ n*i);
			i++;
		}
	}
}