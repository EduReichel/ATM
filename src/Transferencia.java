
public class Transferencia extends Transaccion {
	
	private byte cuentaOrigen;
	private String aliasCuentaDestino;
	
	public Transferencia(int monto, byte cuentaOrigen, String aliasCuentaDestino) {
		// TODO Apéndice de constructor generado automáticamente
		super(monto);
		this.cuentaOrigen = cuentaOrigen;
		this.aliasCuentaDestino = aliasCuentaDestino;
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
