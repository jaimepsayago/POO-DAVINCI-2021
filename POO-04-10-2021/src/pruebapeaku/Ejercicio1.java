package pruebapeaku;

public class Ejercicio1 {

	public static void main(String[] args) {
		int [] a =  {3, 6, -2, -5, 7, 3};
		
		System.out.println (adjacentElementsProduct(a));
	}
	
	public static int adjacentElementsProduct(int[] inputArray){
	    int cont = 0;
	    int product = 0;
	    int largest = Integer.MIN_VALUE;
	    while(cont < inputArray.length -1) {
	        product = inputArray[cont]*inputArray[cont+1];
	        cont++;
	        if(product > largest)
	            largest = product;
	    }
	    return largest;
	}

}
