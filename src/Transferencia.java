
public class Transferencia extends Transaccion {
	
	private byte cuentaOrigen;
	private String aliasCuentaDestino;
	
	public Transferencia(int monto, byte cuentaOrigen, String aliasCuentaDestino) {
		// TODO Ap�ndice de constructor generado autom�ticamente
		super(monto);
		this.cuentaOrigen = cuentaOrigen;
		this.aliasCuentaDestino = aliasCuentaDestino;
	}

	@Override
	public void realizar() {
		// TODO Ap�ndice de m�todo generado autom�ticamente

	}

	@Override
	public boolean comprobarSaldo(byte tipoCuenta) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

}
