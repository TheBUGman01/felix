package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7c {
	public static void main (String [] args){
		
		String hh = JOptionPane.showInputDialog("indique la hora");
		String mm = JOptionPane.showInputDialog("indique los minutos");
		String ss = JOptionPane.showInputDialog("indique los segundos");
		
		int h = Integer.parseInt(hh);
		int m = Integer.parseInt(mm);
		int s = Integer.parseInt(ss);
	
		if (h > 23 || h < 0){
			JOptionPane.showMessageDialog(null,"NO es una hora valida");
		}else{
			JOptionPane.showMessageDialog(null,"SI es una hora valida");
		}
		
		if (m > 59 || m < 0){
			JOptionPane.showMessageDialog(null,"NO son unos minutos validos");
		}else{
			JOptionPane.showMessageDialog(null,"SI son unos minutos validos");
		}
		
		if (s > 59 || s < 0){
			JOptionPane.showMessageDialog(null,"NO son unos segundos validos");
		}else{
			JOptionPane.showMessageDialog(null,"SI son unos segundos validos");
		}
		
	}
}
