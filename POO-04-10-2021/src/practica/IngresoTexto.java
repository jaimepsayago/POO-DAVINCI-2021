package practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class IngresoTexto {

	public static void main(String[] args) {
		// generar un ingreso de datos por consola
		
	String mensaje=	leerTexto("introduzca un texto");
	System.out.println(mensaje);

	}
	
	static private String leerTexto(String mensaje) {
		//crear una variable donde almacenar el texto
		String texto;
		//manejo de errores
		try {
			//codigo
			//scnnaer 
			//buffer
			//reader
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje); //imprimiendo el mensaje de la funcion
			texto = in.readLine();//lee y guarda la linea que se escriba en consola
			
		} catch (Exception e) {
			// mensaje de error
			texto="error";
		}
		return texto;
	}
}
