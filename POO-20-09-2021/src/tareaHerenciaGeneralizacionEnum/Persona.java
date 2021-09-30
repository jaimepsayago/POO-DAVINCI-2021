package tareaHerenciaGeneralizacionEnum;
/*
 * Persona
nombre
edad
visualizar()

 */
public class Persona {
	
	//enum
	public static enum PAIS{Argentina, Paraguay, Peru, Ecuador};
	public static enum IDIOMA{Ingles, Español, Portugues};
	
	
	public String nombre;
	public int edad;
	
	//constructor
	Persona(){
		
	}
	Persona(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	
	//visualizar
	public String toString() {
		return "nombre: " + nombre + " " + "edad: " + edad;
	}
	public String visualizar() {
		return "nombre: " + nombre + " " + "edad: " + edad;
	}

	
	//getters and setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	

}
