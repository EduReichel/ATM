
public abstract class Transaccion {
	
	//Atributo
	private int monto;
	
	//Constructor
	public Transaccion(int monto){
		this.monto = monto;
	}
	
	//M�todos	
	public abstract void realizar();

	public abstract boolean comprobarSaldo(byte tipoCuenta);
	
	public int getMonto(){
		return monto;
	}
}
