package Ciclos;

import java.util.Scanner;

public class EjercicioNombre {
	public static void main(String[] args) {
		
		System.out.println("Escibe tu nombre");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		
		
		
		for (int i=0; i<nombre.length();i++) {
			System.out.println(nombre.charAt(i));
		}
		
		
		
	}

}
