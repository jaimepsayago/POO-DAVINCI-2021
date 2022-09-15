package ejercicioHerenciaInmobiliaria;


public class Inicio {
    public static void main(String[] args) {  
        //     DATOS PROPIETARIO 1
        Persona datosPropietario1 = new Persona("12378", "PEDRO JOSE GIMENEZ APARICIO", "631575890", new Fecha(9, 12, 1985));
        //     FECHA CONSTRUCCION INMUEBLE 1    
        Fecha fechaInmueble1 = new Fecha();
        fechaInmueble1.setDia(19);
        fechaInmueble1.setMes(11);
        fechaInmueble1.setAnio(2005);        
        //     INMUEBLE 1
        Inmueble inmueble1 = new Inmueble();
        inmueble1.setSuperficie(95);
        inmueble1.setNumeroHabitaciones((byte)3);
        inmueble1.setPrecio(120000);
        inmueble1.setFechaConstruccion(fechaInmueble1);
        inmueble1.setPropietario(datosPropietario1);
        
        //     DATOS PROPIETARIO 2
        Persona datosPropietario2 = new Persona("34780", "MARIA LUISA GONZALEZ CALDERON", "654123458", new Fecha(26, 4, 1973));
        //     FECHA CONSTRUCCION INMUEBLE 2    
        Fecha fechaInmueble2 = new Fecha(15,8,2001);     
        //     PISCINA
        Piscina piscinaCasa = new Piscina();
        //     GARAJE
        Garaje garajeCasa = new Garaje();   
        garajeCasa.setSuperficie(40);
        garajeCasa.setNumeroPlazas((byte)2);
        garajeCasa.setPuertaAperturaAutomatica(true);
        //     INMUEBLE 2
        Inmueble inmueble2 = new Inmueble(220, (byte)4, 450000, fechaInmueble2, datosPropietario2, piscinaCasa, garajeCasa);        
        inmueble2.setVolumenPiscina(50);
        inmueble2.setCubiertaPiscina(false);
        inmueble2.setVasoPiscina(VasoPiscina.FIBRA_VIDRIO);
        
        System.out.println("---------  INMUEBLE 1  ----------");
        System.out.println("Superficie : "+inmueble1.getSuperficie()+" m2");   
        System.out.println("Número habitaciones : "+inmueble1.getNumeroHabitaciones()); 
        System.out.println("Precio : "+inmueble1.getPrecio()); 
        System.out.println("Fecha construcción : "+inmueble1.getFechaConstruccion().getDia()+"-"+inmueble1.getFechaConstruccion().getMes()+"-"+inmueble1.getFechaConstruccion().getAnio()); 
        System.out.println("DNI propietario : "+inmueble1.getPropietario().getDni()); 
        System.out.println("Nombre propietario : "+inmueble1.getPropietario().getNombre());
        System.out.println("Teléfono propietario : "+inmueble1.getPropietario().getTelefono());
        System.out.println("Fecha nacimiento propietario : "+inmueble1.getPropietario().getFechaNacimiento().getDia()+"-"+inmueble1.getPropietario().getFechaNacimiento().getMes()+"-"+inmueble1.getPropietario().getFechaNacimiento().getAnio());
        if (inmueble1.getPiscina() != null)
        {
            System.out.println("Volumen de la piscina : "+inmueble1.getVolumenPiscina()+" m3");
            if(inmueble1.isCubiertaPiscina())
                System.out.println("La piscina es cubierta");
            System.out.println("Tipo de vaso de la piscina : "+inmueble1.getVasoPiscina().name());
            System.out.println("Coste por m3 del vaso de la piscina : "+inmueble1.getVasoPiscina().getPrecioPorMetroCubico());
            System.out.println("Coste de cosntrucción del vaso de la piscina : "+(inmueble1.getVolumenPiscina()*inmueble2.getVasoPiscina().getPrecioPorMetroCubico()));
            System.out.println("Descripción del vaso de la piscina : "+inmueble1.getVasoPiscina().getDescripcion());
            System.out.print("Características de este tipo de piscina: ");
            switch(inmueble1.getVasoPiscina())
            {
                case HORMIGON: System.out.println("Es el sistema tradicional");
                               break;
                case ACERO_INOXIDABLE: System.out.println("Superficie de mayor resistencia");
                               break;      
                case HINCHABLE: System.out.println("Son las más económicas");
                               break;   
                case FIBRA_VIDRIO: System.out.println("Fácil transporte e instalación");
                               break;                              
            }           
        }
        if (inmueble1.getGaraje() != null)
        {
            System.out.println("Superficie del garaje : "+inmueble1.getGaraje().getSuperficie()+" m2");
            System.out.println("Número de plazas del garaje : "+inmueble1.getGaraje().getNumeroPlazas());
            if(inmueble1.getGaraje().isPuertaAperturaAutomatica())
                System.out.println("Garaje con apertura automática");            
        }  
        
         System.out.println("---------  INMUEBLE 2  ----------");
        System.out.println("Superficie : "+inmueble2.getSuperficie()+" m2");   
        System.out.println("Número habitaciones : "+inmueble2.getNumeroHabitaciones()); 
        System.out.println("Precio : "+inmueble2.getPrecio()); 
        System.out.println("Fecha construcción : "+inmueble2.getFechaConstruccion().getDia()+"-"+inmueble2.getFechaConstruccion().getMes()+"-"+inmueble2.getFechaConstruccion().getAnio()); 
        System.out.println("DNI propietario : "+inmueble2.getPropietario().getDni()); 
        System.out.println("Nombre propietario : "+inmueble2.getPropietario().getNombre());
        System.out.println("Teléfono propietario : "+inmueble2.getPropietario().getTelefono());
        System.out.println("Fecha nacimiento propietario : "+inmueble2.getPropietario().getFechaNacimiento().getDia()+"-"+inmueble2.getPropietario().getFechaNacimiento().getMes()+"-"+inmueble2.getPropietario().getFechaNacimiento().getAnio());
        if (inmueble2.getPiscina() != null)
        {
            System.out.println("Volumen de la piscina : "+inmueble2.getVolumenPiscina()+" m3");
            if(inmueble2.isCubiertaPiscina())
                System.out.println("La piscina es cubierta");
            System.out.println("Tipo de vaso de la piscina : "+inmueble2.getVasoPiscina().name());
            System.out.println("Coste por m3 del vaso de la piscina : "+inmueble2.getVasoPiscina().getPrecioPorMetroCubico());
            System.out.println("Coste de cosntrucción del vaso de la piscina : "+(inmueble2.getVolumenPiscina()*inmueble2.getVasoPiscina().getPrecioPorMetroCubico()));
            System.out.println("Descripción del vaso de la piscina : "+inmueble2.getVasoPiscina().getDescripcion());
            System.out.print("Características de este tipo de piscina: ");
            switch(inmueble2.getVasoPiscina())
            {
                case HORMIGON: System.out.println("Es el sistema tradicional");
                               break;
                case ACERO_INOXIDABLE: System.out.println("Superficie de mayor resistencia");
                               break;      
                case HINCHABLE: System.out.println("Son las más económicas");
                               break;   
                case FIBRA_VIDRIO: System.out.println("Fácil transporte e instalación");
                               break;                              
            }
        }
        if (inmueble2.getGaraje() != null)
        {
            System.out.println("Superficie del garaje : "+inmueble2.getGaraje().getSuperficie()+" m2");
            System.out.println("Número de plazas del garaje : "+inmueble2.getGaraje().getNumeroPlazas());
            if(inmueble2.getGaraje().isPuertaAperturaAutomatica())
                System.out.println("Garaje con apertura automática");            
        }         
    }   
}