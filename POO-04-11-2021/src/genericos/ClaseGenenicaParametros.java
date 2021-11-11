package genericos;

public class ClaseGenenicaParametros <T, V> {
	
	//usar los parametros del tipo de datos
	T obj1; //declar estos obj1 de tipo T
	V obj2;
	
	//constructor
	ClaseGenenicaParametros(){
		
	}
	
	ClaseGenenicaParametros(T o1, V o2){
		obj1 = o1;
		obj2 = o2;
		
	}
	//getters and setters
	public T getObj1() {
		return obj1;
	}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}

	public V getObj2() {
		return obj2;
	}

	public void setObj2(V obj2) {
		this.obj2 = obj2;
	}
	
	//mostrar los tipo de T y V
	public void mostrarTipo() {
		System.out.println("el tipo de dato de t es: " + obj1.getClass().getName());
		System.out.println("el tipo de dato de v es: " + obj2.getClass().getName());
	}
	
	
	
	

}
