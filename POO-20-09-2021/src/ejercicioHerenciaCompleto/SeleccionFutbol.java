package ejercicioHerenciaCompleto;

public class SeleccionFutbol {
	
	//declarar variables o atributos o caracteristicas
	//						accesibilidad a package	---accesible a subclase---	subclase otro package
	// public +					si								si						si
	//private -					no								si						no
	//protected #				si								no						si
	
	protected int id;
	protected String nombre, apellido;
	protected int edad;
	
	//constructor
	public SeleccionFutbol() {
		
	}
	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
		this.id=id;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
	}
	
	//metodos
	public void concentrarse(){
		System.out.println("concentrarse clase padre");
	}
	
	public void viajar() {
		System.out.println("viajar clase padre");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
