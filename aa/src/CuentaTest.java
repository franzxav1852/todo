
public class CuentaTest {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("9999", TipoCuenta.DEBITO);
		
		Cuenta cuenta2 = new Cuenta("8888");
		
		Cuenta cuenta3 = new Cuenta();
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
	}

}
