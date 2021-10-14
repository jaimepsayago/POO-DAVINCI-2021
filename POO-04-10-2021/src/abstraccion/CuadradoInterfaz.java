package abstraccion;

public class CuadradoInterfaz extends Cuadrado implements Figura{

	public CuadradoInterfaz(double valor1) {
		super(valor1);
		
	}

	@Override
	public void area() {
		System.out.println("area" + (Math.pow(this.valor1,2)));
		
	}
 
	
}
