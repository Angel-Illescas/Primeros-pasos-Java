package metodo;

public class Metodos {

	//Metodo es una funcion
	//atributos de la clase
	int a, b;
	
	//metodo void (vacio)
	public void sumar () {
		int resultado = a+b;
		System.out.println("");
	}
	
	public int sumaConRetorno() {
		 
			//int resultado = a + b ;
			//return resultado
			
		return a +b ;
	}
	
	//argumentos
	//suma(argumentos)
	
	public int multiplicarConArgumentos(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		return c * d;
	}
		//Método estatico
		//
		public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	
	}
}
