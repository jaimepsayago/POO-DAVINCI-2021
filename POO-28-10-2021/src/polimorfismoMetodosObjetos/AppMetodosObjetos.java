package polimorfismoMetodosObjetos;

import java.util.Stack;

public class AppMetodosObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Gato g = new Gato("mimi");
		
		
		//System.out.println(p.equals(g));
		//objeto persona
		Persona p = new Persona("juan", "1234");
				
				
		//objeto grupoPersonas
		GrupoPersonas gp = new GrupoPersonas();
		
		gp.agregaPersona(p); //añadimos una persona
		
		Persona p1 = new Persona("pablo", "0005");
		gp.agregaPersona(p1);
		
		
		//gp.eliminaPersona("1234");
		
		
		System.out.println(gp.toString());
		
		//como mostramos todos los datos sin utilizar el toString()
		
		gp.visualizar();
		
		
		

	}

}
