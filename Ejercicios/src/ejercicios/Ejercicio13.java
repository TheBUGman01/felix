package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio13 {
	public static void main(String [] args){
		
		String numero = JOptionPane.showInputDialog(null, "Indica un nº de 3 cifras" );
		int n= Integer.parseInt(numero);

		int centenas = n / 100;
		int decenas = n /10 - centenas * 10;
		int unidades = n - (decenas*10) - (centenas * 100);
		
		
		JOptionPane.showMessageDialog(null,"Centenas ==> " + centenas + " Decenas ==>" + decenas + " Unidades==> " + unidades);
		
		
		// (123 / 10 -centenas*10=2)
	}
}
