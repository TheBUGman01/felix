package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12c {
	public static void main (String [] args){
	
	String numero1 = JOptionPane.showInputDialog("Nº 1 de 5");
	int n1 = Integer.parseInt(numero1);
	
	String numero2 = JOptionPane.showInputDialog("Nº 2 de 5");
	int n2 = Integer.parseInt(numero2);
	
	String numero3 = JOptionPane.showInputDialog("Nº 3 de 5");
	int n3 = Integer.parseInt(numero3);
	
	String numero4 = JOptionPane.showInputDialog("Nº 4 de 5");
	int n4 = Integer.parseInt(numero4);
	
	String numero5 = JOptionPane.showInputDialog("Nº 5 de 5");
	int n5 = Integer.parseInt(numero5);
	
	int v=0;
	
	if (n1%10==2){
		v++;
	}
	if (n2%10==2){
		v++;
	}
	if (n3%10==2){
		v++;
	}
	if (n4%10==2){
		v++;
	}
	if (n5%10==2){
		v++;
	}
	JOptionPane.showMessageDialog(null,"Hay "+ v +" de 5 Nºs que acaben en 2");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}