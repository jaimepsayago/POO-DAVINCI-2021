package herencia;

public class Cuadrado {
	   protected double valor1;
	   public Cuadrado(double valor1) { 
		   this.valor1=valor1;
	   }
	   public double getArea() {
		   return Math.pow(this.valor1, 2); 
	   }
	}

