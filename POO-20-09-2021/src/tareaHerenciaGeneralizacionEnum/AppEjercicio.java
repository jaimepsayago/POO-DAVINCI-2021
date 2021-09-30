package tareaHerenciaGeneralizacionEnum;

import java.util.ArrayList;

import tareaHerenciaGeneralizacionEnum.Persona.IDIOMA;
import tareaHerenciaGeneralizacionEnum.Persona.PAIS;


public class AppEjercicio {
	
	//declarr el arraylist generado a traves de la clase padre
	public static ArrayList<Persona> personaLista = new ArrayList<Persona>();
	
	public static void main(String [] args) {
		
		//1 obj estudiante
		//instanciamos el objeto y lo inicializamos
		Estudiante estudiante1 = new Estudiante("Vicente Calle", 50, 12345);
		
		//2 obj estudiante
		//instanciamos el objeto pero no lo inicializamos
		Estudiante estudiante2 = new Estudiante(); 
		//inicializar el objeto
		estudiante2.setNombre("Juan Pedro");
		estudiante2.setEdad(45);
		estudiante2.setId(56456);
			
		//3 obj profesor
		Profesor profesor = new Profesor("jaime sayago ", 38, 9999);
		
		//agregar a un arraylist
		personaLista.add(estudiante1);
		personaLista.add(estudiante2);
		personaLista.add(profesor);
		
		//visualizar
		System.out.println("toString info");
		for (Persona p:personaLista ) {
			System.out.println(p.toString());
			
		}
		
		System.out.println("visualizar info");
		for (Persona p:personaLista ) {
			System.out.println(p.visualizar());
			
		}
		
		//mostrar la informacion
		//foreach java las nuevas versiones
		//programacion funcional
		System.out.println("visualizar info con foreach");
		personaLista.forEach(System.out::println);
		
		PAIS p = Persona.PAIS.Argentina;
		IDIOMA i = Persona.IDIOMA.Ingles;		
		
		
		System.out.println("pais: " + p);
		System.out.println("idioma: " + i);
	}

}
