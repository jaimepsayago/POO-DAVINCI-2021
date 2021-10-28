package polimorfismo;

public class Perro extends Animal {
	

	//constructor
	public Perro(String nombre) {
		super(nombre);
		System.out.println("Constructor perro, nombre: " + nombre);
	}
	

	public void comunicarse() {
		System.out.println("metodo comunicarse: el perro ladra... guau guau " );
		
	}
	public void tipoAnimal() {
		System.out.println("tipo animal : Es un perro");
		
	}

}
