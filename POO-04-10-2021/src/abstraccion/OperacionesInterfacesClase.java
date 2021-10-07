package abstraccion;

public class OperacionesInterfacesClase implements OperacionesInterface{

	@Override
	public String insertarNombre(int id, String nombre) {
		System.out.println("se inserto el nombre");
		return "ok-insertado";
	}

	@Override
	public String actualizarNombre(String nombre) {
		System.out.println("se actualizo nombre");
		return "ok-actualizado";
	}

	@Override
	public String ejecutarNombre(String nombre) {
		System.out.println("nombre ejecutado");
		return "nombre-ejecutado";
	}

}
