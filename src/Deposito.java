
public class Deposito extends Transaccion {
	
	private byte cuentaADepositar;

	public Deposito(int monto, byte cuentaADepositar) {
		super(monto);
		this.cuentaADepositar = cuentaADepositar; 
	}

	@Override
	public void realizar() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		// usa monto y cuenta
	}

	@Override
	public boolean comprobarSaldo(byte tipoCuenta) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

}
