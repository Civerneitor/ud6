import javax.swing.JOptionPane;
import java.util.Random;
public class ejercicio10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tama�o del array: "));
		int n[] = new int[t];
		int min = Integer.parseInt(JOptionPane.showInputDialog("Los n�meros se generar�n aleatoriamente entre (introduce el m�nimo del rango): "));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Y entre (introduce el m�ximo del rango): "));

		inValores(n,t,min,max);
		int mayor = mayorValor(n,t);
		if(prim(mayor)) System.out.println("El mayor valor del vector es "+mayor+" y es un n�mero primo");
		else System.out.println("El mayor valor del vector es "+mayor+" y no es un n�mero primo");
	}
	public static void inValores(int[] n, int t, int min, int max) {
		for(int i=0;i<t;i++) {
			while(!prim(n[i])) n[i] = new Random().nextInt(max-min)+min;
		}
	}
	public static int mayorValor(int[] n, int t) {
		int max = 0;
		for(int i=0;i<t;i++) {
			if(n[i]>max) max=n[i];
		}
		return max;
	}
	public static boolean prim(int n) {
		if(n<2||(n%2==0&&n!=2)) return false;
		for(int i=3; i*i<=n; i+=2) if( n%i==0 ) return false;
		return true;
	}
}