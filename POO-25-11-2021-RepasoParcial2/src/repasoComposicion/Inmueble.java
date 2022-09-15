package repasoComposicion;

public class Inmueble {
	
	private int superficie;
	private byte numeroHabitaciones;
	private double precio;
	//referencia a los atributos de otros objetos
	private Fecha fechaConstruccion; //dia mes año
	private Persona propietario; //nombrePro, apelidoP,telefonoP
	private Piscina piscina; //creando o instanciando un objeto piscina  y garaje pero no estan inicializados
	private Garaje garaje;
	
	//constructor
	public Inmueble() {
		//valores iniciales aunque sean nulos o vacios
		//exista un error de inicializacion de los objetos o variables 
		piscina= null; //no tienen argumentos de inicializacion solo de instancia
		garaje = null; //asi se requiere iniicalizar los objetos piscina y garaje con valores nulos
	}
	
	//constructor con datos
	public Inmueble (int superficie, byte numerHabitaciones, double precio, Fecha fechaConstruccion, Persona propietario,
			Piscina piscina, Garaje garaje) {
		this.superficie=superficie;
		this.numeroHabitaciones=numerHabitaciones;
		this.precio=precio;
		this.fechaConstruccion = fechaConstruccion;
		this.propietario= propietario;
		this.piscina=piscina;
		this.garaje=garaje;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public byte getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(byte numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Fecha getFechaConstruccion() {
		return fechaConstruccion;
	}

	public void setFechaConstruccion(Fecha fechaConstruccion) {
		this.fechaConstruccion = fechaConstruccion;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public Piscina getPiscina() {
		return piscina;
	}

	public void setPiscina(Piscina piscina) {
		this.piscina = piscina;
	}

	public Garaje getGaraje() {
		return garaje;
	}

	public void setGaraje(Garaje garaje) {
		this.garaje = garaje;
	}

	@Override
	public String toString() {
		return "Inmueble [superficie=" + superficie + ", numeroHabitaciones=" + numeroHabitaciones + ", precio="
				+ precio + ", fechaConstruccion=" + fechaConstruccion + ", propietario=" + propietario.toString() + ", piscina="
				+ piscina + ", garaje=" + garaje + "]";
	}
	
	
	
	

}
