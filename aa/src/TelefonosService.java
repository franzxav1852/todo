import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TelefonosService {

	public static void main(String[] args) {
		TelefonosService telefonos = new TelefonosService();
		telefonos.leerTelefonos();
	}
	
	public void leerTelefonos() {
		try {
			BufferedReader objReader = new BufferedReader(new FileReader("C:\\temp\\telefonos.txt"));
				
			String strCurrentLine;
			
			while ((strCurrentLine = objReader.readLine()) != null) {

			    //System.out.println(strCurrentLine);
			    String[] arrStr = strCurrentLine.split(",");
				System.out.println(arrStr[1]);
			   }
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
