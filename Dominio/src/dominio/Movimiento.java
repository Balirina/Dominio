package dominio;

import java.util.Date;

public class Movimiento {
	
	protected String mConcepto;
	protected Date mFecha;
	protected double mImporte;
	
	/**
	 * Contructor por defecto que al atributo fecha le asigna una fecha
	 * @author Aitor
	 */
	public Movimiento()
	{
		mFecha=new Date();
	}
	
	/**
	 * Metodo que devuelve el importe de un movimiento
	 * @author Aitor
	 * @return Devuelve el importe del movimiento
	 */
	public double getImporte()
	{
		return mImporte;
	}



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
