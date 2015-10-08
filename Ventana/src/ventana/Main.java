package ventana;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String [] args) {
		//Una variable de tipo Ventana y de nombre v
		
		//Tipo Nombre = Valor
		  Ventana v = new Ventana(1500,1000);
		  v.setVisible(true);
		  v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  
	}

}
