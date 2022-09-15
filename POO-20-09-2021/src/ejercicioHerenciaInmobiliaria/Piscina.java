package ejercicioHerenciaInmobiliaria;


public class Piscina implements java.io.Serializable {
    private int volumen;
    private boolean cubierta;
    private VasoPiscina vasoPiscina;

    public Piscina() {
    }
    
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isCubierta() {
        return cubierta;
    }

    public void setCubierta(boolean cubierta) {
        this.cubierta = cubierta;
    }  

    public VasoPiscina getVasoPiscina() {
        return vasoPiscina;
    }

    public void setVasoPiscina(VasoPiscina vasoPiscina) {
        this.vasoPiscina = vasoPiscina;
    } 
}
