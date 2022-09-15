package repasoInterfaceconHerencia;

public class SubClaseHija extends ClaseSuperior{

	@Override
	void setNumero(int numero) {
		this.numero=numero;
		
	}

	@Override
	int getNumero() {
		return numero;
	}
	
	public void visualizarOtraCadena() {
		System.out.println("Cadena Subclase1 en visualizarOtraCadena");
	}
	
	public int getIva() {
		System.out.println("subclase1 desde interface");
		return IVA;
	}

}
