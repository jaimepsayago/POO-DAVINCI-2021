package estructurasGenericas;
//pila generica

public class ArrayStack<E> implements Stack<E> {

	//tamaño de la pila
	//constantes 
	public static final int CAPACITY = 1000;
	
	//declarar el array generico
	public E[] data;
	
	
	
	//declarar valor del indice de elementos del array
	//stack siempre el indice empieza en -1
	public int t = -1;
	
	//constructores
	//primer constructor es vacio va a tomar el valor de capacity por defecto
	public ArrayStack() {
		this(CAPACITY);
	}
	//segundo constructor nos envia el tamaño como parametros
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	//implementar los metodos de la pila con arrays
	
	
	@Override
	public int size() {
		// cada vez que se llame a este metodo va a aumentar el valor de size
		return (t + 1);
	}

	@Override
	public boolean isEmpty() {
		// si esta vacia la pila nos devuelve -1 
		return (t == -1);
	}

	//agregar dato 
	@Override
	public void push(E e) {
		// primer paso comprobar el tamaño de la pila 
		//lenght== longitud del array 
		if(size() == data.length) {
			throw new IllegalStateException("pila esta llena");
		}
		//agregar el datos en el array generico
		data[++t] = e; //incrementamos el tamño de t y el datos es agregado al array
				
	}

	//visualizar y remover dato
	@Override
	public E pop() {
		//1. revisar si esta vacio
		if (isEmpty()) { 
			return null; //sin llaves lee solo una linea
		}
		
		//2. si no esta vacia
		//2.1. agregamos el array a un obj
			E obj = data[t];
			data[t] = null; //borra el ultimo dato
			t--; //disminuir el indice
			
		
		return obj;
	}

	@Override
	public E top() {
		// mostar datos sin borrarlos
		//1. paso revisar si esta vacio
		if(isEmpty()) {
			return null; //devuelve un valor nulo si esta vacio
		}
		//sino esta vacio enviamos todo el array
		return data[t];
	}
	public E[] getData() {
		return data;
	}
	public void setData(E[] data) {
		this.data = data;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	
	
	@Override
	public int t() {
		
		return t;
	}
	
	

}
