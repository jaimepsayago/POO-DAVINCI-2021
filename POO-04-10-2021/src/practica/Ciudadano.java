package practica;

public class Ciudadano extends Humano{
	protected String identificacion; 

	public Ciudadano() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ciudadano(String nombre, String apellido, String identificacion) {
		super(nombre, apellido);
		this.identificacion= identificacion;
	}
	
	//metodo
	public String visualizar() {
		return super.nombreCompleto() + " identificacion: " + this.identificacion;
	}
	
	

	

}
