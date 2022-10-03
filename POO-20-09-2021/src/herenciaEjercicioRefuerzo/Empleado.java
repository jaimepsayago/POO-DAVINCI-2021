package herenciaEjercicioRefuerzo;

//Clase Empleado. Clase Base de la jerarqu�a
public class Empleado {
  private String nombre;

  //constructor por defecto
  public Empleado() {
  }

  //constructor con un par�metro
  public Empleado(String nombre) {
      this.nombre = nombre;
      System.out.println("Constructor de Empleado " + nombre);
  }
 
  //m�todos get y set
  public String getNombre() {
      return nombre;
  }
  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  //m�todo toString()
  //devuelve un String formado por la palabra �Empleado� y el nombre de empleado                                
  @Override
  public String toString() {
      return "Empleado " + nombre;
  }
}