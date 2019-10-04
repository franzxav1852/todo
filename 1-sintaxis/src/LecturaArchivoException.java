import java.io.IOException;

public class LecturaArchivoException extends IOException {
	
	//Constructor no se heredan
	public LecturaArchivoException(String mensaje) {
		super(mensaje); //Invocar al constructor de la clase padre
		//Notificar acerca de este error.
	}

}
