package dominio;

import java.util.Date;

public class Movimiento {

	protected String mConcepto;
	protected Date mFecha;
	protected double mImporte;
	
	/**
	 * @author Balirina
	 */
	public String getConcepto()
	{
		return mConcepto;
	}
	
	/**
	 * @author Balirina
	 */
	public void setConcepto(String newMConcepto)
	{
		mConcepto=newMConcepto;
	}
}
