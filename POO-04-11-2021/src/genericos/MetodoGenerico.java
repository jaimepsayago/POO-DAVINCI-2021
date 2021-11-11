package genericos;

public class MetodoGenerico {

	public static void main(String[] args) {
		// Tres matrices de diferentes tipos de datos
		//y deseo leer e imprimir los datos de estas tres matrices
		
		Integer[] integerArray = {1,2,3,4,5,6,7};
		Double [] doubleArray= {1.1, 1.2, 1.3, 1.4,1.5};
		String [] stringArray = {"hola", "desde", "un", "array"};
		
		//leer la matriz integer
		printArray(integerArray);
		printArrayDouble(doubleArray);
		printArrayString(stringArray);
		
		printArrayGenerica(stringArray);

	}
	
	//funcion generica
	public static <E> void printArrayGenerica(E[] array ) {
		for(E elemento: array ) {
			System.out.println(elemento);
		}
	System.out.println();
		
		
		
	}
	
	
	public static void printArray(Integer[] array) {
		for(Integer elemento: array) {
			System.out.println(elemento);
		}
	System.out.println();	
	}
	
	public static void printArrayDouble(Double[] array) {
		for(Double elemento: array) {
			System.out.println(elemento);
		}
	System.out.println();	
	}

	public static void printArrayString(String[] array) {
		for(String elemento: array) {
			System.out.println(elemento);
		}
	System.out.println();	
	}
}
