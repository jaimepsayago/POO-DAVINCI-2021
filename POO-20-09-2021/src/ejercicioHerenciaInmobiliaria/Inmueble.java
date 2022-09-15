
package ejercicioHerenciaInmobiliaria;

public class Inmueble implements java.io.Serializable {
    private int superficie;
    private byte numeroHabitaciones;
    private float precio;
    private Fecha fechaConstruccion;
    private Persona propietario;
    private Piscina piscina;
    private Garaje garaje;

    public Inmueble() {
        piscina = null;
        garaje = null;
    }
    
    public Inmueble(int superficie, byte numeroHabitaciones, float precio, Fecha fechaConstruccion, Persona propietario, Piscina piscina, Garaje garaje) {    
        this.superficie = superficie;
        this.numeroHabitaciones = numeroHabitaciones;
        this.precio = precio;
        this.fechaConstruccion = fechaConstruccion;
        this.propietario = propietario;
        this.piscina = piscina;
        this.garaje = garaje;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
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

    public void setVolumenPiscina(int volumen) {
        piscina.setVolumen(volumen);
    }  
    
    public int getVolumenPiscina() {
        return piscina.getVolumen();
    }    

    public void setCubiertaPiscina(boolean cubierta) {
        piscina.setCubierta(cubierta);
    }  
    
    public boolean isCubiertaPiscina() {
        return piscina.isCubierta();
    }    
    
    public void setVasoPiscina(VasoPiscina vasoPiscina) {
        piscina.setVasoPiscina(vasoPiscina);
    }  
    
    public VasoPiscina getVasoPiscina() {
        return piscina.getVasoPiscina();
    }       
}

