
public class CodigoOperacionInvalidoException extends Exception {
	
	private String tipo;
	private String causa;
	
	public CodigoOperacionInvalidoException(String tipo, String causa){
		this.tipo = tipo;
		this.causa = causa;
	}
	
	@Override
	public String toString(){
		return "Error de " + this.tipo + ". Causado por: " + this.causa;
	}
}
