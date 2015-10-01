package main;

public class Main {
	
	public static void main(String [] args) {
		//args= ["..", "..", "..", "..",....] Esto es un array que es como una "lista" de variables del mismo tipo
		
		
		String[] miArray = {"manzana" ,"pera", "fresa"};
		
		int n = 0;
		
		n++;
		n = n + 1;
		
		log(miArray [n]);
		
		//un array de 100 nº enteros
		int numElementos = 50;
		int[] a = new int[numElementos];
		
		a[0] = 66;
		a[1] = 13;
		System.out.println(a[0]);
		for(int i = 0; i < numElementos; i++){
			a [i] = i;
		}
		
		
		imprimirTodo(a);
		
	}

	//los arrays tienen una propiedad llamada lenght
	public static void imprimirTodo(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	
	
	
	private static void log(String string) {
		//string = "...."
		System.out.println(string);		
	}
	
}
