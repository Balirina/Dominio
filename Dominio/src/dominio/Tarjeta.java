package dominio;


import java.util.Date;

/**
 * Clase abstracta para crear una tarjeta
 * las clases hijas tienem que emplementar todos los metodos
 * @author Win10_Irina_2018
 *
 */
public abstract class Tarjeta {
	protected String mNumero, mTitular;
	protected Date mFechaDeCaducidad;
	protected Cuenta mCuentaAsociada;
	
	/**Contructor que recibe el numero, el titular y la fecha de la caducidad de la tarjeta
	 * @author Nerea
	 * @param numero de la tarjeta
	 * @param titular de la tarjeta
	 * @param fechaCaducidad de la tarjeta
	 */
	public Tarjeta (String numero, String titular, Date fechaCaducidad)
	{
		mNumero= numero;
		mTitular=titular;
		mFechaDeCaducidad=fechaCaducidad;
	}
	
	/**
	 * Metodo que sobreescribe la cuenta asociada a esta tarjeta
	 * @param nueva cuenta
	 * @author Balirina
	 */
	public void setCuenta(Cuenta c)
	{
		mCuentaAsociada=c;
	}
	
	/**
	 * Metodo que recibe una cantidad de dinero y la retira de la cuenta
	 * @author Aitor
	 * @param x Variable con la cantidad a retirar
	 * @throws Exception
	 */
	public abstract void retirar(double x) throws Exception;
	/**
	 * Metodo que recibe una cantidad de dinero y la ingresa
	 * @author Aitor
	 * @param x Variable con el dinero a ingresar
	 * @throws Exception
	 */
	public abstract void ingresar(double x) throws Exception;
	/**
	 * Metodo que recibe el nombre del establecimiento y realiza un pago
	 * @author Aitor
	 * @param datos Variable con los datos del establecimiento
	 * @param x Variable con el dinero a pagar
	 * @throws Exception
	 */
	public abstract void pagoEnEstablecimiento(String datos,double x) throws Exception;
	/**
	 * Metodo que devuelve el saldo de la cuenta
	 * @author Aitor
	 * @return Devuelve el saldo de la cuenta
	 */
	public abstract double getSaldo();

	
	
	
	

}
