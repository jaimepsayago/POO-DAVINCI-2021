package estructurasGenericas;



public class AppArrayStack {


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// array
		// libreria stack
		
		//array
		
		//objeto de nuestra pila con array
		
		Stack<Integer> stack = new ArrayStack<Integer>();
		
		stack.push(5);
		stack.push(3);
		stack.push(8);
		
		System.out.println(stack.size());
		System.out.println(stack.t());
		System.out.println(stack.isEmpty()); //false
		System.out.println(stack.pop());
		
		//lectura o visualizacion de la pila
		while(stack.isEmpty() == false) { //mientras la pila hasta que este vacia realizar
			System.out.println(stack.pop()); //pop visualiza y saca los datos 
		}
		
		System.out.println(stack.isEmpty()); //true o false
		
		
		//libreria Stack de java
		@SuppressWarnings("rawtypes")
		java.util.Stack stack2 = new java.util.Stack(); //ningun parametro como tipo de dato
		
		//generica ya que puedo agregar cualquier tipo de dato
		stack2.push(50);
		stack2.push("hola");
		
		while(stack2.empty() == false) {
			System.out.println(stack2.pop()); //pop visualiza y saca los datos 
		}
		
		
		//agregar a la pila de objetos tipo Libro
		
		//array implementado
		
		//stack o pila de libro
		Stack<Libro> sLibro = new ArrayStack<Libro>();
			
		//crear algunos objetos de tipo Libro
		Libro l1 = new Libro("harry potter", "pepito");
		Libro l2 = new Libro("star wars","juanito");
		Libro l3 = new Libro("superman", "luis");
		
		//agregar datos a la stack
		sLibro.push(l1);
		sLibro.push(l2);
		sLibro.push(l3);
		
		//mostrar datos
		while(sLibro.isEmpty() == false) { //mientras la pila hasta que este vacia realizar
			System.out.println(sLibro.pop()); //pop visualiza y saca los datos 
		}
		
		
	
		
		

	}

}
