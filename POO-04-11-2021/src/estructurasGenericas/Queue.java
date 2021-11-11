package estructurasGenericas;

public interface Queue <E> {
	
	//tamaño de la cola queue
	int size();
	
	//si esta vacia
	boolean isEmpty();
	
	//insertar elemento
	void addQueue(E e);
	
	//retornar el primer valor
	E first();
	
	//remover y retornar el primer elemento
	E deQueue();
	

}
