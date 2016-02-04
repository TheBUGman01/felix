package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10c {
	
public static void main (String [] args){
		
		String numero1 = JOptionPane.showInputDialog("Indique el Dividendo");
		double n1 = Integer.parseInt(numero1);
		
		String numero2 = JOptionPane.showInputDialog("Indique el Divisor");
		double n2 = Integer.parseInt(numero2);
		
		if(n2==0){
			JOptionPane.showMessageDialog(null,"El divisor es 0 y eso no se puede dividir");
		}else{
			double n3 = n1/n2;
			JOptionPane.showMessageDialog(null,"El resultado es " + n3);
		}
	}
}
