package primerParcial;

public class AppLibro {

	public static void main(String[] args) {
		// instanciar 4 objetos
		
		LibroCalificaciones obj1 = new LibroCalificaciones("primer curso");
		LibroCalificaciones obj2 = new LibroCalificaciones();
		obj2.establecerNombreDelCurso("segundo curso");
		
		LibroCalificaciones obj3 = new LibroCalificaciones("tercer curso");
		
		LibroCalificaciones obj4 = new LibroCalificaciones();
		obj4.establecerNombreDelCurso("cuarto curso");
		
	obj1.mostrarMensaje();
	obj2.mostrarMensaje();
	obj3.mostrarMensaje();
	obj4.mostrarMensaje();
		
		
		

	}

}
