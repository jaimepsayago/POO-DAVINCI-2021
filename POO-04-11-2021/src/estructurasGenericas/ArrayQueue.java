package estructurasGenericas;

public class ArrayQueue <E> implements Queue<E>{
	
	//variables
	private E[] data; //array de datos
	private int f=0; //index
	private int sz = 0; //numero de elementos
	public static final int CAPACITY = 1000;
	
	//constructor
	public ArrayQueue() {
	 this(CAPACITY); //tamaño por defecto
	}
	
	public ArrayQueue(int capacity) {
		data = (E[]) new Object[capacity];  //tamaño declarado por el usuario
		 
	}

	//devuelve el numero de elementos
	@Override
	public int size() {
		return sz;
	}

	@Override
	public boolean isEmpty() {
		// si esta vacia
		return (sz==0);
	}

	//agregar elemento
	@Override
	public void addQueue(E e) {
		// primero revisar si esta o no llena la cola
		if(sz == data.length) {
			throw new IllegalStateException("cola esta llena");
		}
	
		//agregamos una funcion para conocer el valor a agregar en la cola
		int av = (f + sz) % data.length;
		data[av] = e; //agregamos el valor obtenido en av como indice de cola
		sz++;
	}

	//retorna el primer valor pero no lo remueve
	@Override
	public E first() {
		if(isEmpty()) {
			return null;
		}
		return data[f];
	}

	//retorna y remueve el ultimo elemento
	@Override
	public E deQueue() {
		if(isEmpty()) {
			return null;
		}
		E res = data[f]; //insertamos un objeto a una variable res
		data[f] = null; //referencia el objeto a nulo -> espacio2 espacio3
		f = (f+1) % data.length; //reobtengo el tamaño del objeto
		sz--;
		return res;
	}

}
