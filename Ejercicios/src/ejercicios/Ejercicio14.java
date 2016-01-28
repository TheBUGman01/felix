package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio14 {
	public static void main(String [] args){
		
		String numero = JOptionPane.showInputDialog(null, "Indica un nº de 5 cifras" );
		int n= Integer.parseInt(numero);
		
		int decenasDeMillar = n/10000;
		int unidadesDeMillar = n/1000-decenasDeMillar*10;
		int centenas = (n-(unidadesDeMillar*1000)-(decenasDeMillar*10000))/100;
		int decenas = (n-(unidadesDeMillar*1000)-(decenasDeMillar*10000)-(centenas*100))/10;
		int unidades = (n-(unidadesDeMillar*1000)-(decenasDeMillar*10000)-(centenas*100)-(decenas*10));
		
		System.out.println(decenasDeMillar);
		System.out.println(unidadesDeMillar);
		System.out.println(centenas);
		System.out.println(decenas);
		System.out.println(unidades);
		
		
		
	}
}
