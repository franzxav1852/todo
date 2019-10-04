import java.util.Random;

//Javabean, POJO, Value Obbjects, modelo o entities.
public class Cuenta {
	//private solo se puede acceder a los atributos desde la propia clase
	
	private String numero;
	private TipoCuenta tipoCuenta;
	private double saldo;
	
	public Cuenta() {
		this.saldo = 200.0;
		this.numero = new Random(9999).nextDouble() + "";
		this.tipoCuenta = TipoCuenta.DEBITO;
	}
	
	public Cuenta(String numero) {
		this.saldo = 100.0;
		this.numero = numero;
		this.tipoCuenta = TipoCuenta.DEBITO;  //Por default será una cuenta de debito
	}
	
	//Constructor, no tiene tipo de retorno y se debe llamar igual que la clase
	public Cuenta(String numero, TipoCuenta tipoCuenta) {
		//Inicializar los atributos de la clase
		this.saldo = 50.0;
		this.numero = numero;
		this.tipoCuenta = tipoCuenta;
	}
	
	
	
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo + "]";
	}

	public String getNumero() {
		return numero;
	}
	
	//Siempre tipo void los metodos set
	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
