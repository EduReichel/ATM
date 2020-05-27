
public class GestorDeSolicitudes {
	
	private Teclado teclado;
	private Pantalla pantalla;
	
	public GestorDeSolicitudes(){
		this.pantalla = Atm.getPantalla();
		this.teclado = Atm.getTeclado();
	}

	public String solicitarAlias() {
		// TODO Apéndice de método generado automáticamente
		String alias = teclado.ingresoPorTeclado("Ingrese el alias de la cuenta de destino:");
		return alias;	
	}

	public byte solicitarCuenta() {
		// TODO Apéndice de método generado automáticamente
		pantalla.mostrarMensaje("Cuentas disponibles para la operación:");
		pantalla.mostrarMensaje("1: Caja de Ahorro | 2: Cuenta Corriente | 3: Caja de Ahorro USD");
		String tipoDeCuenta = teclado.ingresoPorTeclado("Ingrese la cuenta a operar:");
		return Byte.parseByte(tipoDeCuenta);
	}

	public int solicitarMonto() {
		// TODO Apéndice de método generado automáticamente
		String monto = teclado.ingresoPorTeclado("Ingrese el monto de la operación:");
		return Integer.parseInt(monto);
	}
	
	public String solicitarPin() {
		// TODO Apéndice de método generado automáticamente
		String pin = teclado.ingresoPorTeclado("Ingrese su pin:");
		return pin;
	}

	public String solicitarCodigoDeOperación() {
		// TODO Apéndice de método generado automáticamente
		String codigoDeOperacion = teclado.ingresoPorTeclado("Ingrese el código de operación:");
		return codigoDeOperacion;
		
	}
	
	public String solicitarCuit(){
		String cuit = teclado.ingresoPorTeclado("Ingrese su CUIT:");
		return cuit;
	}
	
}
