package polimorfismo;

public abstract class Animal implements IAnimal{
	
	public String nombre;

	//constructor
	public Animal() {

		
	}
	//constructor
	public Animal(String nombre) {
		this.nombre=nombre;
		//mensaje
		System.out.println("constructor Animal: " + this.nombre);
	}
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos son declarados en las clases abstractas pero no son implementados
	public abstract void tipoAnimal();
	
	//metodo comunicarse ya esta heredado
	//solo declaran y no son implementados

}
