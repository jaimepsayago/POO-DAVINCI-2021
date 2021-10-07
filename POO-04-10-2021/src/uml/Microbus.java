package uml;



public class Microbus extends Vehiculo{
	
	int plazas;
	
	public Microbus(String matricula, int dias, int plazas) {
		super(matricula,dias);
		this.plazas = plazas;
	}

	//metodo
	//le a�ade una cantidad de 2�/plaza independientemente de los d�as de alquiler.
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
