import javax.swing.JOptionPane;
import java.util.Random;
public class ejercicio12 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tama�o de los arrays: "));
		int n[] = new int[t];
		inValores(n,t);
		int comp = Integer.parseInt(JOptionPane.showInputDialog("Se motrar�n los n�meros del array acabados en (introduce el n�mero de un d�gito o cualquiera, s�lo se recoger�n la unidades)"));

		for(int i=0;i<t;i++) {
			if(n[i]%10==comp%10) System.out.println(n[i]);
		}
	}
	public static void inValores(int[] n, int t) {
		for(int i=0;i<t;i++) {
			n[i] = new Random().nextInt(300)+1;
		}
	}
}