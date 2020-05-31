
public class DispensadorDeEfectivo {

	private int[] billetesPorEntregar;
	private int cantidadBilletesCienAtm;
	private int cantidadBilletesQuinientosAtm;
	private int cantidadBilletesMilAtm;
	private int montoActual;


	public DispensadorDeEfectivo(int cantidadBilletesCienAtm, int cantidadBilletesQuinientosAtm, int cantidadBilletesMilAtm) {
		this.billetesPorEntregar = new int[3];
		this.cantidadBilletesCienAtm = cantidadBilletesCienAtm;
		this.cantidadBilletesQuinientosAtm = cantidadBilletesQuinientosAtm;
		this.cantidadBilletesMilAtm = cantidadBilletesMilAtm;
		this.montoActual = 0;

	}

	public int[] entregarBilletes(int montoAEntregar) {
		// TODO Apéndice de método generado automáticamente
		billetesPorEntregar[0] = cantidadBilletesMil(montoAEntregar);
		int restoSinMil = montoAEntregar - (billetesPorEntregar[0] * 1000);
		billetesPorEntregar[1] = cantidadBilletesQuinientos(restoSinMil);
		int restoSinQuinientos = restoSinMil - (billetesPorEntregar[1] * 500);
		billetesPorEntregar[2] = cantidadBilletesCien(restoSinQuinientos);

		actualizarBilletesAtm(billetesPorEntregar);

		return billetesPorEntregar;
	}

	private void actualizarBilletesAtm(int[] billetesPorEntregar) {
		// TODO Apéndice de método generado automáticamente
		setCantidadBilletesMilAtm(getCantidadBilletesMilAtm() - billetesPorEntregar[2]);
		setCantidadBilletesQuinientosAtm(getCantidadBilletesQuinientosAtm() - billetesPorEntregar[1]);
		setCantidadBilletesCienAtm(getCantidadBilletesCienAtm() - billetesPorEntregar[0]);
	}

	private int cantidadBilletesMil(int monto) { // 1500
		int cantidadBilletesMilEntregar=0;
		if (monto >= 1000) {
			cantidadBilletesMilEntregar = monto / 1000;
			if (cantidadBilletesMilEntregar < getCantidadBilletesMilAtm()) {
				this.montoActual = monto - (cantidadBilletesMilEntregar * 1000);
			}else {
				cantidadBilletesMilEntregar = getCantidadBilletesMilAtm();
				this.montoActual = monto - (cantidadBilletesMilEntregar * 1000);
			}
		}
		return cantidadBilletesMilEntregar;	
		}

	private int cantidadBilletesQuinientos(int monto) {
		int cantidadBilletesQuinientosEntregar=0;
		if (monto >= 500) {
			cantidadBilletesQuinientosEntregar = monto / 1000;
			if (cantidadBilletesQuinientosEntregar < getCantidadBilletesQuinientosAtm()) {
				this.montoActual = monto - (cantidadBilletesQuinientosEntregar * 1000);
			}else {
				cantidadBilletesQuinientosEntregar = getCantidadBilletesQuinientosAtm();
				this.montoActual = monto - (cantidadBilletesQuinientosEntregar * 1000);
			}
		}
		return cantidadBilletesQuinientosEntregar;	
		}

	private int cantidadBilletesCien(int monto) {
		int cantidadBilletesCienEntregar=0;
		if (monto >= 100) {
			cantidadBilletesCienEntregar = monto / 1000;
			if (cantidadBilletesCienEntregar < getCantidadBilletesCienAtm()) {
				this.montoActual = monto - (cantidadBilletesCienEntregar * 1000);
			}else {
				cantidadBilletesCienEntregar = getCantidadBilletesCienAtm();
				this.montoActual = monto - (cantidadBilletesCienEntregar * 1000);
			}
		}
		return cantidadBilletesCienEntregar;	
		}

	// GETTER y SETTER
	public int getCantidadBilletesCienAtm() {
		return cantidadBilletesCienAtm;
	}

	public void setCantidadBilletesCienAtm(int cantidadBilletesCienAtm) {
		this.cantidadBilletesCienAtm = cantidadBilletesCienAtm;
	}

	public int getCantidadBilletesQuinientosAtm() {
		return cantidadBilletesQuinientosAtm;
	}

	public void setCantidadBilletesQuinientosAtm(int cantidadBilletesQuinientosAtm) {
		this.cantidadBilletesQuinientosAtm = cantidadBilletesQuinientosAtm;
	}

	public int getCantidadBilletesMilAtm() {
		return cantidadBilletesMilAtm;
	}

	public void setCantidadBilletesMilAtm(int cantidadBilletesMilAtm) {
		this.cantidadBilletesMilAtm = cantidadBilletesMilAtm;
	}

}
