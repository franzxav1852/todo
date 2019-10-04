//Patron de diseño Singleton
import java.util.Date;

public class Singleton {
	static Date fechaActual;  //static a nivel de atributo, objeto compartido en toda la JVM
	
	public static void main(String[] args) {
		fechaActual = new Date();
		String fecha = fechaActual.toString();
		
		//Aseguras que siempre existira solamente 1 objeto de tipo fechaActual, si no existe entonces crea un objeto de ella
		if(fechaActual == null) {
			fechaActual = new Date();
		} else {
			System.out.println("Fecha Actual es :" + fechaActual);
		}
	}
}
