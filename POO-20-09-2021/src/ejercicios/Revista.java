package ejercicios;

public class Revista extends Publicacion {

	public int numeroEjemplaresPorAnyo;
	public String periodicidad;
	
	
	//constructor
	Revista(){
		
	}
	
	//sobrecarga
	Revista(int numero, String periodicidad){
		numeroEjemplaresPorAnyo = numero;
		this.periodicidad = periodicidad;
		
	}
	


	public int getNumeroEjemplaresPorAnyo() {
		return numeroEjemplaresPorAnyo;
	}


	public void setNumeroEjemplaresPorAnyo(int numeroEjemplaresPorAnyo) {
		this.numeroEjemplaresPorAnyo = numeroEjemplaresPorAnyo;
	}


	public String getPeriodicidad() {
		return periodicidad;
	}


	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}
	
	//getters and setters
	
	
	
	
	
	
}
