import javax.swing.JOptionPane;
import java.util.Random;
public class ejercicio11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de los arrays: "));
		int n[] = new int[t];
		int n2[] = n; //Apunta al array anterior por lo que lo tratará como un puntero y sobreescibirá sus datos si se intenta modificar
		inValores(n,t);
		n2 = new int[t];
		inValores(n2,t);
		int res[] = multiplica(n,n2);
		for(int i=0;i<res.length;i++) {
			System.out.println("Posición "+i+" de Cada Array:");
			System.out.println("Array1: "+n[i]+" Array2: "+n2[i]+" Array3: "+res[i]);
		}
	}
	public static void inValores(int[] n, int t) {
		for(int i=0;i<t;i++) {
			n[i] = new Random().nextInt(10);
		}
	}
	public static int[] multiplica(int[] n, int[] n2) {
		int[] mult = new int[n.length];
		for(int i=0;i<n.length;i++) {
			mult[i]=n[i]*n2[i];
		}
		return mult;
	}
}