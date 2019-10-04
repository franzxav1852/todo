
public class B extends A{

	@Override
	public void calcularNomina(int numeroEmpleado) {
		// TODO Auto-generated method stub
		System.out.println("Calculando nomina desde la clase B");
	}

	@Override // anotacion opcional 
	public void noabstracto() {
		System.out.println("Hola Mundo");
	}

}
