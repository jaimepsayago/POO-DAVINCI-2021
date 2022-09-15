package repasoHerenciaIntefacesPolimorfismo;

public class SubClase2 implements Superior {

	@Override
	public void visualizarCadena() {
		System.out.println("cadena desde subclase2");
		
	}
	
	public void visualizarCadena(String var) {
		System.out.println("cadena desde subclase2 sobrecargado con variable"+ var);
		
	}

	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return 500;
	}

	
}
