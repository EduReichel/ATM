public class DispensadorDeEfectivo implements ActualizarBilletes {

	private int[] cantidadDeTipoDeBilletes;
	private int totalDeBilletes;
	private int[] vectorBase = {100,500,1000};

	public void entregarBilletes(short monto) {
		int i = this.vectorBase.length-1;
		while(monto < this.vectorBase[i] && monto < 0){
			monto -= this.vectorBase[i];
			this.cantidadDeTipoDeBilletes[i]-=1;
			}
	}

	public void setCantidadDeTipoDeBilletes(int[] cantidadPorTipo) {
		for (int iteracion : cantidadPorTipo) {
			this.cantidadDeTipoDeBilletes[iteracion] += cantidadPorTipo[iteracion];
		}
		
		for(int iteracion : this.cantidadDeTipoDeBilletes) {
			this.totalDeBilletes += this.cantidadDeTipoDeBilletes[iteracion];
		}
	}

	public int getTotalDeBilletes() {
		return this.totalDeBilletes;
	}

	public int[] getCantidadDeTipoDeBilletes() {
		return this.cantidadDeTipoDeBilletes;
	}

	@Override
	public void actualizarCantidadPorTipo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarTotal() {
		// TODO Auto-generated method stub

	}
}
