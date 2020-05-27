
public class CompraDeDolares extends Transaccion {
	
	private byte cuentaDeOrigen;

	public CompraDeDolares(int monto, byte cuentaDeOrigen) {
		// TODO Apéndice de constructor generado automáticamente
		super(monto);
		this.cuentaDeOrigen = cuentaDeOrigen;
	}

	@Override
	public void realizar() {
		// TODO Apéndice de método generado automáticamente

	}

	@Override
	public boolean comprobarSaldo(byte tipoCuenta) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

}
