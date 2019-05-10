package dominio;

import java.util.Vector;

import java.util.Date;


	public class Debito extends Tarjeta{
	
	/**
	 * Contructor que recibe el numero de cuenta,el titular y la fecha de caducidad
	 * @author Aitor
	 * @param numero Variable con el numero de cuenta
	 * @param titular Variable con el titular de la cuenta
	 * @param fechaCaducidad Variable con la fecha de caducidad de la cuenta
	 */
	public Debito(String numero,String titular,Date fechaCaducidad)
	{
		super(numero,titular,fechaCaducidad);
	}

	/**
	 * 	 * Metodo para retirar dinero de la cuenta 
	 * guarda tambien una informacion del dicho movimiento
	 * @param la cantidad de dinero
	 * @author Balirina
	 */
	public void retirar(double x) throws Exception
	{
		this.mCuentaAsociada.retirar("Retirada en cajero automatico",x);

	}
	/** Metodo que ingresa el dinero en la cuenta asociada a la tarjeta
	 * @uthor Nerea
	 * @param x Parametro con el dinero que se ingresa
	 * @throws Exception que se realiza si no se ingresa ninguna cantidad a la cuenta
	 */
	
	public void ingresar(double x) throws Exception
	{
		this.mCuentaAsociada.retirar("Ingreso en cajero automatico", x);
	}
	
	/**Metodo que realiza el nombre del establecimiento
	 * @author Nerea
	 * @param x Parametro del nombre de los establecimientos en los que pagas
	 * @throws Excepcion que se realiza si no se realiza ningun pago en establecimiento
	 */
	public void pagoEnEstablecimiento (String datos, double x)throws Exception
	{
		
		this.mCuentaAsociada.retirar("Compra en:"+ datos,x);
	}
	
	/**Metodo que devuelven el saldo de la tarjeta de debito
	 * @author Nerea
	 */
	public  double getSaldo()
	{
		return mCuentaAsociada.getSaldo();
	}
}
