package primerParcial;

/*
 * 3.Construir la clase LibroCalificaciones tiene un atributo nombreDelCurso de tipo String y privado. 
 * con dos constructores (uno vacío y otro con el parámetro respectivo), 
 * además implementar los métodos de la clase establecerNombreDelCurso (con un parámetro nombre de tipo String),
 *  obtenerNombreDelCurso (que devuelve el tipo String) y mostrarMensaje. 
 * Instanciar cuatro objetos y mostrar un mensaje perteneciente a cada objeto. (2p)
 */
public class LibroCalificaciones {
	
	private String nombreDelCurso;

	public LibroCalificaciones() {
		
	}
	
	public LibroCalificaciones(String nombreDelCurso) {
		this.nombreDelCurso=nombreDelCurso;
	}
	
	//getters and setters

	public String obtenerNombreDelCurso() {
		return nombreDelCurso;
	}

	public void establecerNombreDelCurso(String nombreDelCurso) {
		this.nombreDelCurso = nombreDelCurso;
	}
	
	//metodo
	public void mostrarMensaje() {
		System.out.println("libro calificaciones \n Nombre del curso:  " + nombreDelCurso);
	}
	
	
	

}
