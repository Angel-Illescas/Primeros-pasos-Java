/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;*/

import java.util.*; // Mejor se usa que todo lo de arriba 

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
	 
/*	
 	 Set <String> frutas = new HashSet<String>();
	 frutas.add("mango");
	 frutas.add("granda");
	 frutas.add("piña");
	 frutas.add("sandia");
	 frutas.add("mamey");
	 frutas.add("fresa");
	 
	 //foreach, puede recorrer una coleccion y en cada 
	 // recorrido recupera el valor y lo podemos almacenar
	 //en un varaible
	 
	 // Sintaxis "Es el equivalente a foreach, pero de Java"
	 // for ( tipoDeDatoElemento variable : elementoARecoger
	 for (String fruta : frutas) { 
		 System.out.println(fruta);
	 }
*/	 
	 
	 /* > TreeSet <*/
	 //-Implementacion que ordena los valores, pero es la mas lenta 
	 
	/* Set <String> frutas = new TreeSet <String>();
	 frutas.add("mango");
	 frutas.add("granda");
	 frutas.add("piña");
	 frutas.add("sandia");
	 frutas.add("mamey");
	 frutas.add("fresa");
	 
	 for (String fruta : frutas) { 
		 System.out.println(fruta);
	 }
	 */
	 
	 /* > LinkedHashSet < */
	 // -Ordena los elementos en orden de inserción y es
	 //  mas costoso que HashSet
	 /*
	 Set <String> frutas = new LinkedHashSet <String>();
	 frutas.add("mango");
	 frutas.add("granda");
	 frutas.add("piña");
	 frutas.add("sandia");
	 frutas.add("mamey");
	 frutas.add("fresa");
	 
	 for (String fruta : frutas) { 
		 System.out.println(fruta);
	 }
	 */
	 
	//Orden de velocidad 
	//1.HashSet
	//2.LinkedHashSet
	//3.TreeSet

	 
	 //>> List
	 //		ArrayList
	 //		LinkedList
	 // -Acedder a elementos y buscar elementos 
	 
	 // >ArrayList<
	 
	  
	 List<String> pokemones = new ArrayList<String>();
	 pokemones.add("Chicorita");
	 pokemones.add("Eevee");
	 pokemones.add("Patamon");
	 pokemones.add("Charizard");
	 pokemones.add("Gengar");
	 // add si agregamos un indice y un elemento, posiciona
	 // el elemento en el indice y realiza un desplazacmiento
	 // es decir no borra el elemnto en la posicion
	  
	 pokemones.add(2, "Pikachu");
	 pokemones.add("Chicorita");
	 // remove : remueve el elemento de la posicion especifica
	 pokemones.remove(0);
	 // set reemplaza el elemnto en la posicion especifica
	 pokemones.set(0, "Flareon");
	 
	 for (String pokemon : pokemones) {
		 System.out.println(pokemon);
	 }
	 
	 System.out.println("***********");
	 System.out.println(pokemones.get(4));
	 System.out.println(pokemones.indexOf("Chicorita"));
	 System.out.println(pokemones.lastIndexOf("Chicorita"));
	 
	 // indexOf, nos va a devolver la posicion del elemento
	 // y si el elemento no se encuntra nos devuelve -1
	 // lastIndexOf - seria el ultimo elemento que encuentre, en caso que se repitiera
	 
	 System.out.println("***********");
	 
	 //LinkedList
	 //Es un lista doblemente enlazada
	 List<String> digimones = new LinkedList<String>();
	 digimones.add("Agumon");
	 digimones.add("Patamon");
	 digimones.add("Angemon");
	 digimones.add("Andromon");
	 digimones.add("Greymon");
	 
	 //>Map<
	 //Asocia claves a valores
	 //no puede contener claves duplicadas
	 //		-HastMap
	 //			Tiene mejor rendimiento pero no garantiza un orden
	 //			a la hora de hacer iteraciones
	 
	 Map <Integer, String> usuarios = new HashMap<Integer, String>();
	 usuarios.put(1, "Angel Cruz");
	 usuarios.put(2, "Raul");
	 usuarios.put(3, "Ro");
	 
	 System.out.println("***********");
	 System.out.println(usuarios.get(2));
	 
	 // >keyset<
	 //Nos permite recuperar el nombre de la clave
	 System.out.println(usuarios.keySet());
	 
	 // >Values<
	 //nos pemite recuperar el valor directamente
	 
	 System.out.println(usuarios.values());
	 
	 //TreeMap
	 Map<String, String> tamales = new TreeMap<String, String>();
	 
	 tamales.put("Oaxaqueño", "Mole rojo");
	 tamales.put("Torta", "Mole verde");
	 tamales.put("Dulces", "Gansito");
	 tamales.put("Salado", "Cochinita");
	 
	 System.out.println("**************");
	 System.out.println(tamales.keySet());
	 System.out.println(tamales.values());
	 
	 //Funcion lambda
	 
	 //LinkedHashMap
	 Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
	 carros.put(1,"Volvo");
	 carros.put(888,"Nissan");
	 carros.put(188,"Mustang");
	 carros.put(20,"Suzuki");
	 
	 System.out.println("**************");
	 System.out.println(carros.keySet());
	 System.out.println(carros.values());
 }
}
