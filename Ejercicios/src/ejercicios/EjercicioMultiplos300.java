package ejercicios;

public class EjercicioMultiplos300 {

	public static void main (String [] args){
		int i = 0;
		int a = 3;
		
		System.out.println("Los multiplos de 3 desde 0 a 300 son");
		
		while (i < 301/3){
			
			i++;
			int num = (a * i);
			System.out.println(num + " es multiplo de 3");
			
		}
	}
}