
public abstract class Cuenta {

	// Atributos
	private byte tipoDeCuenta;
	private String alias;
	private double saldo;
	
	public Cuenta(byte tipoDeCuenta, String alias, double saldo) {
		this.tipoDeCuenta = tipoDeCuenta;
		this.alias = alias;
		this.saldo = saldo;
	}

	// M�todos
	public byte getTipoDeCuenta() {
		return tipoDeCuenta;
	}
	
	public String getAlias() {
		return alias;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
