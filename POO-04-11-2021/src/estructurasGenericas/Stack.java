package estructurasGenericas;

//generica
public interface Stack <E> {

	//tama�o de la stack
	int size();
	
	//comprobar si esta vacia
	boolean isEmpty();
	
	//insertar datos
	void push (E e);
	
	//visualiza y remueve datos
	E pop();
	
	//obtener el ultimpo elemento de la stack
	E top();
	
	//tama�o del array
	int t();
	
	
	
	
}
