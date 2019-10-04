import java.text.SimpleDateFormat;
import java.util.Date;

public class ClienteService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteService servicio = new ClienteService();
		servicio.calcularRFC("GERARDO", "GUERRERO", "GOMEZ ", new Date());
		

	}
	
	public void calcularRFC(String nombre, String apaterno, String amaterno, Date fecha) {
		SimpleDateFormat formateador = new SimpleDateFormat("yyMMdd");
		int dia = fecha.getDay();
		String fechaFormateada= formateador.format(fecha);
		String rfc= nombre.substring(0)+  apaterno.substring(0,2)+ amaterno.substring(0,2);
	}
	
		
		
		/*public void calcularRFC() {
	 
	 * BUSCAR TODO EN INGLES  
		
	String nombre;
	String apaterno;
	String amaterno;
	Date fechaNacimiento;
	
	nombre = "GERARDO";
	apaterno = "GUERRERO";
	amaterno = "GOMEZ";
	
	
	static Date fechaNacimiento; 
	System.out.println();
	
	
	
	
	}*/
}
