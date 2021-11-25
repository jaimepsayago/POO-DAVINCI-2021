package repasoPolimorfismo;

/*
 * polimorfismo --> herencia = metodos, variables 
 * metodos pueden ser sobreescritos para asignar diferentes comportamientos a partir de los parametros enviados
 * toString
 * constructores a los objetos creados diferentes argumentos
 * 
 * no se puede aplicar sobreescritura a los metodos final o static
 */

public class Cuenta {
	
	private int numeroCuenta;
	private String nombreCliente;
	private Double saldo;
	
	//constructor vacio - permite instanciar un objeto pero sin inicializarlo
	public Cuenta() {
		
	}
	
	//constructor con parametros o argumentos - instanciar objeto pero lo inicializamos
	public Cuenta(int numeroCuenta, String nombreCliente, Double saldo) {
		this.numeroCuenta=numeroCuenta;
		this.nombreCliente = nombreCliente;
		this.saldo=saldo;
		
	}

	//getters and setters
	//encapsulacion
	// se utiliza para acceder y limitar las variables a partir de los metodos acceso get y el set 
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
//metodos
	
	//Depositar: Incrementa el saldo con la cantidad de dinero que se deposita. 
	public void depositar(double cantidad) {
		saldo = saldo + cantidad; //acumulador
	}
	
	//Retirar: Antes de hacer el retiro, se debe verificar la suficiencia de saldo y en caso de aprobarlo, 
	//se disminuye el saldo. 
	
	public void retirar(double cantidad) {
		if(saldo>cantidad) {
			System.out.println("retiro exitoso");
			saldo = saldo - cantidad;
		}else {
			System.out.println("saldo insuficiente para retiro");
		}
	}
	
	//mostrar o consultar o enviar saldo
	public double saldo() {
		return saldo; 
	}
	//To String mostrar los datos de la clase mediante las propiedades
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", nombreCliente=" + nombreCliente + ", saldo=" + saldo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		if (nombreCliente == null) {
			if (other.nombreCliente != null)
				return false;
		} else if (!nombreCliente.equals(other.nombreCliente))
			return false;
		if (numeroCuenta != other.numeroCuenta)
			return false;
		if (saldo == null) {
			if (other.saldo != null)
				return false;
		} else if (!saldo.equals(other.saldo))
			return false;
		return true;
	}
	

	
	
	

	
	
	

}
