package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class AppArrayList {

	public static void main(String[] args) {
		//estructura dinamica que almacena objetos
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
	//	lista.add("hola");
	//	lista.add("que");
	//	lista.add("tal");
		
		//estructura for
		//agregar
		for(int i=0;i<100;i++) {
			lista.add(i);
		}
		//recorrer
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
	//	System.out.println(lista.get(0));
		//System.out.println(lista.get(1));
		//System.out.println(lista.get(2));
		
		//iteradores--> objetos dinamicos -->no conozco el tamaño del objeto
		
		Iterator<Integer> recorrer = lista.iterator(); //asignacion de iterator --> recorrido
		while(recorrer.hasNext()) {
			System.out.println(recorrer.next());
		}

	}

}
