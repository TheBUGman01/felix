package main;

public class Main {

	public static void main(String[] args) {
		int a = 7;
		System.out.println(a);
		
		
		Vehiculo motoAntonio = new Vehiculo(2, "Moto", "Rojo");
		Vehiculo motoFelix = new Vehiculo(3, "Moto", "Rojo");
		
		
		motoFelix.info();
		
		
		System.out.println();
		motoFelix.añadirRueda();
		motoFelix.info();
		
		System.out.println();
		motoFelix.robarRuedas();
		motoFelix.info();
		
		System.out.println();
		motoFelix.pintarDeVerde();
		motoFelix.info();
		
		System.out.println();
		motoFelix.pintar("Amarillo");
		motoFelix.info();
		
		System.out.println();
		motoFelix.pintar("Morado");
		motoFelix.info();
		
		
		
	}

}
