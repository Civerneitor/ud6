import javax.swing.JOptionPane;

public class ejercicio8 {
	final static int T = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[] = new int[T];
		inValores(n);
		ouValores(n);
		
	}
	public static void inValores(int[] n) {
		for(int i=0;i<T;i++) {
			n[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero: "));
		}
	}
	public static void ouValores(int[] n) {
		for(int i=0;i<T;i++) {
			System.out.println("Al �ndice "+i+" le corresponde el n�mero "+n[i]);
		}
	}
}
