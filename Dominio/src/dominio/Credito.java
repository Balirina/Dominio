package dominio;



import java.util.Date;
import java.util.Vector;

public class Credito extends Tarjeta {
	
	protected double mCredito;
	protected Vector mMovimientos;

	/**
	 * Constructor de credito que recibe el numero de cuenta,titular,fecha de caducidad y el credito
	 * @author Aitor
	 * @param numero Parametro con el numero de cuenta
	 * @param titular Parametro con el titular de la cuenta
	 * @param fechaCaducidad Parametro con la fecha de caducidad de la cuenta
	 * @param credito Parametro con el credito de la cuenta
	 */
	public Credito(String numero,String titular,Date fechaCaducidad,double credito)
	{
		super (numero,titular,fechaCaducidad);
		mCredito=credito;
		mMovimientos=new Vector();
	}
	

	/**
	 * Metodo que recibe una cantidad de dinero a retirar, si es menos del credito disponible salta una excepcion
	 * @author Aitor
	 * @param x Parametro con el importe de la retirada
	 * @throws Exception Excepcion en caso de que la retirada de dinero sea mayor que el disponible
	 */
	 
	public void retirar(double x) throws Exception
	{
		Movimiento m=new Movimiento();
		m.setConcepto("Retirada de cajero automatico");
		x=(x*0.05<3.0?3:x*0.05);//Añadimos una comision de un 5%, minimo de 3 euros
		m.setImporte(x);
		mMovimientos.addElement(m);
		if(x>getCreditoDisponible())
			throw new Exception("Credito insuficiente");
	}
	

	/**
	 * Metodo que recibe una cantidad dinero a ingresar y actualiza el movimiento
	 * @author Aitor
	 * @param x Parametro con el dinero a ingresar
	 * @throws Exception Excepcion que se lanza en caso de que la cantidad a ingresar sea menos de 0
	 */
	
	public void ingresar(double x) throws Exception
	{
	
		Movimiento m=new Movimiento();
		m.setConcepto("Ingreso en cuenta asociada(cajero automatico");
		m.setImporte(x);
		mMovimientos.addElement(m);
		mCuentaAsociada.ingresar(x);
	}
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

	/** Metodo que 
	 * @author nerea
	 *
	 */
	
	public void liquidar(int mes, int año)
	{
		Movimiento liq= new Movimiento();
		liq.setConcepto("Liquidacion de operaciones tarj.credito,"+ (mes+1)+ " de" + (año+1900));
		
		double r=0.0;
		for (int i=0;i<this.mMovimientos.size();i++)
		{
			Movimiento m=(Movimiento)mMovimientos.elementAt(i);
			if (m.getFecha().getMonth()+1==mes&& m.getFecha().getYear()+1900==año)
				
					r+=m.getImporte();
			
			}
			liq.setImporte(r);
			if(r!=0)
					mCuentaAsociada.addMovimiento(liq);
			
		}
		

	
}

