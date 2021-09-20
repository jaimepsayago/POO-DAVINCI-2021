package herencia;

public class Coche extends Vehiculo{
	
	//variable
	private int cilindraje;
	
	//constructor
	public Coche(String color, int i, int cilindraje) {
		super(color, i);
		this.cilindraje = cilindraje;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	
	
	
	

}
