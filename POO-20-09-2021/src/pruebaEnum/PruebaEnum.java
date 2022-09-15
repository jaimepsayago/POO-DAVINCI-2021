
package pruebaEnum;

public class PruebaEnum {
    public static void main(String[] args) {
        
            VasoPiscina vasoPiscina;
            vasoPiscina = VasoPiscina.FIBRA_VIDRIO;
            
            if (vasoPiscina == VasoPiscina.FIBRA_VIDRIO)
                System.out.println("Facilita el transporte y es de rapida instalacion");
            
            switch(vasoPiscina)
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
}
