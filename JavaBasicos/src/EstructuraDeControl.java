import java.util.Scanner;

public class EstructuraDeControl {

	public static void main (String[] args) {
		/*if (condicion) {
		codigo
	} else {
		codigo
	} */
	
	System.out.println("Introduce tu edad");
	Scanner sc = new Scanner(System.in);
	int edad = sc.nextInt();
	
	if (edad >=18) {
		System.out.println("Eres mayor de edad");
	} else {
		System.out.println("Eres menor de edad");
	}
  }
}
