import java.util.HashSet;
import java.util.Set;

public class Colecciones {
 public static void main(String[] args) {
	//La colecciones nos sirven para almacenar un conjunto de objetos
	 //La dif entre collecion y los objetos
	 //las COLECCIONES son dinamicas, o sea pueden crecer
	 
	 
	 //Set tiene 3 implemenatciones
	 
	 // *Set* 
	 // -No puede contener elementos reptidos 
	 //     >- HashSet -<
	 //     -Los elementos no mantiene un orden 
	 
	 Set <String> frutas = new HashSet<String>();
	 frutas.add("mango");
	 frutas.add("granda");
	 frutas.add("piña");
	 frutas.add("sandia");
	 frutas.add("mamey");
	 frutas.add("fresa");
	 
	 for (String fruta : frutas) {
		 
		 System.out.println(fruta);
		 
	 }
	 
	 
	 
	
	 
 }
}
