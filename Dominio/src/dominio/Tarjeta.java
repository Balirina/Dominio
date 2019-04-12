package dominio;

import java.util.Date;

public abstract class Tarjeta {

	protected String mNumero, mTitular;
	protected Date mFechaDeCaducidad;
	protected Cuenta mCuentaAsociada;
	
	
	/**
	 * @author Balirina
	 */
	public void detCuenta(Cuenta c)
	{
		mCuentaAsociada=c;
	}
}
