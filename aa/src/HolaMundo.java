
public class HolaMundo {
	public static void main(String [] args) {
		System.out.println("Hola mundo");
		
		//No puedo acceder a metodos no estaticos desde metodos estaticos hay que crear un objeto
		//calcularNomina(5);
		HolaMundo hola = new HolaMundo();
		
		hola.calcularNomina(5);  //Invocamos al metodo
		
	}
	
	public void calcularNomina(int numeroEmpleado) {
		System.out.println("Calculando nomina desde la clase B");
	}
}