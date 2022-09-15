package repasoHerenciaIntefacesPolimorfismo;

public class Gerente extends Persona {
	
	String cargo;
	
	public Gerente() {
		
	}
	
	public Gerente(String dni, String nombre, String password, String direccion, String cargo ) {
		super(dni, nombre, password, direccion);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	

}
