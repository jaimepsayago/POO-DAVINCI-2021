package recursividad;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(potencia(3,3));
		
		int data[] = {4,3,6,2,8};
		System.out.println(linearSuma(data, 5));
	}
	//siempre son funciones en lo que se utiliza la recursividad
	public static long factorial(long numero) {
		// el caso base = finaliza la funcion
		if(numero == 0) {
			return 1; //retorno uno es decir es el final de la recursividad
	//el proceso recurrente = recursivo = repetitivo
		}else {
			return numero * factorial (numero-1);  //paso recursivo
		}
	}
	
	//potencia de un numero 2
	/*
	 * caso base = finalizar el metodo = if n = 0 ==== 1!
	 * proceso recurrente = funcion que se va a repetir = x*potencia(x,x-1)
	 */
	
	public static double potencia(double x, int n) {
		//caso base
		if (n == 0) {
			return 1;
		//metodo repetetivo
		}else {
			return x * potencia(x, n-1 );
		}
		
	}
	
	//funcion suma array linear
	/*sumar los datos de un array
	 * caso caso n==0 return 1
	 * caso recurrente =  linearSuma(data, n-1) + data[n-1];
	 */
	
	public static int linearSuma(int [] data, int n) {
		//caso base
		if(n== 0) {
			return 0;
		}else {
			return linearSuma(data, n-1) + data[n-1];
		}
	}
	
	
	
	

}
