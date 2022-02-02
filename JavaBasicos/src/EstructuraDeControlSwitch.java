import java.util.Scanner;

public class EstructuraDeControlSwitch {
	
	public static void main (String[] args) {
	// Estrcutura de control nos sirve para controlar el flujo de
	// comportamiento de un programa. Para la toma de desciciones
	

	/* Switch(condicion_a_evaluar){
	 case "valor":
	 	//codigo a ejecutar
	 	//break
		 
	 case "n":
		 //codigo a ejecutar
		 //breack
	default:
		//codigo a ejecutar
	}
	
	*/
	
	//Solicitar al usuario un dia de la semana y mostrarle un mensaje
	
	System.out.println("Introduce un dia de la semana y recibe un bonito mensaje :)");
	Scanner sc = new Scanner (System.in);
	String dia = sc.nextLine();
	
	
	switch (dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es vienes, toma un cafe");
			break;
		case "martes":
			System.out.println("Lunes chiquito");
			break;
		case "miercoles":
			System.out.println("Miercoles, pero a que costo.");
			break;
		case "jueves":
			System.out.println("Juebebes");
			break;
		case "viernes":
			System.out.println("Vienes de fiesta hasta morir");
			break;
		default:
			System.out.println("Dia desconocido");
		}
	}
}

