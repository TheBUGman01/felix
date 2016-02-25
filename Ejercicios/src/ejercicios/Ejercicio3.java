package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main (String [] args){

		String numero = JOptionPane.showInputDialog("Indique un Nº");
		int n = Integer.parseInt(numero);
		
		int i = 0;
		
		System.out.println("La tabla de multiplicar de "+n+" es");
		
		
		while (i<11){
			System.out.println(n+"*"+i+"="+i*n);
			i++;
			
		}
		
	}
}