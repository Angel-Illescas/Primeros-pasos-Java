package operadores;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		//Operadores Aritmeticos
		// + - / * %
		
		int a = 10;
		int b = 20;
		double c = 10.0;
		
		//int c = a + b; 
		// System.out.print(c);
		
		String str1 = "El resultado de la suma es:";
		System.out.println(str1 + c);
		//Operador de resta
		System.out.println("El resultado de la resta: " + (a-b));
		
		//Division
		int division = a / b;
		System.out.println("El resultado de la division es: " + division);
		
		double division2 = (double) a / b;
		System.out.println("El resultado de la division es: " + division2);
		
		//multiplicacion
		
		double multiplicacion = c * a;
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
		
		//modulo
		
		double modulo = a % c;
		System.out.println("El resultado de modulo es: " + modulo);
		
		// operador de asignacion
		int d = 5, e; //iniciar las variables vacias;
		e = 6;
		System.out.println(d + ", "+ e);
		
		//Operador de declaracion compuesta
		// +=   -=   /=   %=  *=
		//Operacion simplificada
		
		int f = 0, g = 5;
		 f += 5;
		 // f = f + 5
		System.out.println(f);
		
		//Operadores relacionales
		// <  >  <=  =>
		// ==igualdad !=noiguala(diferencia)
		//Resutado un valor de tipo boolean
		
		int h = 15, i=25;
		String j = "hola";
		System.out.println(h > i);
		System.out.println(i != h);
		//System.out.println(h != j);
		
		
		//Operador unario
		// ++ ---
		//Preasignacion : ++k se le asigna un valor antes de usarse
		//posasignacion : k++ primero lee el valor y despues le suma 1
		
		int k = 0, l = 0;
		System.out.println(k++);
		
		//Precedencia de operadores
		
		int operacion = 4 + 5 * 6 / 3;
		System.out.println(operacion);
		
		int x = 0, y =0;
		int operacion2 = ++x +y--;
		System.out.println(operacion2);
		
		//operador ternario
		//es un if . else abreviado
		//solo nos permite tomar una decision
		int edad = 19, valor1 = 0, valor2 = 1;
		int resutado = (edad <=18) ? valor1 : valor2;
		System.out.println(resutado);
		
		
		//operador lógico
		//And - &&
		//or - ||
		
		System.out.println(true && true); //true
		System.out.println(true && false); // false
		System.out.println(true || true); // true
		System.out.println(true && !false); // true
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int num = sc.nextInt();
		System.out.println(num);
	}
}
