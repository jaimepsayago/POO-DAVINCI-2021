package herencia;

public class AppPersona {

	public static void main(String[] args) {

		Persona persona = new Persona("verdes", "masculino", "1,78", "200", "12456521", "jaime", "sayago");
		//persona.setAltura("1.56");
		
		persona.respirarPersona();
		
		System.out.println(persona.toString());

	}

}
