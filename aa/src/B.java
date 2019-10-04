//La clase A tiene un metodo abstracto, hay que usarlo aqui
public class B extends A {

	@Override  //Sobreescritura del metodo, ya existe en A, lo sobreescribimos en las clases hijas
	public void calcularNomina(int numeroEmpleado) {
		System.out.println("Calculando nomina desde la clase B");
	}
	
	@Override  //Anotacion opcional, recomendable
	public void noabstracto() {
		System.out.println("Hola Mundo");
	}
}
