
package herenciaAbstractasClases;

public abstract class Superior {
    
      protected int numero;
      
    abstract void setNumero(int numero);   
    abstract int getNumero();
    
    public void visualizarCadena() {
        System.out.println("Cadena de Superior");
    }
}
