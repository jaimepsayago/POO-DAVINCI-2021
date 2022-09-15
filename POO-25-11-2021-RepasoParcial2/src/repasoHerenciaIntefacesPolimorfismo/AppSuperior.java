package repasoHerenciaIntefacesPolimorfismo;

public class AppSuperior {

	public static void main(String[] args) {
		
		System.out.println("----");
		System.out.println("---- instanciamos un objeto de tipo subclase1 y se invocan los metodos");
		SubClase1 subClase1 = new SubClase1();
		subClase1.visualizarCadena();
		
		System.out.println("----");
		System.out.println("---- instanciamos un objeto de tipo subclase2 y se invocan los metodos");
		SubClase2 subClase2 = new SubClase2();
		subClase2.visualizarCadena();
		subClase2.visualizarCadena("hola");
		
		Superior subClase3 = new SubClase2();
		
		subClase3.visualizarCadena();
		
		
	}

}
