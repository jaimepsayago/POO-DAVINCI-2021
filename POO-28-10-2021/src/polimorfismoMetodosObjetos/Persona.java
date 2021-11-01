package polimorfismoMetodosObjetos;

public class Persona {
	
	private String nombre, dni;
	
	//constructor
	public Persona() {
		
	}
	public Persona(String nombre, String dni) {
		this.nombre=nombre;
		this.dni=dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	//metodos
	//accceso a los datos de la clase
	@Override
	public String toString() {
		return "(dni =" + dni +  " ,  nombre= " + nombre + ")";
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Persona)) {
			return false;
		}
		return dni.equals(((Persona) obj).dni);
	}
	
	
	
	

}
