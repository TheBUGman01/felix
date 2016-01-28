package ejercicios;

public class Ejercicio4 {
	public static void main(String []args){
		
		int a = 2;
		int b = 3;
		int c = b;
		
		System.out.println("Normal");
		System.out.println(a);
		System.out.println(b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Del reves");
		System.out.println(a);
		System.out.println(b);
		
	}
}
