import java.util.Scanner;

public class EjercicioTriangulo {
	public static void main (String [] args) {
		
		/*Pedirle 3 ángulos a un usuario y decirle si es un triangulo válido */
		
		System.out.println("Para conocer si los datos pertenece a un triángulo, introduce lo siguiente:");
		System.out.println("Primer ángulo interno:");
		Scanner sc = new Scanner(System.in);
		int ang1 = sc.nextInt();
		System.out.println("Introduce segundo ángulo interno:");
		Scanner sc1 = new Scanner(System.in);
		int ang2 = sc1.nextInt();
		System.out.println("Introduce tercer angulo interno:");
		Scanner sc2 = new Scanner(System.in);
		int ang3 = sc2.nextInt();
		int suma = ang1 + ang2 + ang3 ;
		
			if (suma == 180) {
			System.out.println("Si es un triángulo");
		}   else{
			System.out.println("No es un triángulo");
		}
		
	}

}
