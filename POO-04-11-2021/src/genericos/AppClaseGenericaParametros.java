package genericos;

import java.util.ArrayList;
import java.util.List;

public class AppClaseGenericaParametros {

	public static void main(String[] args) {
		
		//gener una clase generica y enviar dos parametros 
		//leer e imprimir
		
		ClaseGenenicaParametros<Integer,String> claseGenerica = new ClaseGenenicaParametros<Integer, String>(28, "generico");
		
		//mostrar tipos de datos
		claseGenerica.mostrarTipo();
		
		//obtener y mostrar los datos
		int t = claseGenerica.getObj1();
		System.out.println("valor t : " + t);
		
		String s = claseGenerica.getObj2();
		System.out.println("valor v: " + s);
		
		
		//libreria List
		//list / Arraylist / Array /Linkedlist / Vector
		
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		List<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		//funcion generica para leer estos tipos de datos
		printlist(intList);
		printlist(strList);
		
	}
	
	public static <T> void printlist(List<T> list) {
		for(T elemento: list) {
			System.out.println(elemento);
		}
		
	}
}
