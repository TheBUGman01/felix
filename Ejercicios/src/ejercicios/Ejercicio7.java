package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7 {
	public static void main(String [] args){
		String numero = JOptionPane.showInputDialog("¿Que numero desea duplicar y triplicar?");
		
		int n= Integer.parseInt(numero);
	
		System.out.println("El doble es " + n*2 );
		System.out.println("El triple es " + n*3 );
		System.out.println("El cuadrado es " + n*n);
		System.out.println("El cubo es " + n*n*n );
	}

}
