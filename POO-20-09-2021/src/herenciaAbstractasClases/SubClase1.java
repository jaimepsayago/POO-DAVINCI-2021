
package herenciaAbstractasClases;

public class SubClase1 extends Superior {
    
    @Override   
    public void setNumero(int numero) {
        this.numero = numero; 
    }
    
    @Override
    public int getNumero() {
        return numero;
    }    
    
    public void visualizarOtraCadena() {
        System.out.println("Cadena de SubClase1 en visualizarOtraCadena");       
    }          
}
