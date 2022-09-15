package repasoInterfaceconHerencia;

public class AppRepasoInterfaceHerencia {

	public static void main(String[] args) {
		// implementar los objetos 
		
		System.out.println("obj1");
		//instanciar el objeto1 desde subclase1
		 SubClaseHija obj1Subclase1 = new SubClaseHija();
		 obj1Subclase1.setNumero(12);
		 System.out.println("num encapsulado mediante set numero" + obj1Subclase1.getNumero());
		 obj1Subclase1.visualizarCadena();
		 obj1Subclase1.visualizarOtraCadena();
		 
		 //IVA 
		 System.out.println("obj2");
			//instanciar el objeto12 desde subclase2
			 SubClaseHija obj2Subclase1 = new SubClaseHija();
			 obj2Subclase1.visualizarOtraCadena();
			 obj2Subclase1.setNumero(1212);
			 System.out.println("num encapsulado mediante set numero" + obj2Subclase1.getNumero());
			 obj2Subclase1.visualizarCadena();
			 System.out.println("el valor del iva" + obj2Subclase1.getIva());
			
		

	}

}
