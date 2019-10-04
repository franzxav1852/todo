import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TelefonosServicesGrupal {
	public void leerTelefonos() throws IOException {
		String ruta = "C:\\temp\\telefonos.txt";
		//Abrir archivo
		File archivo = new File(ruta);
		FileReader lector = new FileReader(archivo);
		BufferedReader buffer = new BufferedReader(lector);
		String linea;
		while((linea = buffer.readLine()) != null) {
			String[] contenido = linea.split(",");
			System.out.println(contenido[1]);
		}
	}
	
	public static void main(String []args) throws IOException {
		TelefonosServicesGrupal servicios = new TelefonosServicesGrupal();
		servicios.leerTelefonos();
	}
}
