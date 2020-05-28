
public class CuentaCorriente extends Cuenta {
	
	// Atributos
	private int descubierto;
	
	// Métodos
	public CuentaCorriente(String alias, double saldo, int descubierto) {
		super(2, alias, saldo);
		this.descubierto = descubierto;
	}

}
