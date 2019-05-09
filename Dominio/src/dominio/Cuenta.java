package dominio;
import java.util.Vector;
	

public class Cuenta {
	
	protected String mNumero;
	protected String mTitular;
	protected Vector mMovimientos;
	
	/**
	 * Contructor que recibe dos parametros y los almacena en los atributos de la clase
	 * @author Aitor
	 * @param numero Parametro con el numero de cuenta
	 * @param titular Parametro con el titular de la cuenta
	 */
	public Cuenta(String numero,String titular)
	{
		mNumero=numero;
		mTitular=titular;
		mMovimientos=new Vector();
	}
	
	/**
	 * Metodo que recibe una cantidad dinero a ingresar y actualiza el movimiento
	 * @author Aitor
	 * @param x Parametro con el dinero a ingresar
	 * @throws Exception Excepcion que se lanza en caso de que la cantidad a ingresar sea menos de 0
	 */
	public void ingresar(double x) throws Exception
	{
		if(x<=0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		Movimiento m=new Movimiento();
		m.setConcepto("Ingreso en efectivo");
		m.setImporte(x);
		this.mMovimientos.addElement(m);
	}

	
	/**
	 * @author Balirina
	 */
	public void retirar(double x) throws Exception
	{
		if(x<=0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if(getSaldo()<x)
			throw new Exception("Saldo insuficiente");
		Movimiento m=new Movimiento();
		m.setConcepto("Retirada en efectivo");
		m.setImporte(-x);
		this.mMovimientos.addElement(m);
	}
	
	/**
	 * @author Balirina
	 */
	public void ingresar(String concepto, double x) throws Exception
	{
		if(x<=0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		Movimiento m=new Movimiento();
		m.setConcepto(concepto);
		m.setImporte(x);
		this.mMovimientos.addElement(m);
	}
	
	/**
	 * @author Balirina
	 */
	public void retirar(String concepto, double x) throws Exception
	{
		if(x<=0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		if(getSaldo()<x)
			throw new Exception("Saldo insuficiente");
		Movimiento m=new Movimiento();
		m.setConcepto(concepto);
		m.setImporte(-x);
		this.mMovimientos.addElement(m);
	}
	
	/**
	 * Metodo devuelve el saldo de la cuenta
	 * @param r 
	 * @author Nerea
	 */
	public double getSaldo()
	{
		double r=0.0;
		for (int i=0;i<this.mMovimientos.size();i++)
		{
			Movimiento m=(Movimiento) mMovimientos.elementAt(i);
			r+=m.getImporte();
			
		}
		return r;
	}
	
	/**Metodo que añade los movimientos que se realizan en la cuenta
	 * @param m
	 * @author Nerea
	 */
	public void addMovimiento(Movimiento m)
	{
		mMovimientos.addElement(m);
	}
	
}
