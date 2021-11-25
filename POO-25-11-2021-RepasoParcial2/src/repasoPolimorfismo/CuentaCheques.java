package repasoPolimorfismo;

public class CuentaCheques extends Cuenta{
	
	/*• Comisión por uso de chequera. 
• Comisión por emisión de cheques con saldo insuficiente, la cual se descuenta directamente del saldo. 
*/
	double comisionChequera;
	double comisionSaldoInsuficiente;
	
	//constructor 
	public CuentaCheques() {
		super();
	}
	
	public CuentaCheques(int numeroCuenta, String nombreCliente, Double saldo, 
			double comisionChequera, double comisionSaldoInsuficiente) {
		super(numeroCuenta, nombreCliente, saldo);
		this.comisionChequera=comisionChequera;
		this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;
	}
	//getters and setters
	public double getComisionChequera() {
		return comisionChequera;
	}
	public void setComisionChequera(double comisionChequera) {
		this.comisionChequera = comisionChequera;
	}
	public double getComisionSaldoInsuficiente() {
		return comisionSaldoInsuficiente;
	}
	public void setComisionSaldoInsuficiente(double comisionSaldoInsuficiente) {
		this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;
	}
	
	//metodos 
	//• Comisión por emisión de cheques con saldo insuficiente,  
	//la cual se descuenta directamente del saldo.
	//descuento == retiro
	public void valorComisionSaldoInsuficiente () {
	
		//double valor=0;
		//valor = comisionSaldoInsuficiente-super.saldo(); //sin herencia
		//super.retirar(valor) 

		//valor deberia quitarse del saldo general
		super.retirar(comisionSaldoInsuficiente); //con herencia
		
			
	}
	
	
}
