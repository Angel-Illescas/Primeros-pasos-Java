
public class ConversionDatos {
	
	public static void main(String[] args) {
		
		byte numeroByte = 10;
		
		short numeroShort = numeroByte;
		
		int numeroInt = numeroShort;
		
		long numeroLong = numeroInt;
		
		int otroInt = (int)numeroLong;
		
		short otroShort = (short) otroInt;
		
		short numero1 = 123;
		short numero2 = 7343;
		byte numero3 = 12;
		byte numero4 = 33;
		
	// short suma = numero1 + numero2; // nos da error porque para java se convierte en un int aunque quepa en un short aun
		
		short suma = (short) (numero1 +  numero2);
		
		byte suma2 = (byte) (numero3 + numero4);
		int suma3 = numero3 + numero4; // o este seria la otra solucion, pero se utiliza la primera para optimizar la memoria
		short suma4 = (short) (numero1 + numero3);
		
	}
}
