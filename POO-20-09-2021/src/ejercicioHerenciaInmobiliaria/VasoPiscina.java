package ejercicioHerenciaInmobiliaria;

public enum VasoPiscina {
    HORMIGON(400,"Estructura de hormigón armado"),
    ACERO_INOXIDABLE(500,"Paneles de acero inoxidable"),
    HINCHABLE(200,"PVC permite hinchado con bomba de aire"),
    FIBRA_VIDRIO(300,"Poliéster reforzado con fibra de vidrio");
    
    private int precioPorMetroCubico;
    private String descripcion;
    
    private VasoPiscina(int precioPorMetroCubico, String descripcion) {
        this.precioPorMetroCubico = precioPorMetroCubico;
        this.descripcion = descripcion;
    }

    public int getPrecioPorMetroCubico() {
        return precioPorMetroCubico;
    }

    public String getDescripcion() {
        return descripcion;
    }  
}
