package abstraccion;

public class Cilindro extends Circulo {

	private double valor2;
	
	public Cilindro(double valor1, double valor2) {
		super(valor1);
		this.valor2 = valor2;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	@Override
	public double getArea() {
		double area;
		//2 pi r (h + r) 
		area = 2*Math.PI*this.valor1*(this.valor1+ this.valor2);
		return area;
	}
	//2 pi r
	@Override
	public double getPerimetro() {
		return 2*Math.PI*this.valor1;
	}
	

}
