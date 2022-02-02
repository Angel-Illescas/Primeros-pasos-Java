package Ciclos;

public class Ciclos {
	public static void main(String[] args) {
		
	

	/* int control = 0;
	 
	 while (control < 10) {
		 System.out.println("Control = " + control);
		 control++;
	 	}*/
		
	/* int control = 0;
	 do {
		 System.out.println("Control = " + control);
		 control ++;
	 } while(control < 3); */
		
	for (int i=0; i < 3; i++) {
		if (i % 2 == 0);{// solo se ejecuta cuando el valor de i sea numero mpar 
			continue; // permite saltarnos una ejecucion del ciclo
		}
		System.out.println("Control = " + i);
		}
	
	}
}
}
