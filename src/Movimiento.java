public class Movimiento implements ActualizarArchivos {

	// fechaString es la Date fecha escrita de manera que se pueda imprimir
	private String concepto;
	private String fechaString;
	private double monto;

	public Movimiento(String concepto, double monto) {
		this.concepto = concepto;
		this.fechaString = java.time.LocalDate.now().toString();
		this.monto = monto;
		actualizarMovimientos();
	}

	public String getFecha() {
		return fechaString;
	}

	public String getConcepto () {
		return this.concepto;
	}

	@Override
	public void actualizarMovimientos() {
		ModificarArchivos.escribirArchivoMovimiento(this.fechaString, this.concepto, this.monto);
	}
}
