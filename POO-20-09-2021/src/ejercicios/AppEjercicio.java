package ejercicios;

public class AppEjercicio {

	public static void main(String[] args) {

		//crear dos objetos revista y libro 
		//mostrar en pantalla los atributos     
		
		Revista revista = new Revista(); //instanciacion de un objeto revista
		
		//agregar datos a las variables del objeto
		revista.setPeriodicidad("dos volumenes");
		revista.setNumeroEjemplaresPorAnyo(4);
		System.out.println("revista");
		System.out.println(revista.getPeriodicidad()+ "\n " + revista.getNumeroEjemplaresPorAnyo());
		
		//agregar datos a un objeto libro e imprimirlos
		Libro libro = new Libro("5421","Juan Calle"); //creacion de un objeto   
		
		//imprimir
		System.out.println("libro: --->"); //mensaje
		System.out.println(libro.getIsbn() + "\n" + libro.getNombreAutor());
	}

}
