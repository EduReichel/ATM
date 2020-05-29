import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ModificarArchivos {
	public static void escribirArchivoMovimiento(String fecha, String concepto, double monto) {
		// crea el flujo para escribir en el archivo
		try (FileWriter flwriter = new FileWriter("archivoMovimiento.txt", true)) {
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			bfwriter.write(fecha + "," + concepto + "," + Banco.obtenerUsuario() + "," + monto);
			System.out.println("Archivo creado satisfactoriamente..");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
