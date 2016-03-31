package psn;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel {

	private ArrayList<Dibujable>dibujables = new ArrayList<>();

	public Panel(){
		
		for(int i=0;i<720;i++){
			double rad = (float) Math.toRadians(i);
			Dibujable pelota = new Dibujable();
			pelota.setPosicion(800,400);
			pelota.setVelocidad((float)(Math.cos(rad)*Math.random()*2),(float)(Math.sin(rad)*Math.random()*2));
			dibujables.add(pelota);
			}
		
		/*for(int i=0;i<360;i++){
		double rad = (float) Math.toRadians(i);
		Dibujable pelota = new Dibujable();
		pelota.setPosicion(800,400);
		pelota.setVelocidad((float)(Math.cos(rad)*10f),(float)(Math.sin(rad)*3f));
		dibujables.add(pelota);
		}*/
		
	
		
		
		
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true){
					repaint();
				}
			}
		});
		
		t.start();
		super.setBackground(Color.BLACK);
	}
	@Override
	public void paint (Graphics g){
		super.paint(g);

		for(Dibujable d : dibujables){
			d.dibujar(g);
			d.mover();
		}

	}

}
