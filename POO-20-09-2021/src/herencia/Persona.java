package herencia;

public class Persona extends Humano{
	
	public String identificacion, nombre, apellido;

	
	//constructor
	public Persona(String colorOjos, String sexo,
			String altura, String peso, String identificacion,
			String nombre, String apellido ) {
		super(colorOjos, sexo,altura,peso);
		this.identificacion= identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		
		
	}
	public Persona(String identificacion,String nombre, String apellido) {
		this.identificacion= identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Persona() {
	}
	
	//metodos
	public void respirarPersona() {
		super.respirar(); //llamamos al metodo padre o de la superclase
		System.out.println("respirar Persona");
	}
	
	
	//sobreescritura o sobrecarga de metodos
	@Override
	public String toString() {
		return super.toString() + 
				" \n identicacion: " + identificacion 
				+ "\n nombre: "+ nombre
				+ "\n apellido: " + apellido; 
	}
	
	

	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//getters and setters
	
}
