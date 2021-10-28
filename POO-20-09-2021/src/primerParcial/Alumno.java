package primerParcial;

public class Alumno extends Persona {
	
	String curso;
	
	public Alumno() {
		
	}
	public Alumno(int cedula, String nombre, int anio, String curso) {
		super(cedula, nombre, anio); //clase padre
		this.curso=curso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	//metodo
	public int calcularEdad() {
		return 2021-this.anio;
	}
	
	public String toString() {
	 return "cedula: " + this.cedula + "nombre: " + nombre + "anio: " + anio + "curso: " + curso;
	}
	
	

}
