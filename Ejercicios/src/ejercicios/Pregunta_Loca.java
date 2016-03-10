package ejercicios;

import javax.swing.JOptionPane;

public class Pregunta_Loca {
	public static void main (String [] args){
		//Pregunta al usurio un numero y hasta que lo responda 7 no se acaba el programa.
		
		String rsp2 = "seña";
		
		String prt2 = JOptionPane.showInputDialog("Introduzca la CONTRAseña");
		
		while (!(rsp2.equals(prt2))){
			String fail2 = JOptionPane.showInputDialog("Introduzca otra CONTRAseña");
			prt2 = fail2;
		}
		
		
		int rsp = 7;
		
		String prt = JOptionPane.showInputDialog("Indique un Nº");
		int p = Integer.parseInt(prt);
		
		while (p != rsp){
			String fail = JOptionPane.showInputDialog("Indique otro Nº");
			p = Integer.parseInt(fail);
		}
		
		System.out.println("Enhorabuena, has derrochado tiempo de tu vida en este programa inutil ahora por favor apaga el ordenador y sal a la calle a hacer algo util para tu vida.");
		System.out.println("Si has salido a la calle no se como sigues leyendo esto pero de todas formas no tines por que seguir sentado aqui te recuerdo que siges perdiendo tiempo.");
		System.out.println("Si a estas alturas sigues sigues leyendo esto acabas de perder a tu novi@ y si no tenias sigue leyendo.");
		System.out.println("Ahora en serio que haces aqui; yo ahora mismo me esto partiendo de risa por que estoy con tu novi@ y te estamos viendo leer.");
		System.out.println("Si este programa te hackeea la camara y sinceramente eres muy feo.");
		System.out.println("Me voy a cenar con tu novi@. Ah! un consejo...");
		System.out.println("Comprate un amigo pero no te compres dos que te marginan");
		System.out.println("Bueno como veo que no te vas te he preparado un juego disfrutalo");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String a = "Si";
		String b = "No";
		String c = "Sal de mi cabeza";
		String d = "Que narices es esto claro que NO";
		JOptionPane.showMessageDialog(null,"Bienvenido si sabes por que estas aqui dale a continuar si no ve abajo y leelo");
		String inicio = JOptionPane.showInputDialog(null, "Antes de empezar debo saber si estas de acuerdo con mis condiciones asi que por favor escriba las siguientes opciones"+"\n a)"+a+"\n b)"+b+"\n c)"+c+"\n d)"+d);
		
		
	}
}
