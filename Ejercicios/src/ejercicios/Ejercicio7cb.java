package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7cb {
	public static void main (String [] args){
		
		String hh = JOptionPane.showInputDialog("indique la hora");
		String mm = JOptionPane.showInputDialog("indique los minutos");
		String ss = JOptionPane.showInputDialog("indique los segundos");
		
		int h = Integer.parseInt(hh);
		int m = Integer.parseInt(mm);
		int s = Integer.parseInt(ss);
	
		if ((h > 23 || h < 0) || (m > 59 || m < 0) || (s > 59 || s < 0)){
			JOptionPane.showMessageDialog(null,"NO es una hora valida");
		}else{
			String hs = "" + h;
			if ((h<10) ){
				hs = "0" + h;
			}
			String ms = "" + m;
			if ((h<10) ){
				ms = "0" + m;
			}
			String ss1= "" + s;
			if ((h<10) ){
				ss1 = "0" + s;
			}
			
			JOptionPane.showMessageDialog(null,"La hora "+hs+" : "+ms+" : "+ss1+" es valida" );
		}
	}
}
