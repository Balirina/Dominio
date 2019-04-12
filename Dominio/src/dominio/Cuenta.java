package dominio;

import java.util.Vector;

public class Cuenta {

	protected String mNumero;
	protected String mTitular;
	protected Vector mMovimientos;
	
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
	
}
