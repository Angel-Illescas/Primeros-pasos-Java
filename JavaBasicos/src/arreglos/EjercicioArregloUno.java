package arreglos;

public class EjercicioArregloUno {
	public static void main(String[] args) {
		/*Crea una clase llamara ManipularArreglo
		crea un array con los siguientes n�meros enteros:

		1, 6, 45, 53, 80, 102, 145, 326, 450, 892
		Crea un programa que use un ciclo que tome los n�meros de arreglo y devuelva la suma total,
		 la suma de los n�meros pares y la suma de los n�meros impares. */
		
		int []nums = new int[] { 1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int suma = 0;
		int sumaPar = 0;
		int sumaImp = 0;
		
		
		for (int i=0 ; i<nums.length; i++) { 
			suma = suma + nums[i];
		
			if(nums[i] % 2 == 0) {
				sumaPar = sumaPar + nums[i];
			} else {
			sumaImp = sumaImp + nums[i];
			}
		}
		
		System.out.println("La suma es igual a : " + suma);
		System.out.println("La suma impar es igual a : " + sumaImp);
		System.out.println("La suma par es igual a : " + sumaPar);
			
		
	}
}
