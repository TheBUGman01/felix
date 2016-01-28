package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio6c {
	public static void main (String [] args){
		
		String nu = JOptionPane.showInputDialog("indique un numero");
		String nu2 = JOptionPane.showInputDialog("indique otro numero");
		String nu3 = JOptionPane.showInputDialog("indique otro mas");
		int n = Integer.parseInt(nu);
		int n2 = Integer.parseInt(nu2);
		int n3 = Integer.parseInt(nu3);
		
		int mayorNumero = Integer.MIN_VALUE;
		
		int m = 2147483647;
		m = m + 1;
		System.out.println(m);
		
		
		
		if(n > mayorNumero){
			mayorNumero = n;
		}
		
		if(n2 > mayorNumero){
			mayorNumero = n2;
		}
		
		if(n3 > mayorNumero){
			mayorNumero = n3;
		}
		
		JOptionPane.showMessageDialog(null, mayorNumero + " Es el mayor");
		
		
	}
}


