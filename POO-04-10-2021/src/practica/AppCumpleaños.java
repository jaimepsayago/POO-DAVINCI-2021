package practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppCumpleaños {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// dato de hoy
		//cumpleaños
		
		//2 objetos no estan inicializados
		Cumpleanios hoy;
		Cumpleanios cumpleanios;
		Cumpleanios mañana;
		//variables 
		int d, m;
		
		//entrada de datos
		//fecha del dia
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("introduzca la fecha de hoy, dia");
		d = Integer.parseInt(entrada.readLine());
		//fecha del mes
		System.out.print("introduzca el mes de hoy;");
		m = Integer.parseInt(entrada.readLine());
		
		//dando valores iniciales a el objeto
		//objeto 1
		hoy = new Cumpleanios(m, d);
		
		//la fecha de nacimiento
		System.out.print("introduzca fecha de nacimiento, dia: ");
		d= Integer.parseInt(entrada.readLine());
		System.out.print("introduzca el mes de nacimiento;");
		m = Integer.parseInt(entrada.readLine());
		
		//agregamos los valores en el objeto 2
		cumpleanios = new Cumpleanios(m,d);
		
		//visualizar los datos
		hoy.visualizar();
		System.out.println();
		cumpleanios.visualizar();
		
		//mensaje de cumpleaños
		
		if( hoy.igual(cumpleanios)) {
			System.out.println("feliz cumpleaños");
		}else {
			System.out.println("feliz dia");
		}
		
		//explicarles
		//CUMPLEANIOS //hoy --- d = 2 ---- mes = 2 --->objet 1 ----igual
		//CUMPLEANIOS //cumpleaños --- d = 2 ----mes = 2 -----> objeto 2  -----igual
		//memoria RAM objet 1 y objeto2 
		//hoy.d
		//hoy.m
		//hoy.igual ( cumpleanios)
		// hoy.d = cumpleanios.d && hoy.m = cumpleanios.m
		//hoy.visualizar
		
		/*cumpleanios.d
		 * cumpleanis.m
		 * cumpleanios.igual
		 * cumpleanios.visulizar
		 */
		
		

		

	}

}
