package uml;

public class Coche extends Vehiculo {
	
	int plazas;
	
	public Coche(String matricula, int dias, int plazas) {
		super(matricula, dias);
		this.plazas = plazas;
	}
	
	//metodos
	public double getAlquilerFinal() {
		// al precio base se le suma la cantidad de 1.5€ por plaza y día
		double alquiler = super.calcularBaseAlquiler() + (1.5*plazas*super.dias);
		return alquiler;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n plazas: " + plazas;
	}
	
	

}
