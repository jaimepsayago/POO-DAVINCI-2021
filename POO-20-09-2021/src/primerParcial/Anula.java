package primerParcial;

public class Anula {

	public static void main(String[] args) {
		Base b = new Base();
		Derivada1 d1 = new Derivada1();
		Derivada2 d2 = new Derivada2();
		Base p = b;
		p.f();
		p.g();
		p = d1; //envio el d1 a p 
		p.f(); 
		p.g(); 
		p = d2; //enviar d2 a p
		p.f(); 
		p.g(); 


	}

}
