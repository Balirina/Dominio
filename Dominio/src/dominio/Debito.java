package dominio;

import java.util.Vector;

public class Debito extends Tarjeta{

	/**
	 * @author Balirina
	 */
	public void retirar(double x) throws Exception
	{
		this.mCuentaAsociada.retirar("Retirada en cajero automatico",x);
	}
}
