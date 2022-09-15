package repasoHerenciaIntefacesPolimorfismo;

public class Entrenador extends Persona {

	String edad;

	public Entrenador() {
		
	}
	
	public Entrenador (String dni, String nombre, String password, String direccion, String edad) {
		super(dni, nombre, password, direccion);
		this.edad = edad;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	
}
