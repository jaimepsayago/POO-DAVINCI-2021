package colecciones;

import java.util.Arrays;

public class Collections {
	
	//3 arrays
	private int intArray[] = {1,2,3,4,5,6};
	private double doubleArray[] = {8.4,9.3,0.2,5.3,6.4};
	private int llenadoArray[];
	private int copiadoArray[];
	
	//constructoor inicializar los arrays
	public Collections() {
		//crear un array con 10 elementos 
		llenadoArray = new int[10]; //tamño de 10 elemento
		copiadoArray = new int[intArray.length]; //tamaño de 6 elementos
		
		//llenar datos a mi array
		//metodo fill sirve para llenar arrays con cierta cantidad de datos
		Arrays.fill(llenadoArray,7); //llenar el array con el valor de 7
		//ordenadar de manera ascendente?
		//metodo sort
		Arrays.sort(doubleArray);
		
		//copiar arrays
		//copiar el intARray en CopiadoArray
		
		System.arraycopy(intArray, 0, copiadoArray, 0, intArray.length);
		
		
	}
	
	//metodo para imprimir los arrays
	public void printArrays(){
		System.out.println("doubleArray: "  );
		for( double d: doubleArray)
			System.out.print(d);
		System.out.println();
		System.out.println("intArray: "  );
		for( double i: intArray)
			System.out.print(i);
		System.out.println();
		System.out.println("llenadoArray: "  );
		for( double l: llenadoArray)
			System.out.print(l);
		System.out.println();
		System.out.println("copiadoArray: "  );
		for( double c: copiadoArray)
			System.out.print(c);
		
		
	}
	
	//buscar un valor en un array
	public int buscar(int value) {
		return Arrays.binarySearch(intArray, value);
	}
	

}
