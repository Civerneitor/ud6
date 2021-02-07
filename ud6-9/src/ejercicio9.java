import javax.swing.JOptionPane;
import java.util.Random;
public class ejercicio9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array: "));
		int n[] = new int[t];
		inValores(n,t);
		ouValores(n,t);
		
	}
	public static void inValores(int[] n, int t) {
		for(int i=0;i<t;i++) {
			
			n[i] = new Random().nextInt(10);
		}
	}
	public static void ouValores(int[] n, int t) {
		int sum = 0;
		for(int i=0;i<t;i++) {
			System.out.println("Al índice "+i+" le corresponde el número "+n[i]);
			sum+=n[i];
		}
		System.out.println("La suma de todos los valores del array nos da el número "+sum);;
	}
}