import java.util.Scanner;

public class EjercicioTriangulo {
	public static void main (String [] args) {
		
		/*Pedirle 3 �ngulos a un usuario y decirle si es un triangulo v�lido */
		
		System.out.println("Para conocer si los datos pertenece a un tri�ngulo, introduce lo siguiente:");
		System.out.println("Primer �ngulo interno:");
		Scanner sc = new Scanner(System.in);
		int ang1 = sc.nextInt();
		System.out.println("Introduce segundo �ngulo interno:");
		Scanner sc1 = new Scanner(System.in);
		int ang2 = sc1.nextInt();
		System.out.println("Introduce tercer angulo interno:");
		Scanner sc2 = new Scanner(System.in);
		int ang3 = sc2.nextInt();
		int suma = ang1 + ang2 + ang3 ;
		
			if (suma == 180) {
			System.out.println("Si es un tri�ngulo");
		}   else{
			System.out.println("No es un tri�ngulo");
		}
		
	}

}
