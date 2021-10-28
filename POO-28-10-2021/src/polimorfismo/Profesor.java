package polimorfismo;

public class Profesor extends Persona{

	private String idProfesor;
	
	public Profesor() {
		super();
		idProfesor="desconocido";
	}
	public Profesor(String nombre, String apellidos, int edad, String idProfesor) {
		super(nombre, apellidos, edad);
		this.idProfesor= idProfesor;
	}
	public String getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	//metodo
	public void mostrarDatos() {
		System.out.println("datos profesor, nombre: " + getNombre() + " " + getApellidos() + " " + getIdProfesor());
	}
	
	
}
