package repasoHerenciaIntefacesPolimorfismo;

public class SubClase1 implements Superior{

	@Override
	public void visualizarCadena() {
		System.out.println("cadena desde subclase1");
		
	}

	@Override
	public int getNumero() {
		
		return 10;
	}
	

}
