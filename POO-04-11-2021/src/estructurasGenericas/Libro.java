package estructurasGenericas;

public class Libro {
	private String titulo;
	private String autor;
	
	//constructor
	public Libro() {
		this.titulo="";
		this.autor="";
	}
	//constructor con datos
	public Libro(String titulo, String autor) {
		this.titulo=titulo;
		this.autor=  autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//metodos adicionales que toda clase de tener
	
	public String toString() {
		return ("titulo: " + titulo +  " " + "autor: " + autor);
	}
	
	
	//metodo me sirve para comparar el parametro enviado si es parte de la clase Libro
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Libro)) { // no es instancia de libro
			return false;
		}
		return autor.equals(((Libro)obj).autor);
	}

}
