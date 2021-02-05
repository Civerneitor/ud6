import javax.swing.JOptionPane;

public class ejercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
		System.out.println("El factorial de "+n+" es "+fact(n));
	}
	public static int fact(int n) {
		int fact = 1;
		for(int i=n;i>0;i--) {
			fact*=i;
		}
		return fact;
	}
}
