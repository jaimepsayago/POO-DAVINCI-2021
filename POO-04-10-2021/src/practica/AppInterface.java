package practica;

public class AppInterface {

	public static void main(String[] args) {
		// trabajar con los objetos
		
		Persona p = new Persona();
		Canario c = new Canario();
		
		c.cantar();
		hacerCantar(p);
	}
	
	public static void hacerCantar( Cantante c) {
		c.cantar();
		
	}

}
