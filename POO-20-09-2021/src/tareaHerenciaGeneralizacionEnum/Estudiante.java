package tareaHerenciaGeneralizacionEnum;
/*
 *  
 */
public class Estudiante extends Persona{
	public int id;
	
	//constructor
	public Estudiante() {
		
	}
	public Estudiante(String nombre, int edad, int id) {
		super(nombre, edad);
		this.id= id;
	}
	
	//metodos
	//redefinir 
	@Override
	public String toString() {
		return super.toString() + " id: " + id;
	}
	
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
