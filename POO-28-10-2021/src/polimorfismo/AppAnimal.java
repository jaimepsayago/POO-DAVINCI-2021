package polimorfismo;

public class AppAnimal {
	
	public static void main(String [] args ) {
		
		//crear un animal, de tipo perro 
			Animal animal = new Perro("Bobby");
			animal.tipoAnimal();
			animal.comunicarse();
			System.out.println();
		//un objeto de perro de tipo perro
			Perro perro = new Perro("hercules");
			perro.tipoAnimal();
			System.out.println();
		//crearnos un objeto poliformifico, un objeto perro de tipo animal
			//haciendo una referencia a un objeto
			Animal animalPolimorfico = perro;
			animalPolimorfico.tipoAnimal();
			System.out.println();
			
		//un objeto gato de tipo animal
			Animal gato = new Gato("gatita");
			gato.tipoAnimal();
			gato.comunicarse();
			System.out.println();
			
		//crear un objeto gato de tipo IAnimal (interface)
			//aplicando polimorfismo con la interface
			IAnimal gato2 = new Gato("lola");
			gato2.comunicarse();
			System.out.println("constante desde interface " + gato2.valor);
			System.out.println();
			//prueba con arrays de objetos 
			Animal animales [] = { new Perro("simon"), new Perro("paco"), new Gato("mimi"), new Perro("rocky")};
			
				for(Animal a: animales) {
					a.tipoAnimal();
					a.comunicarse();
				}
				System.out.println();
			
				
			
		
		
	}
	
}
