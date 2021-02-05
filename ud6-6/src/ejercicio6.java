import javax.swing.JOptionPane;

public class ejercicio6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número natural: "));
		while(n<0) n = Integer.parseInt(JOptionPane.showInputDialog("No has introducido un número natural. Por favor, introduce un número natural: "));
		int c= 0;
		while(n>0) {
			n/=10;
			c++;
		}
		System.out.println("El número introducido contiene "+c+" cifras.");
	}
}
