package herencia;

public class Humano {
	
	//atributos
	public String colorOjos;
	public String sexo;
	public String altura, peso;
	
	
	//construtor
	public Humano() {
		
	}
	
	public Humano(String colorOjos, String sexo, String altura, String peso) {
		this.colorOjos= colorOjos;
		this.sexo = sexo;
		this.altura=altura;
		this.peso=peso;
	}
	
	public Humano(String altura, String peso) {
		this.altura=altura;
		this.peso=peso;
	}

	
	//getters and setters
	
	
	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	//metodos
	
	public void respirar() {
		System.out.println("respirar Humano");
	}
	public void correr() {
		System.out.println("correr");
	}
	
	public String toString() {
		return "humano" + "ojos: " + colorOjos +  " \nsexo: " + sexo + " \naltura: " + altura + "\npeso:"+  peso;
	}
	

}
