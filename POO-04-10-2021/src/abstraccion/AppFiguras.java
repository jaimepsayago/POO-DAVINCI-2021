package abstraccion;

public class AppFiguras {

	public static void main(String[] args) {
		
		Cuadrado cuadrado = new Cuadrado(11.5);
		System.out.println(cuadrado.getArea());
		
		///abstraccion
		FiguraGeometrica cuadrado2 = new Cuadrado(23.5);
		
		System.out.println(cuadrado2.getArea());

	}

}
