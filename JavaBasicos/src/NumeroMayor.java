import java.util.Scanner;

public class NumeroMayor {
	public static void main (String[] args) {
		/*
		 * Pedir 3 números al usuario y mostrar un mensaje con el
		 * número mayor
		 * */

		
		System.out.println("Introduce primer numero");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Introduce segundo numero");
		Scanner sc1 = new Scanner(System.in);
		int num2 = sc1.nextInt();
		System.out.println("Introduce tercer numero");
		Scanner sc2 = new Scanner(System.in);
		int num3 = sc2.nextInt();
		
			if (num1 > num2) {
			System.out.println("El numero MAYOR es " + num1);
		}   else if (num2 > num3) {
				System.out.println("El numero MAYOR es " + num2);
		} else{
			System.out.println("El numero MAYOR es: " + num3);
		}
	}
}


