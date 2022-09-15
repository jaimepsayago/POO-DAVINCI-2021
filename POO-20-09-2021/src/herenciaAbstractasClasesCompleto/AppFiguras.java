package herenciaAbstractasClasesCompleto;

public class AppFiguras {

	public static void main(String[] args) {
		
		Cuadrado cuadrado = new Cuadrado(11.5);
		System.out.println(cuadrado.getArea());
		
		///abstraccion
		FiguraGeometrica cuadrado2 = new Cuadrado(23.5);
		
		System.out.println(cuadrado2.getArea());
		
		//ejercicio cilindro 
	
		System.out.println("cilindro");
		Cilindro cl = new Cilindro(4, 5);
		System.out.println(cl.getArea());
		System.out.println(cl.getPerimetro());
		
		//ejercicio interfaz
		System.out.println("cuadrado interfaz");
		//CuadradoInterfaz ci = new CuadradoInterfaz(4);
		//ci.area();
		
		
		
	}

}
