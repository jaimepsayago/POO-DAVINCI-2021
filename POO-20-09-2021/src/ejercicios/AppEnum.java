package ejercicios;

enum Color{
	ROJO, VERDE, AZUL;
}
enum Nacionalidad{
	ARGENTINO, ECUATORIANO, PERUANO;
}


public class AppEnum {
	
	public static void main(String[] args) {
		//Enum --> constantes --Dentro o fuera de una clase -- no puedo agregarlo en un metodo

		Color c1 = Color.ROJO;
		System.out.println(c1);
		
	}

}
