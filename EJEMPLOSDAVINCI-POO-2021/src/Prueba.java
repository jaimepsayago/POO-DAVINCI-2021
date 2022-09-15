import java.util.Scanner;
public class Prueba {

	private static int SumadetodoslosEnteros(int n) {
		int suma = n * (n + 1) / 2;

		return suma;

	}
	public static void main(String[] args) {
		
		
			Scanner input = new Scanner (System.in);
			System.out.println("Ingrese el Número: "); 
			int x = input.nextInt();
			System.out.println("El resultado de la suma de los enteros positivos menores o iguales es:  "+SumadetodoslosEnteros(x));
			
			input.close();
		}
		
	

	}


