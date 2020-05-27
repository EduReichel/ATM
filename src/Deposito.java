
public class Deposito extends Transaccion {
	
	private byte cuentaADepositar;

	public Deposito(int monto, byte cuentaADepositar) {
		super(monto);
		this.cuentaADepositar = cuentaADepositar; 
	}

	@Override
	public void realizar() {
		// TODO Apéndice de método generado automáticamente
		// usa monto y cuenta
	}

	@Override
	public boolean comprobarSaldo(byte tipoCuenta) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

}
