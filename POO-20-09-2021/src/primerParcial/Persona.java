package primerParcial;
/*
 * Generar una Clase Persona con los siguientes atributos
o	Cedula
o	Nombre
o	Fecha nacimiento
o	Luego crear la clase derivada Alumno, la cual deberá contener un atributo que es Curso
o	Generar los métodos de obtención y salida de estas dos clases, y un método de cálculo de edad.
o	Instanciar tres objetos de la clase Alumno y luego imprimirlos con su edad.

 */
public class Persona {
	int cedula;
	String nombre;
	int anio;
	
	public Persona() {
		
	}
	
	public Persona(int cedula, String nombre, int anio) {
		this.cedula=cedula;
		this.nombre=nombre;
		this.anio=anio;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	

}
