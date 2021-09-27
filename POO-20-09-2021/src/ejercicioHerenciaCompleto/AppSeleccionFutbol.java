package ejercicioHerenciaCompleto;

import java.util.ArrayList;

public class AppSeleccionFutbol {
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
	
	public static void main(String[] args) {
		// crear objetos, agregarlos en una lista y mostrarlos
		
		Entrenador delBosque = new Entrenador(1, "vicente", "del bosque", 60, "id432");
		Futbolista iniesta = new Futbolista(2, "andres", "iniesta", 35, 6, "marcador");
		Masajista raulMartinez = new Masajista(3, "raul", "martinez", 40, "lic. fisioterapia",18);
		
		//agregar los objetos a la lista
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		
		//ejecutar la aplicacion y a visualizar los objetos
		System.out.println("visualizar concentracion");
		
		//foreach o for mejorado-->permite recorrer objetos mas facilmente
		
		for(SeleccionFutbol integrante: integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido()+ "-->" );
			integrante.concentrarse();
		}
		
		//viaje  
		for(SeleccionFutbol integrante: integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido()+ "-->" );
			integrante.viajar();
		}
		
		

	}

}
