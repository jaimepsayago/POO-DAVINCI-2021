package estructurasGenericas;

//generica
public interface Stack <E> {

	//tamaño de la stack
	int size();
	
	//comprobar si esta vacia
	boolean isEmpty();
	
	//insertar datos
	void push (E e);
	
	//visualiza y remueve datos
	E pop();
	
	//obtener el ultimpo elemento de la stack
	E top();
	
	//tamaño del array
	int t();
	
	
	
	
}
