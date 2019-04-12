package dominio;

import java.util.Vector;

public class Credito {
	protected double mCredito;
	protected Vector mMovimientos;
	
	/**
	 * @author Balirina
	 */
	public void pagoEnEstablecimiento(String datos, double x) throws Exception
	{
		Movimiento m=new Movimiento();
		m.setConcepto("Compra a credito en: "+datos);
		m.setImporte(x);
		mMovimientos.addElement(m);
	}
	
	/**
	 * @author Balirina
	 */
	public double getSaldo()
	{
		double r=0.0;
		for (int i=0; i<this.mMovimientos.size(); i++)
		{
			Movimiento m=(Movimiento) mMovimientos.elementAt(i);
			r+=m.getImporte();
		}
		return r;
	}
	
	/**
	 * @author Balirina
	 */
	public double getCreditoDisponible()
	{
		return mCredito-getSaldo();
	}
}
