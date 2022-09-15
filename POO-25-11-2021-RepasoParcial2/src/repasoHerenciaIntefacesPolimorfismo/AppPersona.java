package repasoHerenciaIntefacesPolimorfismo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppPersona {

	public static void main(String[] args) throws IOException{
		// crear 3 objetos desde consola y luego mostrar y buscar uno 
		
		//libreria para leer datos desde consola
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		
		//instancia un objeto de tipo Persona aplicando herencia
		Gerente g1 = new Gerente();
		System.out.println("introduzca datos del gerente");
		System.out.println("introduzca el dni");
		g1.setDni(bufferReader.readLine());
		System.out.println("introduzca el nombre");
		g1.setNombre(bufferReader.readLine());
		System.out.println("introduzca el password");
		g1.setPassword(bufferReader.readLine());
		System.out.println("introduzca la direccion");
		g1.setDireccion(bufferReader.readLine());
		System.out.println("introduzca el cargo");
		g1.setCargo(bufferReader.readLine());
		
		//instancia un objeto de tipo Persona aplicando herencia
		Entrenador e1 = new Entrenador();
		System.out.println("introduzca datos del entrenador");
		System.out.println("introduzca el dni");
		e1.setDni(bufferReader.readLine());
		System.out.println("introduzca el nombre");
		g1.setNombre(bufferReader.readLine());
		System.out.println("introduzca el password");
		e1.setPassword(bufferReader.readLine());
		System.out.println("introduzca la direccion");
		e1.setDireccion(bufferReader.readLine());
		System.out.println("introduzca la edad");
		e1.setEdad(bufferReader.readLine());
		
		
		Entrenador e2 = new Entrenador();
		e2.setDni("6");
		e2.setNombre("entredador 6");
		e2.setPassword(null);
		e2.setDireccion("calle 6");
		e2.setEdad("45");
		
		//realizar las operaciones CRUD
	
		//generar el objeto de operaciones con los datos
		OperacionesPersonaCRUD operacionPersona = new OperacionesPersonaCRUD();
		
		//agregar
		operacionPersona.addDato(g1);
		operacionPersona.addDato(e1);
		operacionPersona.addDato(e2);
		

		//visualizar
		operacionPersona.listar();
		
		//buscar
		System.out.println("Buscar persona ");
		System.out.println(operacionPersona.buscar(e2));
		
		
		//eliminar
		//un punto para el parcial 2
		System.out.println("buscar y eliminar persona ");
		operacionPersona.eliminar(e2);
		
		//visualizar
		operacionPersona.listar();
		
		
	}

}
