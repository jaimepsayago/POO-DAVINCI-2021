package polimorfismo;

public class Gato extends Animal{

	
	//constructor
	public Gato(String nombre) {
		super(nombre); //envia el parametro al constructor de la clase padre
		System.out.println("Constructor Gato: " + nombre);
	}
	
	//implementando el metodo tipo animal por eso no necestiamos un @override
	public void tipoAnimal() {
		System.out.println("Tipo animal: Es un gato");
		
	}
	//implementando el metodo comunicarse de la interface IAnimal y heredada de la clase padre
	//por eso no necestiamos un @override
	public void comunicarse() {
	System.out.println("metodo comunicarse:  el gato maulla: Miau miau");
		
	}

	

}
