package main;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

	public Ventana(){
		setSize(1000, 800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new MiPanel());
	}
}
