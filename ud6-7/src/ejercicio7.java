import javax.swing.JOptionPane;

public class ejercicio7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de euros: "));
		String d = JOptionPane.showInputDialog("Introduce el nombre de la divisa a cambiar: ");
		muestraCambio(n,d);
	}
	public static void muestraCambio(double n, String d) {
		switch(d) {
		case "libra":
			n*=0.86;
			System.out.println("La cantidad de euros introducida equivale a "+n+" Libra/s.");
			break;
		case "dolar":
			n*=1.28611;
			System.out.println("La cantidad de euros introducida equivale a "+n+" Dolar/es.");
			break;
		case "yen":
			n*=129.852;
			System.out.println("La cantidad de euros introducida equivale a "+n+" Yen/es.");
			break;
		default:
			d = JOptionPane.showInputDialog("Divisa incorrecta. Introduce el nombre de la divisa a cambiar: ");
			muestraCambio(n,d);
		}
		
	}
}
