package main;

public class Vehiculo {

	int numeroRuedas;
	String color;
	String nombre;
	
	public Vehiculo(int numeroRuedas, String nomb, String col){
		this.numeroRuedas = numeroRuedas;
		color = col;
		nombre = nomb;
	}
	
	public void info(){
		System.out.println("La " + nombre + " es de color: " + color);
		System.out.println("La " + nombre + " tiene: " + numeroRuedas + " ruedas.");
		
	}
	
	public void añadirRueda(){
		numeroRuedas++;
	}
	
	public void robarRuedas(){
		numeroRuedas = 0;
	}
	
	public void pintarDeVerde(){
		color = "Verde";
		
	}
	
	public void pintar(String c){
		color = c;
	}
	
}
