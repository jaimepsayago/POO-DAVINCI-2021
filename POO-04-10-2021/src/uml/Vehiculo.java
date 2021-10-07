package uml; //donde esta guardada la clase Vehiculo

public class Vehiculo {
	
	public String matricula;
	public int dias;
	public double valorAlquiler = 50;
	

	public Vehiculo() {
		super();
	}

	public Vehiculo(String matricula, int dias) {
		super();
		this.matricula=matricula;
		this.dias=dias;
	}
	
	//metodos
	public double calcularBaseAlquiler() {
		double alquiler = (valorAlquiler * dias);
		return alquiler;
	}
	

	
	public String toString() {
		return "matricula: " + matricula + "\n dias: " + dias;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
	
	
}
