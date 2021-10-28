package polimorfismo;

import java.util.Calendar;

public class AppProfesor {

	public static void main(String[] args) {
		//objeto de tipo profesor
		
		Profesor profesor1 = new Profesor("juan", "calle", 33, "prof-25554" );
		
		//fecha basada en calendar
		Calendar fecha1 = Calendar.getInstance();
		
		//agregar fecha
		fecha1.set(2021, 10, 22);
		
		//objeto tipo profesor interino
		ProfesorInterino interino1 = new ProfesorInterino( "pablo","alvarez",54,"prof-999",fecha1);
		
		//crear un objeto de tipo lista profesores operaciones
		ListaProfesoresOperaciones listaProfesores = new ListaProfesoresOperaciones();
		
		listaProfesores.agregarProfesor(profesor1); //agregar objetos a lista profesores
		listaProfesores.agregarProfesor(interino1);		
		
		//mostrar los datos guardados
		listaProfesores.listar();

		
	}

}
