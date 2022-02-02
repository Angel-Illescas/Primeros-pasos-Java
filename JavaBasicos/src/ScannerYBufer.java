import java.util.Scanner;

public class ScannerYBufer {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int numero1 = sc.nextInt();
		sc.nextLine();
		
		
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		
		
		System.out.println("Introduce otro número");
		int numero2 = sc.nextInt();
		
		sc.close();		
		
		System.out.println("Tu nombre es: " + nombre + " Número 1: " + numero1 + " Número 2: "+ numero2);
	
		
		
	}

}
