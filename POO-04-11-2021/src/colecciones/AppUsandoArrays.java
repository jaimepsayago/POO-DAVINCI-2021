package colecciones;

import java.util.Vector;

public class AppUsandoArrays {
	public static void main(String[] args) {
		// metodo para llenar y copiar arrays utilizando el api collection de java
	
		Collections arraysCollection = new Collections();
		
		arraysCollection.printArrays();
		
		//buscar datos en un array
		int ubicacion = arraysCollection.buscar(5);
		System.out.println("buscar el valor 5 encontrado en arrayInt " + ubicacion);
		
		
		//trabajar con el Vector
		
		String colores[] = {"rojo", "blanco", "azul"};
		
		Vector<String>  vector = new Vector<String>();
		
		//ver elementos del vector
		vector.add("verde");
		
		//que contiene el vector?
		//contiene verde?
		if (vector.contains("verde")) {
			System.out.println("Existe verde");
		}
		else {
			System.out.println("no Existe verde");
		}
		
		System.out.println(vector.firstElement());
		
		//tamaño del vector
		System.out.println(vector.size());
		
		//agregar el array al vector
		for (String c: colores) {
			vector.add(c);
		}
		
		//imprimir datos del vector
		for (String e: vector) {
			System.out.println(e);
		}
		
		//capacidad del vector
		System.out.println("tamaño"+ vector.size());
		System.out.println("capacidad: " + vector.capacity());
	}

}
