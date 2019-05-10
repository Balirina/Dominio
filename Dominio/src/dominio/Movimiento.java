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
	
	/** Metodo que te devuelve la fecha en la que se han  realizado movimientos
	 * author Nerea
	 * @return Devuelve la fecha en la que has realizado el movimiento
	 */
	public Date getFecha()
	{
		return mFecha;
	}
	/** Metodo que inserta una nueva fecha cuando haces cualquier movimiento
	 * author  Nerea
	 */
	
	public void setFecha(Date newMFecha)
	{
		mFecha= newMFecha;
	}
	/** Metodo que inserta un nuevo importe de los movimientos que se realizan
	 * author Nerea
	 */
	
	public void setImporte(double newMImporte)
	{
		mImporte= newMImporte;
	}
}
