import javax.swing.JOptionPane;

public class ejercicio5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
		System.out.println("El número en binario es: "+binario(n));
	}
	public static String binario(int n) {
		String bin = "";
		if(n>=1) {
			bin+=binario(n/2);
			return bin+=(n%2);
		}
		return bin;
	}
}
