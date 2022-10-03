
package interfaces1;

import interfaces1.SubClase1;
import interfaces1.SubClase2;
import interfaces1.Superior;

public class Inicio {

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Instanciamos objeto que responde a la definición de Subclase1");
        System.out.println("y se invocan los métodos del mismo :");
        System.out.println("----------------------------------------------------------------");
        SubClase1 subClase1 = new SubClase1();
        invocarMetodosSubclase(subClase1);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Instanciamos objeto que responde a la definición de Subclase2");
        System.out.println("y se invocan los métodos del mismo :");
        System.out.println("----------------------------------------------------------------");        
        Superior subClase2 = new SubClase2();  
        invocarMetodosSubclase(subClase2);
    }
    
    private static void invocarMetodosSubclase(Superior superior) {
        superior.visualizarCadena();
        System.out.println(superior.devolverNumero());  
    }
    
}
