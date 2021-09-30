package tareaHerenciaGeneralizacionEnum;
/*
 * 
nombre heredado
edad heredado
salario definido
visualizar heredada

 */
public class Profesor extends Persona{
	int salario;
	
	//constructor
	public Profesor() {
		
	}
	public Profesor(String nombre, int edad, int salario) {
		super(nombre, edad);
		this.salario=salario;
	}
	//metodo
	//heredado
	
	
	
	//getters and setters
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	

}
