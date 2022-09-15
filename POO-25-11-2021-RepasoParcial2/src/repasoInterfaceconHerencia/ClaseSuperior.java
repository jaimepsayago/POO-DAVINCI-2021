package repasoInterfaceconHerencia;

//la convertimos en clase abstracta
public abstract class ClaseSuperior implements Impuesto {

	//variables
	public int numero;
	
	
	//metodos abstractos
	abstract void setNumero(int numero);
	abstract int getNumero();
	
	//metodos implementados
	public void visualizarCadena() {
		System.out.println("cadena de la clase superior");
	}
	
	//implementacion de la interface	
	public int getIva() {
		return IVA;
	}
	
	

}
