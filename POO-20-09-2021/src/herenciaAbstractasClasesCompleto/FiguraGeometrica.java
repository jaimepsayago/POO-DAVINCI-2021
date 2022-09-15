package herenciaAbstractasClasesCompleto;

public abstract class FiguraGeometrica {
	
	protected double valor1;
	
	//constructor
	public FiguraGeometrica(double valor1) {
		super(); //herencia a las subclases abstractas //object
		this.valor1=valor1;
		
	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}
	
	//metodos
	
	//area y perimetro
	public abstract double getArea();
	
	public abstract double getPerimetro();

}
