package practica;

public class Cumpleanios {
	
	//variables
	
	private int mes;
	private int dia;

	
	//constructor
	public Cumpleanios() {
		
	}
	public Cumpleanios(int mes, int dia) {
		this.mes=mes;
		this.dia=dia;
	}
	
	//metodovisualizar
	public void visualizar() {
		System.out.println("mes: " + mes +" "+ "dia: " + dia);
	}
	
	//metodo para comparar
	//true o false
	
	public boolean igual(Cumpleanios c) {
		if((dia == c.dia) && (mes ==c.mes))
			return true;
		else
			return false;
		
	}

}
