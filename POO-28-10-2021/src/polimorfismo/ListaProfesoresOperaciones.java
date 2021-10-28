package polimorfismo;

import java.util.ArrayList;

public class ListaProfesoresOperaciones {
	//operaciones de agregar y mostrar 
	
	//declarando arraylist de tipo Profesor
	private ArrayList<Profesor> listProfesores;
	
	
	//Constructor
	public ListaProfesoresOperaciones() {
		//inicalizar el arraylist de tipo profesor
		listProfesores = new ArrayList<Profesor>();
	}
	
	//METODOS
	
	//metodo agregar profesor
	public void agregarProfesor(Profesor profesor) {
		listProfesores.add(profesor);
	}
	
	//metodo listar los profesores
	public void listar() {
		System.out.println("mostrar todos los profesores del arraylist de tipo profesor");
		for(Profesor p: listProfesores) {
			p.mostrarDatos();
		}
	}
	
	

}
