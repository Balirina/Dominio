package dominio;

import java.util.Date;
import java.util.Vector;

public class Credito {

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
		super(numero,titular,fechaCaducidad);
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

	
}
