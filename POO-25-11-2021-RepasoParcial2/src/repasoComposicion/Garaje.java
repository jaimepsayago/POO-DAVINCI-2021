package repasoComposicion;

public class Garaje {
/*
 * superficie 
 * numero plazas
 * puerta apertua automatica
 *  
 */
	
	private int superficie;
	private byte numeroPlazas;
	private boolean puertaAperturaAutomatica;
	
	//constructor vacio
	public Garaje() {
		
	}
	
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public byte getNumeroPlazas() {
		return numeroPlazas;
	}
	public void setNumeroPlazas(byte numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}
	public boolean isPuertaAperturaAutomatica() {
		return puertaAperturaAutomatica;
	}
	public void setPuertaAperturaAutomatica(boolean puertaAperturaAutomatica) {
		this.puertaAperturaAutomatica = puertaAperturaAutomatica;
	}

	@Override
	public String toString() {
		return "Garaje [superficie=" + superficie + ", numeroPlazas=" + numeroPlazas + ", puertaAperturaAutomatica="
				+ puertaAperturaAutomatica + "]";
	}
	
	
	
	
}
