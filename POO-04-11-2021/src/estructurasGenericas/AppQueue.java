package estructurasGenericas;

import java.util.Iterator;
import java.util.LinkedList;

public class AppQueue {

	public static void main(String[] args) {
		// crear un objeto de tipo Queue y utilizar los metodos creados
		
		Queue<Integer> cola = new ArrayQueue<Integer>();
		
		cola.addQueue(8);
		cola.addQueue(12);
		cola.addQueue(87);
		
		System.out.println(cola.first());
		
		while(!cola.isEmpty()) { //recorrer un array sin saber el tamaño
			System.out.println(cola.deQueue());
		}
		
		//emular una cola con linkelist
		//es una coleccion dinamica es puede aumentar o disminuir su tamaño en tiempo de ejecucion
		LinkedList<String> list = new LinkedList<String>();
		
		//agregar datos 
		list.add("juan");
		list.add("luis");
		list.add("manuel");
		
		//agregar datos al inicio
		list.addFirst("primer dato");
		list.addLast("agregar dato ultimo");
		
		//agregar datos por posiciones por ejemplo agregar en 3
		//array desde 0
		//linkedlist van utilizando los indices 0
		
		list.add(2,"glen pos 3");
		
		//remover
		list.remove(3);
		
		//no conocemos el tamaño
		//agregar un dato y obtenerlo
		Object datoObtenido = list.get(0); //obtengo el dato
		System.out.println("dato en posicion 0 \n" + datoObtenido);
		
		//agregamos un dato 
		list.set(0,"cambio de dato Primero");
		
		list.add("Julia");
		
		//mostrar lista
		//iteradores 
		Iterator<String> iterator = list.iterator(); //crear un objeto iterator = recorrer un objeto de manera secuencial
		while(iterator.hasNext()){ //mientras el iterador tenga datos continue obteniendolos
			System.out.println(iterator.next());
		}
		
		//guardar los datos un archivo o un base de datos
		
		//capa de negocio
		
		//frontEnd  o capa presentacion
		
	
		//Ejercicio 
		Libro l1 = new Libro("tibulo1", "auto1");
		Libro l2 = new Libro("tibulo2", "auto2");
		Libro l3 = new Libro("tibulo3", "auto3");
		Libro l4 = new Libro("tibulo4", "auto4");
		
		//como inserto en forma de cola con linkedlist y muestro los datos?
		LinkedList<Libro> listaLibros = new LinkedList<Libro>();
		listaLibros.add(l1);
		listaLibros.add(l2);
		listaLibros.add(l3);
		listaLibros.add(l4);
		Iterator <Libro> iteratorLibro = listaLibros.iterator();
		while(iteratorLibro.hasNext()) { 
			System.out.println(iteratorLibro.next());
		}
		
		
		
	}

}
