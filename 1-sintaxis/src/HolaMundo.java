
public class HolaMundo {
	
	public static void main(String []args) {
		System.out.println("Hola mundo");
		//No puedo acceder metodos no estaticos desde metodos estaticos.
		//calcularNomina(5);
		HolaMundo holaMundo = new HolaMundo();
		holaMundo.calcularNomina(5);
	}
	
	public void calcularNomina(int numeroEmpleado) {
		System.out.println("calculando nomina desde la clase B");
	}
}
