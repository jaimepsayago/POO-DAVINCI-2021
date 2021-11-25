package repasoPolimorfismo;

public class AppCuentaBanco {

	public static void main(String[] args) {
		
		CuentaAhorros ca = new CuentaAhorros(11111, "jaime",2500.50, "25/11/2021", 5);
		
		//consultar el saldo
		System.out.println("Total actual en la cuenta: " + ca.saldo() + " $");
		

		//depositar un valor cualquiera
		ca.depositar(200);
		
		//consultar el saldo
		System.out.println("Total actual en la cuenta: " + ca.saldo() + " $");
		
		
		//depositar los interes en la cuenta ahorros 
		ca.depositar("2");
		
		//depositar los interes en la cuenta ahorros 
		ca.depositar("1");
		
		//consultar el saldo
				System.out.println("Total actual en la cuenta: " + ca.saldo() + " $");
				
		//retirar valores de la cuenta de ahorros
		ca.retirar(500, "25/11/2021");
		
		//consultar el saldo
		System.out.println("Total actual en la cuenta: " + ca.saldo() + " $" + ca.toString());
		
		
		CuentaCheques cc = new CuentaCheques(11111, "jaime",2500.50, 5.0, 10.0);
		cc.valorComisionSaldoInsuficiente();
		
		//consultar el saldo
		System.out.println("Total actual en la cuenta cheques: " + cc.saldo() + " $" + cc.toString());
		
		cc.depositar(800);
		//consultar el saldo
				System.out.println("Total actual en la cuenta cheques: " + cc.toString());
		
	}

}
