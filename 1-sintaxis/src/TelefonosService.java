import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TelefonosService {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TelefonosService servicio = new TelefonosService();
		servicio.leerTelefonos();
		

	}
	
	public void leerTelefonos() throws IOException {
		String ruta = "c:/temp/telefonos.txt";
		//abrir archivo
		File archivo = new File(ruta);
		FileReader lector = new FileReader(archivo);
		BufferedReader buffer = new BufferedReader(lector);
		String linea;
		while ((linea = buffer.readLine()) != null) {
			String [] contenido = linea.split(",");
			System.out.println(contenido[1]);;
		
/*		try {
			
			
			File archivo1 = new File ("c:/temp/telefonos.txt");
			FileReader fr = new FileReader (archivo1);
			BufferedReader br = new BufferedReader(fr);
			
	
*/
		}
		
	}
}
//FileReader fr=new FileReader("c:/temp/telefonos.txt");