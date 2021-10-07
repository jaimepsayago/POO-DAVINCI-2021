package uml;



public class Microbus extends Vehiculo{
	
	int plazas;
	
	public Microbus(String matricula, int dias, int plazas) {
		super(matricula,dias);
		this.plazas = plazas;
	}

	//metodo
	//le añade una cantidad de 2€/plaza independientemente de los días de alquiler.
	public double getAlquiler() {
		double alquiler = super.calcularBaseAlquiler() + (2 * plazas);
		return alquiler;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	
}
