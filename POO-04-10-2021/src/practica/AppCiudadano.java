package practica;

import java.util.ArrayList;

public class AppCiudadano {

	public static ArrayList<Humano> array = new ArrayList<Humano>();
	
	public static void main(String[] args) {
	
		Humano h = new Humano("juan", "calle");
		Ciudadano c = new Ciudadano("pedro","perez","02155");
		
		//arraylist
		array.add(h);
		array.add(c);
		
		for (Humano datos: array) {
			System.out.println(datos.nombreCompleto());
		}
		

	}

}
