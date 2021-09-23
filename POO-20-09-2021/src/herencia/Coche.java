package herencia;

public class Coche extends Vehiculo{
	
	//variable
	private int cilindraje;
	
	//constructor
	public Coche(String color, Integer numSerie, int cilindraje) {
		super(color, numSerie);
		this.cilindraje = cilindraje;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	
	
	
	

}
