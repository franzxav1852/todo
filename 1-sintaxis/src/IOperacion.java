/*
 * Interfase solo permite definir los metodos no implementarlos.
 * No se puede instanciar (no se puede usar el operador new).
 */
public interface IOperacion {
	
	public double sumar(double x, double y);
	public double restar(double x, double y);
	public double multiplicar(double x, double y);
	public double dividir(double x, double y);
}
