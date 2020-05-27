
public class GestorDeSolicitudes {
	
	private Teclado teclado;
	private Pantalla pantalla;
	
	public GestorDeSolicitudes(){
		this.pantalla = Atm.getPantalla();
		this.teclado = Atm.getTeclado();
	}

	public String solicitarAlias() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		String alias = teclado.ingresoPorTeclado("Ingrese el alias de la cuenta de destino:");
		return alias;	
	}

	public byte solicitarCuenta() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		pantalla.mostrarMensaje("Cuentas disponibles para la operaci�n:");
		pantalla.mostrarMensaje("1: Caja de Ahorro | 2: Cuenta Corriente | 3: Caja de Ahorro USD");
		String tipoDeCuenta = teclado.ingresoPorTeclado("Ingrese la cuenta a operar:");
		return Byte.parseByte(tipoDeCuenta);
	}

	public int solicitarMonto() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		String monto = teclado.ingresoPorTeclado("Ingrese el monto de la operaci�n:");
		return Integer.parseInt(monto);
	}
	
	public String solicitarPin() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		String pin = teclado.ingresoPorTeclado("Ingrese su pin:");
		return pin;
	}

	public String solicitarCodigoDeOperaci�n() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		String codigoDeOperacion = teclado.ingresoPorTeclado("Ingrese el c�digo de operaci�n:");
		return codigoDeOperacion;
		
	}
	
	public String solicitarCuit(){
		String cuit = teclado.ingresoPorTeclado("Ingrese su CUIT:");
		return cuit;
	}
	
}
