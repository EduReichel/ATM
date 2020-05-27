
public class Usuario {
	
	private TarjetaDeDebito tarjeta;
	private String cuit;
	
	public Usuario(String cuit, TarjetaDeDebito tarjeta){
		this.cuit = cuit;
		this.tarjeta = tarjeta;
	}
	
	public String getCuit(){
		return this.cuit;
	}
	
	public TarjetaDeDebito getTarjeta(){
		return this.tarjeta;
	}

}
