
public class CompraDeDolares extends Transaccion {
	
	private byte cuentaDeOrigen;

	public CompraDeDolares(int monto, byte cuentaDeOrigen) {
		// TODO Ap�ndice de constructor generado autom�ticamente
		super(monto);
		this.cuentaDeOrigen = cuentaDeOrigen;
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
