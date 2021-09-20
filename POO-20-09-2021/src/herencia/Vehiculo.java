package herencia;

public class Vehiculo {
	
	private String color;
	private int numSerie;
	
	//constructor
	//inicializar variablesv
	
	//vacio
	Vehiculo() {
		
	}
	
	//datos
	public Vehiculo(String color, int numSerie) {
		this.color= color;
		this.numSerie= numSerie;
	}
	
	//metodo
	public void mensaje() {
		System.out.println("mensaje desde vehiculo");
	}


	//getters and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	
	

}
