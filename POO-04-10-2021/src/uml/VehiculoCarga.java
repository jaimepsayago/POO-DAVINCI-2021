package uml;

public class VehiculoCarga extends Vehiculo{

	double pma;
	
	public VehiculoCarga(String matricula, int dias, double pma) {
		super(matricula, dias);
		this.pma=pma;
	}
	
	//metodo
	
	public double getAlquiler() {
		//precio base m�s 20� * PMA (PMA=peso m�ximo autorizado en toneladas) 
		double alquiler = super.calcularBaseAlquiler() + (20*pma);
		return alquiler;
	}

	public double getPma() {
		return pma;
	}

	public void setPma(double pma) {
		this.pma = pma;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n pma: " + pma;
	}
	

	
	
}
