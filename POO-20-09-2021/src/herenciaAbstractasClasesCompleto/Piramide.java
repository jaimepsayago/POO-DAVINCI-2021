package herenciaAbstractasClasesCompleto;

public class Piramide extends Triangulo{

	private double valor3;
	
	public Piramide(double valor1, double valor2, double valor3) {
		super(valor1, valor2);
		this.valor3=valor3;
	
	}

	public double getValor3() {
		return valor3;
	}

	public void setValor3(double valor3) {
		this.valor3 = valor3;
	}
	
	//metodos
	@Override
	public double getArea() {
		//p= (l1+l2+l3)/2
		//area= V(p*(p-l1)*p-l2*p-l3
		double area;
		double p= getPerimetro();
		area = (Math.sqrt(p*(p-this.valor1)*(p-this.getValor2())*(p-valor3)));
		return area;
	}
	
	@Override
	public double getPerimetro() {
		return (this.valor1+this.getValor2()+this.valor3)/2;
	}
	

}
