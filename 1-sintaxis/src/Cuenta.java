import java.util.Random;

//Javabean, POJO, Valueobjects, modelo o entities
public class Cuenta {
	
	//private solo se puede acceder a los atributos desde la misma clase.
	private String numero;
	private TipoCuenta tipoCuenta;
	private double saldo;
	
	public Cuenta() {
		this.saldo = 200.0;
		this.numero = new Random(9999).nextDouble() +"";
		this.tipoCuenta = TipoCuenta.DEBITO;
	}
		public Cuenta(String numero) {

		
		this.saldo = 100.0;
		this.numero = numero;
		this.tipoCuenta = TipoCuenta.DEBITO;
		}
	//Constructor, no tiene tipo de retorno y se debe llamar igual que la clase 
	
	public Cuenta(String numero, TipoCuenta tipocuenta) {
		//Inicializar los stributos de la clase
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
	
	public void setTipoCuenta(TipoCuenta tipoCuenta ) {
		this.tipoCuenta = tipoCuenta;
	}
	
	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
