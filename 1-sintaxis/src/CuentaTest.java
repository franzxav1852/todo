
public class CuentaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta1 = new Cuenta("99999", TipoCuenta.DEBITO);
		
		Cuenta cuenta2 = new Cuenta ("88888");
		
		Cuenta cuenta3 = new Cuenta ();
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);

	}

}
