package genericos;

public class CajaGenerica <T>{
	
	private T dato;
	
	public CajaGenerica() {
		
	}
	//getters and setters
	public T quita() {
		return dato;
	}
	
	public void poner(T d) {
		dato = d;
	}
	
	

}
