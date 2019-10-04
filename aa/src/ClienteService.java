//Programa imprime el rfc de un cliente
import java.util.Date;
import java.text.SimpleDateFormat;

public class ClienteService {

	public static void main(String[] args) {
		ClienteService rfc = new ClienteService();
		rfc.calcularRFC("GERARDO", "GUERRERO", "GOMEZ", new Date());
	}
	
	public void calcularRFC(String nombre, String apaterno, String amaterno, Date fecha) {
		SimpleDateFormat formateador = new SimpleDateFormat("yyMMdd");
		String fechaFormateada = formateador.format(fecha);
		String rfc = apaterno.substring(0,2) + amaterno.substring(0,1) + nombre.substring(0,1) + fechaFormateada;
		System.out.println(rfc);
	}
}
