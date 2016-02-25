package ejercicios;

public class EjercicioMultiplos300 {

	public static void main (String [] args){
		int i = 0;
		
		System.out.println("Los multiplos de 3 desde 0 a 300 son");
		
		while (i < 301){
			i++;
			System.out.println(i%3 + " es multiplo de 3" );
		}
	}
}