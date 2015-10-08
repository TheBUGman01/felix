package ventana;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	public Ventana(int ancho, int alto) {
		setSize(ancho, alto);
		
		//variable de tipo MiPanel de nombre p
		MiPanel p = new MiPanel();
		
		setContentPane(p);
		
		
	}

}
