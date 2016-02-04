
package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio8c {
public static void main (String [] args){
		
		String mes = JOptionPane.showInputDialog("Indique el Nº de un mes");
		int m = Integer.parseInt(mes);
		
		if(m==1){
			JOptionPane.showMessageDialog(null,"El mes es Enero y tiene 31 dias");
		}else if(m==2){
			JOptionPane.showMessageDialog(null,"El mes es Febrero y tiene 28 dias excepto los años bisiestos que tiene 29 dias");
		}else if(m==3){
			JOptionPane.showMessageDialog(null,"El mes es Marzo y tiene 31 dias");
		}else if(m==4){
			JOptionPane.showMessageDialog(null,"El mes es Abril y tiene 30 dias");
		}else if(m==5){
			JOptionPane.showMessageDialog(null,"El mes es Mayo y tiene 31 dias");
		}else if(m==6){
			JOptionPane.showMessageDialog(null,"El mes es Junio y tiene 30 dias");
		}else if(m==7){
			JOptionPane.showMessageDialog(null,"El mes es Julio y tiene 31 dias");
		}else if(m==8){
			JOptionPane.showMessageDialog(null,"El mes es Agosto y tiene 31 dias");
		}else if(m==9){
			JOptionPane.showMessageDialog(null,"El mes es Septiembre y tiene 30 dias");
		}else if(m==10){
			JOptionPane.showMessageDialog(null,"El mes es Octubre y tiene 31 dias");
		}else if(m==11){
			JOptionPane.showMessageDialog(null,"El mes es Noviembre y tiene 30 dias");
		}else if(m==12){
			JOptionPane.showMessageDialog(null,"El mes es Diciembre y tiene 31 dias");
		}else{
			JOptionPane.showMessageDialog(null,"Del 1 al 12 por favor");
		}
		
		
		
	
	}
}
