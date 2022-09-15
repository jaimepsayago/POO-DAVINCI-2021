package repasoComposicion;

import java.util.ArrayList;
import java.util.Iterator;

public class AppInmueble {

	public static void main(String[] args) {
		//ejemplo de instaciar e inicializar un ojbet
		//Fecha fecha = new Fecha(5,6,8);
		
		// datos propietario del inmueble
		Persona datosPropietario1 = new Persona("1231", "pedro jimenez", "5555878", new Fecha(9,12,1996));
		
		//fecha del inmueble 1
		//otra forma de agregar datos a fecha del inmueble a traves de la encapsulacion
		
		Fecha fechaInmueble1 = new Fecha(); //creando o instanciado objeto pero no inicializado
		fechaInmueble1.setDia(8);
		fechaInmueble1.setMes(11);
		fechaInmueble1.setAño(2015);
		
		//agregar datos al inmueble1 a traves de la encapsulacion
		Inmueble inmueble1 = new Inmueble();
		inmueble1.setSuperficie(95);
		inmueble1.setNumeroHabitaciones((byte)3); //se debe realizar un cast del numero para agregar en la variable
		inmueble1.setPrecio(120000);
		inmueble1.setFechaConstruccion(fechaInmueble1);
		inmueble1.setPropietario(datosPropietario1);
		
		//imprimir el inmueble1
		System.out.println("-------------inmueble 1");
		
		System.out.println("superficie: " + inmueble1.getSuperficie()+ " m2");
		System.out.println(inmueble1.toString());
		
		
		//datos propietario2 
		Persona datosPropietario2 = new Persona("1231", "maria gonzalez", "555546", new Fecha(26,4,1983));
		
		//fecha del inmueble
		Fecha fechaInmueble2 = new Fecha(15,6,2001);
		
		//piscina
		Piscina piscinaCasa = new Piscina();
		piscinaCasa.setVolumen(50);
		piscinaCasa.setCubierta(false);
		
		//garaje
		Garaje garajeCasa = new Garaje();
		garajeCasa.setSuperficie(40);
		garajeCasa.setNumeroPlazas((byte)3);
		garajeCasa.setPuertaAperturaAutomatica(true);
		
		//inmueble 2
		Inmueble inmueble2 = new Inmueble(220, (byte)4, 1500000.0, fechaInmueble2, datosPropietario2, piscinaCasa, garajeCasa);
	
		//imprimir el inmueble2
				System.out.println("-------------inmueble 2");
				
				System.out.println("superficie inmueble2: " + inmueble2.getSuperficie()+ " m2");
				System.out.println(inmueble2.toString());
	
		//arraylist debe ser del tipo de objeto a ser agregado
				//Array
				//vector
				//linkelist
				//arraylist
		//ordenarlos, concatenarlos, buscar valores, modificar valores, agregar valores, quitar valores, en tiempo de ejecucion
				
		ArrayList<Inmueble> arrayInmueble = new ArrayList<Inmueble>();
		arrayInmueble.add(inmueble1);
		arrayInmueble.add(inmueble2);
		
		System.out.println("datos arraylist");
		for (Inmueble var:arrayInmueble) {
			System.out.println(var.toString());
		}
		
		
		//Iterador
		//recorrer un ojbeto sin saber o conocer su tamaño
		//y de la forma lineal y ordenada
		Iterator<Inmueble> iterator = arrayInmueble.iterator();
		
		System.out.println("datos arraylist recorridos con iterator");
		while (iterator.hasNext()) {
			System.out.println(iterator.next()+ "\n");
			
		}
		
		
		
		
		
		
	}

}
