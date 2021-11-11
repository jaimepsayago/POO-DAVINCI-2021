package genericos;

import java.util.ArrayList;

public class EjemploGenerico {
	
		public static void main(String[] args) {
		
			Caja c = new Caja();
			c.poner(46);
			//c.qui
			//genericos
			// crear metodos parametrizados
			CajaGenerica<Integer> cajaG = new CajaGenerica<Integer>();
			cajaG.poner(42);
			
			//Arraylist
			//tipo de dato generico 
			ArrayList<Caja> ejemplo = new ArrayList<Caja>();
	}

}
