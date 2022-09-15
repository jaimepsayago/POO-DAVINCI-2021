package repasoHerenciaIntefacesPolimorfismo;

import java.util.ArrayList;

/*
 * clase donde se realizan las operaciones de Persona
 * Create
 * Read
 * Update
 * Delete
 */
public class OperacionesPersonaCRUD {
	
	//generar un objeto q permite contener las objetos de tipo Persona
	//creando el objeto pero inicializado
	private ArrayList<Persona> listaPersona;
	
	//constructor
	public OperacionesPersonaCRUD() {
		//inicializar objetos
		listaPersona = new ArrayList<Persona>();
	}


	
	
	//metodos para las operaciones de Persona
	
	//agregar
	public void addDato(Persona persona) 
	{
		listaPersona.add(persona);
	}
	
	
	//listar
	public void listar() {
		System.out.println("se procede a mostrar los datos existentes en la listaPersona");
		
		for(Persona p: listaPersona) {
			System.out.println(p.toString());
		}
		
		
	}
	//buscar
	public Persona buscar(Persona persona) {
		Persona pEncontrada = null;
		boolean encontrada = false;
		
		Persona pExtraidaLista;
		
		for (int i=0; i<listaPersona.size() && !encontrada; i++) {
			pExtraidaLista = listaPersona.get(i); //dato de personalista y agregamos en pExtraida
			if ((pExtraidaLista.getDni()).compareTo(persona.getDni())== 0){//0 1{
			pEncontrada = pExtraidaLista;
			encontrada=true;
			}
		}
		return pEncontrada;
	
			
		}
		
	
	
	//eliminar
	//buscar
		public void eliminar(Persona persona) {
			Persona pEncontrada = null;
			boolean encontrada = false;
			
			Persona pExtraidaLista;
			
			for (int i=0; i<listaPersona.size() && !encontrada; i++) {
				pExtraidaLista = listaPersona.get(i); //dato de personalista y agregamos en pExtraida
				if ((pExtraidaLista.getDni()).compareTo(persona.getDni())== 0){//0 1{
				pEncontrada = pExtraidaLista;
				listaPersona.remove(pEncontrada);
				System.out.println("se elimino al objeto" + pEncontrada);
				encontrada=true;
				}
			}
			//return pEncontrada;
		
				
			}
	
	
	//getters and setters
	public ArrayList<Persona> getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(ArrayList<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}

}
