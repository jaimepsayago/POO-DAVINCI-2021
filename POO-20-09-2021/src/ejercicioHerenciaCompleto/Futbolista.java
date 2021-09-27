package ejercicioHerenciaCompleto;

public class Futbolista extends SeleccionFutbol{
	
	private int dorsal;
	private String demarcacion;
	
	//constructor
	public Futbolista() {
		super(); //heredo las variables del padre
	}
	
	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion){
		super(id,nombre,apellido,edad);
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;
	}
	
	//metodos
	public void jugarPartido() {
		System.out.println("jugar partido");
	}
	public void entrenar() {
		System.out.println("entrenar");
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	//getters and setters
	
	
	

}
