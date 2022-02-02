import java.util.Scanner;

public class EjercicioComprasyDescuentos {

	public static void main (String [] args) {
	
		// si la cuenta es de menos de 1000
				// sila cuenta es de 1000 - 4999 10%
				// si la cuenta es de 5000 a 9999 20%
				// si la copra es de 10000 o más 30%

	
	System.out.println("¿Cuál es el total de tu compra?");
	Scanner sc = new Scanner(System.in);
	double compra = sc.nextDouble();
	double compra10 = compra * .90;
	double compra20 = compra * .80;
	double compra30 = compra * .70;
	
	if (compra >= 0 && compra <= 999){
		System.out.println("El total es: " + compra + " (No se aplico descuento)");
		} else if (compra >= 1000 && compra < 5000) {
			System.out.println("El total es: $" + compra10 + " Con un descuento del 10%");
		} else if (compra >= 5000 && compra < 10000) {
			System.out.println("El total es: $" + compra20 + " Con un descuento del 20%");
		} else {
			System.out.println("El total es: $" + compra30 + " Con un descuento del 30%");
		}
	
	}
}
