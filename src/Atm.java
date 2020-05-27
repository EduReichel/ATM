
public class Atm {
	
	//Atributos
	private LectorDeTarjetas lectorDeTarjeta;
	private static Pantalla pantalla;
	private static Teclado teclado;
	private DispensadorDeEfectivo dispensador;
	private RanuraDeDeposito ranuraDeDeposito;
	private Impresora impresora;
	private Transaccion transaccionEnCurso;
	private boolean atmIniciado; 
	private GestorDeSolicitudes gestorDeSolicitudes;
	private Usuario usuarioActual;
	
	//Constructor
	public Atm(){
		this.lectorDeTarjeta = new LectorDeTarjetas();
		this.pantalla = new Pantalla();
		this.teclado = new Teclado();
		this.dispensador = new DispensadorDeEfectivo();
		this.ranuraDeDeposito = new RanuraDeDeposito();
		this.impresora = new Impresora();	
		this.atmIniciado = false;
	}

	//M�todos
	public void iniciar(){
		this.atmIniciado = true;
		pantalla.mostrarMensaje("El cajero esta operativo. Por favor, ingrese su tarjeta seguido de la clave");
	}
	
	public void finalizar(){
		this.atmIniciado = false;
		pantalla.mostrarMensaje("Se ha finalizado la sesi�n. Gracias por utilizar el cajero.");
	}
	
	public boolean realizarTransaccion(byte codigoOperacion) throws CodigoOperacionInvalidoException{
		boolean estadoTransaccion;
		
		if(codigoOperacion > 0 && codigoOperacion<5){
			estadoTransaccion = true; //Falta hacer toda la transacci�n
			asignarTipoDeTransaccion(codigoOperacion);
			transaccionEnCurso.realizar();
		} else {
			throw new CodigoOperacionInvalidoException("Input","Codigo de transacci�n inv�lido"); 
			// Se deber�a reintentar la operaci�n realizar transacci�n.
		}
		
		return estadoTransaccion;
	}
	
	private void asignarTipoDeTransaccion(byte codigoOperacion){
		switch (codigoOperacion){
        	case 1:	transaccionEnCurso = new Deposito(gestorDeSolicitudes.solicitarMonto(), gestorDeSolicitudes.solicitarCuenta());
        			break;
        	case 2:	transaccionEnCurso = new Retiro(gestorDeSolicitudes.solicitarMonto(), gestorDeSolicitudes.solicitarCuenta());
        			break;
        	case 3:	transaccionEnCurso = new CompraDeDolares(gestorDeSolicitudes.solicitarMonto(), gestorDeSolicitudes.solicitarCuenta());
					break;
        	case 4:	transaccionEnCurso = new Transferencia(gestorDeSolicitudes.solicitarMonto(), gestorDeSolicitudes.solicitarCuenta(), gestorDeSolicitudes.solicitarAlias());
					break;
		}
	}

	public void ingresoDeTarjeta() throws CuitInvalidoException, PinInvalidoException {
		String cuit = gestorDeSolicitudes.solicitarCuit();
		if(Banco.validarUsuario(cuit)){
			String pin = gestorDeSolicitudes.solicitarPin();
			if(Banco.validarPin(pin)){
				usuarioActual = Banco.obtenerUsuario();
				elegirOperacion();
			}else{
				throw new PinInvalidoException();// debe poder repetir acci�n
			}
		}else{
			throw new CuitInvalidoException(); // debe poder repetir acci�n
		}
	}	

	public static Pantalla getPantalla(){
		return pantalla;
	}

	public static Teclado getTeclado() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return teclado;
	}
	
	public void elegirOperacion(){
		pantalla.mostrarMensaje("�Bienvenido!");
		pantalla.mostrarMensaje("�Qu� operaci�n desea realizar?");
		pantalla.mostrarMensaje("1: Depositar | 2: Retirar | 3: Comprar D�lares | 4: Transferir");
		String codigoDeOperacion = gestorDeSolicitudes.solicitarCodigoDeOperaci�n();
		try {
			realizarTransaccion(Byte.parseByte(codigoDeOperacion));
		} catch (NumberFormatException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		} catch (CodigoOperacionInvalidoException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
	}
}
