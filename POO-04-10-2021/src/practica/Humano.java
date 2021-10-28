package practica;

public class Humano {

	protected String nombre;
	protected String apellido;
	
	//constructor 
	public Humano(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Humano() {
		
	}
	
	//metodos
	String nombreCompleto() {
		return this.nombre + " " + this.apellido;
	}
	
	
	
	
}
