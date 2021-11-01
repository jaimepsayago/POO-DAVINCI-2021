package polimorfismoMetodosObjetos;

import java.util.ArrayList;

import polimorfismo.ListaProfesoresOperaciones;

/*
 * mensajes /comentarios
 */

//documentacion

/**
 * 
 * @author JSH
 * @version 0.1
 * Clase grupo Personas
 */

public class GrupoPersonas {
	//agregar una arraylist para guardar los datos de las personas
	private ArrayList<Persona> personaLista = new ArrayList<Persona>();
	
	/**
	 * Agregar persona al grupo (siempre que no este en el)
	 * @param p personar a agregar
	 * @return true si se ha agregado o false en caso contrario 
	 */
	public boolean agregaPersona(Persona p) {
		if(personaLista.contains(p)){
			return false; // retorna false si la persona ya esta en el grupo o lista persona
		}
		//añade la persona
		personaLista.add(p);
		return true;
	}
	
	
	/**
	 * eliminar del grupo a la persona
	 * @param dni
	 * @return true si la persona con ese dni se encontraba en la lista
	 * en caso contrario false
	 */
	public boolean eliminaPersona(Persona p) {
		return personaLista.remove(p);
		
	}
	
	public boolean eliminaPersona(String dni) {
		//leer toda la lista
		for(int i =0;  i<personaLista.size(); i++) {
			//preguntar el dni de la persona a eliminar
			if(personaLista.get(i).getDni().equals(dni)) {
				//si encuntra el datos
				personaLista.remove(i);
				return true;
			}
			
		}
		return false;
		
	}
	
	//metodo to string
	@Override
	public String toString() {
		return personaLista.toString();
	}
	
	

}
