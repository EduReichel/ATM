
public class TarjetaDeDebito {
	
	private String pin;
	private Cuenta[] cuentas;

	public TarjetaDeDebito(String pin, Cuenta[] cuentas) {
		this.pin = pin;
		this.cuentas = cuentas;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public String getPin() {
		// TODO Apéndice de método generado automáticamente
		return pin;
	}

}
