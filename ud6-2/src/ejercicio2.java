import javax.swing.JOptionPane;
import java.util.Random;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de elementos del array: "));
		int nums[] = new int[x];
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número más pequeño comprendido generado: "));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número más grande comprendido generado: "));

		for(int i=0; i<x; i++) {
			Random aux = new Random();
			nums[i] = aux.nextInt(max-min)+min;
			System.out.println(nums[i]);
		}
	}
}
