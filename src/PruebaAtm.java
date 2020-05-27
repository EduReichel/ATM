import java.io.ByteArrayOutputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PruebaAtm {
	
	private	Atm cajero = new Atm();
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	//1er crear ATM 
	@Test
	public void crearAtm(){
		 new Atm();
	}
	
	//2da iniciar ATM
	@Test
	public void metodoIniciarAtm(){
		cajero.iniciar();
	}
	
	//3ra finalizar ATM
	@Test
	public void metodoFinalizarAtm(){
		cajero.finalizar();
	}
	
	//4ta realizar Transaccion
	//Codigo de Operacion= 1:deposito 2:retiro 3:compraDeDolares 4:Transferencia
	
	@Test
	public void metodoRealizarTransaccion() throws CodigoOperacionInvalidoException{
		boolean transaccionOk = cajero.realizarTransaccion((byte) 1);
		Assert.assertEquals(true,transaccionOk);
	}
	
	//5ta agregar u codigo de operacion no valido
	@Test(expected = CodigoOperacionInvalidoException.class)
	public void transaccionConCodigoInvalido() throws CodigoOperacionInvalidoException{
		cajero.realizarTransaccion((byte) 5);	
	}
	
	//6ta Mensaje de inicio del Atm
	/*@Test
	public void mensajeDeInicioDeAtm(){
		cajero.iniciar();		
		Assert.assertEquals("El cajero esta operativo. Por favor, ingrese su tarjeta seguido de la clave",outContent.toString());
	}*/
	
	
}
