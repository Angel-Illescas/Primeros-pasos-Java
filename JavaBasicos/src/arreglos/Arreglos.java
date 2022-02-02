package arreglos;

public class Arreglos {
	public static void main(String[] args) {
		//Solo un tipo de dato
		//especificar el tamaño o la cantidad de elemtos que va a contener
		
		//MANERA 1
		
		int numeros[]; //Creamos la variable
		numeros = new int[4]; //Creamos el arreglo
		
		//MANERA 2
		
		String[] nombres = new String[4]; // Basado en 0 [0,1,2,3,4]
		
		numeros[0] = 10;
		numeros [1]= 8;
		numeros [2]= 100;
		numeros [3]= 200;
		
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		nombres[3] = "Felipe";
		
		//Arreglo Literal
		String []nombreFrutas = new String[] { "Manzana", "Platano", "Uva", "Pera"};
	
		
		System.out.println(numeros[0]);
		
		for (int i=0 ; i<numeros.length; i++) { //En Array, leng es una propiedad, no un metodo, por eso no lleva parentesis
		System.out.println("Elemento de números " + numeros[i]);
		}
		
		
		
		for (int i=0 ; i<nombres.length; i++) { //En Array, leng es una propiedad, no un metodo, por eso no lleva parentesis
		System.out.println("Elemento de nombres " + nombres[i]);
		}
		
		for (int i=0 ; i<nombreFrutas.length; i++) { //En Array, leng es una propiedad, no un metodo, por eso no lleva parentesis
			System.out.println("Elemento de frutas " + nombreFrutas[i]);
			}
		
		
	}
}
