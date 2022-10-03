
package interfaces1;

public class SubClase1 implements Superior {
    @Override
    public void visualizarCadena() {
         System.out.println("Cadena de SubClase1");
    }
    
    @Override
    public int devolverNumero() {
         return 10;
    }
}
