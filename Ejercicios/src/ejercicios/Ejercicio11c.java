package ejercicios;
import javax.swing.JOptionPane;

public class Ejercicio11c {
	
		public static void main (String [] args){
			String n = JOptionPane.showInputDialog("Indique una letra");
			
			char c = n.charAt(0);
			int codigo = (int)c;
			System.out.println(codigo);
			
			if(codigo < 91){
				JOptionPane.showMessageDialog(null, n+" SI es mayuscula" );	
				
			}else{
				JOptionPane.showMessageDialog(null, n+" NO es mayuscula" );
				
			}
		}
	}