
package interfaces1;

public class SubClase2 implements Superior{
    @Override
    public void visualizarCadena() {
         System.out.println("Cadena de SubClase2");
    }
    
    @Override
    public int devolverNumero() {
         return 500;
    }    
}
