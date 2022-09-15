
package herenciaAbstractasClases;

public class Inicio {
    public static void main(String[] args) {
      
        SubClase1 objeto1SubClase1 = new SubClase1();
        objeto1SubClase1.setNumero(80);
        System.out.println("número encapsulado en objeto 1 mediante método setNumero :  "+objeto1SubClase1.getNumero());
        objeto1SubClase1.visualizarCadena();
        objeto1SubClase1.visualizarOtraCadena();
    }    
}


