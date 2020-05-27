
public class Retiro extends Transaccion {

	private byte cuentaARetirar;
	
	public Retiro(int monto, byte cuentaARetirar) {
		super(monto);
		this.cuentaARetirar = cuentaARetirar;
	}

	@Override
	public void realizar() {
		// TODO Apéndice de método generado automáticamente
		retirar(getMonto(), cuentaARetirar);
	}

	@Override
	public boolean comprobarSaldo(byte tipoCuenta) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	private void retirar(int monto, byte tipoCuenta){
		boolean habilitado = comprobarSaldo(tipoCuenta);
		if(habilitado){
			//  TODO Si tiene saldo hay que hacer la operación.
		} else {
			Atm.getPantalla().mostrarMensaje("El saldo es insuficiente"); 
		}
	}
}
