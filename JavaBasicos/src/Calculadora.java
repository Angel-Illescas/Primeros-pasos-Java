import java.util.Scanner;

public class Calculadora {
	
	public static void main (String[] args) {
		/*
		   * Pedir al usuario 2 n�meros por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) Divisi�n
		   * 4) Multiplicaci�n
		   * 
		   * y despues imprimir el resultado
		   */

		System.out.println("INTRODUCE DOS N�MEROS");
		System.out.println("Introduce primer n�mero");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextInt();
		System.out.println("Introduce segundo n�mero");
		Scanner sc1 = new Scanner(System.in);
		double num2 = sc1.nextInt();
		
		System.out.println("�Qu� desea realizar? 1)-Suma 2)-Resta 3)Divisi�n 4)Multiplicaci�n");
		Scanner operacion = new Scanner(System.in);
		int opera = operacion.nextInt();
		double suma = num1 + num2;
		double resta = num1- num2;
		double division = num1 / num2;
		double multiplicacion = num1 * num2;
		
		switch (opera) {
		case 1:
			System.out.println(suma);
			break;
		case 2:
			System.out.println(resta);
			break;
		case 3:
			System.out.println(division);
			break;
		default:
			System.out.println(multiplicacion);
			
			
		}
	}
}
