import javax.swing.JOptionPane;

public class ejercicio6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero natural: "));
		while(n<0) n = Integer.parseInt(JOptionPane.showInputDialog("No has introducido un n�mero natural. Por favor, introduce un n�mero natural: "));
		int c= 0;
		while(n>0) {
			n/=10;
			c++;
		}
		System.out.println("El n�mero introducido contiene "+c+" cifras.");
	}
}
