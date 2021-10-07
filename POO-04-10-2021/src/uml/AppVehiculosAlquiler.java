package uml;

public class AppVehiculosAlquiler {

	public static void main(String[] args) {

		//instanciar objetos 
		Coche coche = new Coche("coche1254", 2,2);
		Microbus micro = new Microbus("micro3423", 2, 4);
		VehiculoCarga vc = new VehiculoCarga("vc8989", 2, 500);
		Camion camion = new Camion("camion 3511",2);
		
		System.out.println("coche: \n" + coche.toString()+ "\n valor alquiler: " + coche.getAlquilerFinal());
		System.out.println("micro: \n" + micro.toString()+ "\n valor alquiler: " + micro.getAlquiler());
		System.out.println("vehiculo carga: \n" + vc.toString()+ "\n valor alquiler: " + vc.getAlquiler());
		System.out.println("camion: \n" + camion.toString()+ "\n valor alquiler: " + camion.getAlquiler());
		
	

	}

}
