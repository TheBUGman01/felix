package main;

public class Main {

	public static void main(String[] args) {
		
		String mensaje = "Hola Mundo ";
		String mensaje2 ="Estais todos lokos " ;
		
		System.out.println(mensaje);
		System.out.println(mensaje2);
		
		System.out.println(mensaje + "\n" + mensaje2);
		System.out.println();
		
												//Tipos de variables
		int n = 5; 
		int n2 = 7;
		System.out.println("Suma");
		System.out.println(n +n2);
		System.out.println();
		
		System.out.println("Concateración");
		System.out.println(n + "" + n2);
		System.out.println();
		log("Hola k ase?");
		System.out.println();
		log("Llamada al metodo suma (5, 6)");
		
		suma(5, 6);
		
		
		
		
	}
	
	public static void log(String s){
		System.out.println(s);
		
	}
	public static void suma (int n1, int n2){
		log("" + (n1 + n2));
	}
	
}
