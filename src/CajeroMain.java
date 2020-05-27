
public class CajeroMain {

	public static void main(String[] args) throws CuitInvalidoException, PinInvalidoException {
		
		//Creo Atm
		Atm cajero = new Atm();
		
		//Iniciar el cajero
		cajero.iniciar();
		
		//Ingresar Tarjeta
		cajero.ingresoDeTarjeta();
	}

}
