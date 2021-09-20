package herencia;

public class Vehiculo {
	
	private String color;
	private Integer numSerie;
	
	//constructor
	//inicializar variables
	
	//vacio
	Vehiculo() {
		
	}
	
	//datos
	public Vehiculo(String color, Integer numSerie) {
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

	public Integer getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(Integer numSerie) {
		this.numSerie = numSerie;
	}
	
	

}
