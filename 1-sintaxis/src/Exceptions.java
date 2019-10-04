import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Excepcion es un posible error en Java.
 * @author Dell5458
 *
 */
public class Exceptions {
	public static void main(String[] args) {
		try {
			metodo1();
		} catch (FileNotFoundException e ) {
			
			System.err.println("Ocurrio un error intenta nuevamente:" + e.getMessage());
			
		} catch (LecturaArchivoException e)  {
			
		}
		
		finally {
			System.out.println("Cerrando sesion del sitema");
		}
		
		
	}
	
	public static void metodo1()  throws FileNotFoundException, LecturaArchivoException {
		//Excepciones: Checked(compilación) and Unchecked (ejecución)
		//Unchecked, runtime exception
		try {
			int division = 5 / 0;
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Continua programa...");
		
		//Checked, estoy obligado a atrapar la exepcion
		File archivo = new File("c:/temp/archivo.txt");
		//try.... catch, cuando manejo el error y no afecta la operación del sistema.
		//throws, lanza el error a quien mando a llamrte.
		FileReader reader = new FileReader(archivo);
		
		BufferedReader buffer = new BufferedReader(reader);
		try {
			String linea = buffer.readLine();
		} catch (IOException e) {
			throw new LecturaArchivoException(e.getMessage());
			
		}
	}
	
}
