import java.util.Date;

public class Singleton {
	
	// Objeto es compartido en toda la JVM
	static Date fechaActual;
	
	public static void main(String[] args) {
		fechaActual = new Date();
		
		String fecha = fechaActual.toString();
		
		//Asegurar que siempre existiera solamente 1 objeto de ipo fechaActual
		if (fechaActual == null) {
			fechaActual =new Date();
		} else {
			System.out.println("Fecha actual es: " + fechaActual);
		}
	}

}
