package repasoComposicion;

public class Piscina {
	
	private int volumen;
	private boolean cubierta;
	
	//constructor vacio
	public Piscina() {
		
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public boolean isCubierta() {
		return cubierta;
	}

	public void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}

	@Override
	public String toString() {
		return "Piscina [volumen=" + volumen + ", cubierta=" + cubierta + "]";
	}
	
	
	

}
