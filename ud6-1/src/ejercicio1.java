import javax.swing.JOptionPane;

public class ejercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fig = JOptionPane.showInputDialog("Introduce la figura de la que quieres calcular el �rea");
		switch(fig) {
		case "Circulo":
			double r = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio: "));
			System.out.println("El �rea del circulo es: "+Math.PI*Math.pow(r, 2));
			break;
		case "Triangulo":
			double b = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base: "));
			double a = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura: "));
			System.out.println("El �rea del triangulo es: "+(b*a)/2);
			break;
		case "Cuadrado":
			double c = Double.parseDouble(JOptionPane.showInputDialog("Introduce un cateto: "));
			System.out.println("El �rea del cuadrado es: "+c*c);
			break;
	    default:
	    	System.out.println("Introduce una figura v�lida (Circulo, Triangulo o Cuadrado)");
		}
		
	}
}
