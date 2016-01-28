package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio5c {
	public static void main (String [] args){
		String n = JOptionPane.showInputDialog("Indique una palabra");
		String m = JOptionPane.showInputDialog("Indique otra palabra");
		
		if (m.equals(n)){
			JOptionPane.showMessageDialog(null,n+" y "+m+""+ " Las PALABRAS son iguales");
		}else{
			JOptionPane.showMessageDialog(null,n+" y "+m+""+ " Las PALABRAS NO son iguales");
		}
		
		
		
	}
}