package abstraccion;

public class AppInterfaces {

	public static void main(String[] args) {
		
		
		OperacionesInterface operaciones = new OperacionesInterfacesClase();

		operaciones.insertarNombre(1, "juan");
		operaciones.actualizarNombre("juan");
		
		operaciones.ejecutarNombre("pablo");
		
	}

}
