package repasoPolimorfismo;

public class CuentaAhorros extends Cuenta{
	
	public String fechaVencimiento;
	public int porcentajeInteresMensual;
	
	//constructor vacio
	public CuentaAhorros() {
		super(); //herendando el constructor vacio de la clase padre Cuenta
	}
	
	//constructor con argumentos
	public CuentaAhorros(int numeroCuenta, String nombreCliente, Double saldo, 
			String fechaVencimiento, int porcentajeInteresMensual) {
		super(numeroCuenta, nombreCliente, saldo); //herendando el constructor vacio de la clase padre Cuenta
		this.fechaVencimiento = fechaVencimiento;
		this.porcentajeInteresMensual=porcentajeInteresMensual;
	}
	//getters and setters
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getPorcentajeInteresMensual() {
		return porcentajeInteresMensual;
	}

	public void setPorcentajeInteresMensual(int porcentajeInteresMensual) {
		this.porcentajeInteresMensual = porcentajeInteresMensual;
	}
	
	//metodos

	//calculo del valor del interes mensual
	//2% de interes mensual
	//valores del interes = (saldo * interes)/100
	public double calcularValorMensual() {
		double valorInteresMensual;
		valorInteresMensual = (super.saldo() * porcentajeInteresMensual / 12 )/100;
		return valorInteresMensual;
	}
	
//	• Método para depositar los intereses el primer día de cada mes.
	
	public void depositar(String dia) {
		if(dia == "1") {
			super.depositar(calcularValorMensual()); //hago un llamado al metodo de clase padre y reutilizo el codigo
		}else {
			System.out.println("no corresponde la fecha al primer dia del mes");
		}
	}
//• Solamente se puede retirar dinero el día de la fecha de vencimiento. 
//dos parametros
	public void retirar(double cantidad, String fechaRetiro) {
		if(fechaVencimiento == fechaRetiro) {
			super.retirar(cantidad);
		}else {
			System.out.println("no corresponde la fecha de vencimineto para realizar el retiro");
		}
		
	}
	
	

}
