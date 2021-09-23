package ejercicios;

public class Libro {

	public String isbn;
	public String nombreAutor;
	
	
	public Libro() {
		
	}
	
	public Libro(String isbn, String nombreAutor) {
		this.isbn=isbn;
		this.nombreAutor = nombreAutor;
	}



	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getNombreAutor() {
		return nombreAutor;
	}


	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	
	
	
}
