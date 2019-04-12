package dominio;


import java.util.Vector;
=======
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

public class Debito extends Tarjeta{

	/**
	 * @author Balirina
	 */
	public void retirar(double x) throws Exception
	{
		this.mCuentaAsociada.retirar("Retirada en cajero automatico",x);
	}
}
