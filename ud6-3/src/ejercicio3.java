import javax.swing.JOptionPane;

public class ejercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero: "));
		if(prim(n)) System.out.println(n+" es un n�mero primo");
		else System.out.println(n+" no es un n�mero primo");
	}
	public static boolean prim(int n) {
		if(n<2||(n%2==0&&n!=2)) return false;
		for(int i=3; i*i<=n; i+=2) if( n%i==0 ) return false;
		return true;
	}
}
