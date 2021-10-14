package abstraccion;

public class CirculoInterfaz extends Circulo implements Figura{

	public CirculoInterfaz(double valor1) {
		super(valor1);
		
	}

	@Override
	public void area() {
		System.out.println("areas circulo: " + Math.PI*Math.pow(valor1,2));
		
	}
	

}
