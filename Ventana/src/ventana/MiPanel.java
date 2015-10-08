package ventana;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MiPanel extends JPanel  {

	public MiPanel() {
		Color c = Color.RED;
		setBackground(c);
		
		
		MouseListener ml = new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int r = (int) (Math.random()*255);
				int g = (int) (Math.random()*255);
				int b = (int) (Math.random()*255);
				Color c = new Color(r,g,b);
				setBackground(c);
			}

			
			
		};
		addMouseListener(ml);
		
		MouseMotionListener mml = new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				double x = e.getX();
				double y = e.getY();
				//cambiarColor(x,y);
				
			}
		};
		addMouseMotionListener(mml);
		
		Thread t = new Thread(new Runnable() {
			int i = 0;
			@Override
			public void run() {
				while(true){
					i++;
					double x = Math.cos(i/30.0);
					double y = Math.sin(i/30.0);
					cambiarColor(x,y);
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		t.start();
	}

	
	public void cambiarColor( double x , double y){
		
		
		int r = (int) (((x+1.0)/2.0)*255.0);// es la X de la pantalla 0-1500 ->> 0-255
		int g = (int) (((y+1.0)/2.0)*255.0);// es la Y de la pantalla
		int b = 0;
		Color c = new Color(r,g,b);
		setBackground(c);
	}
	
}
