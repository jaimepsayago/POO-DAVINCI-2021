package uml;

public class Camion extends Vehiculo {
	
	public Camion(String matricula, int dias) {
		super(matricula,dias);
	}
	
	//metodo
	public double getAlquiler() {
		//sumar al precio base + 40
		double alquiler = super.calcularBaseAlquiler() + 40;
		return alquiler;
	}

}
