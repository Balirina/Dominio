package dominio;

public class Cuenta {
	
	
	
	public double getSaldo()
	{
		double r=0.0;
		for (int i;i<this.mMovimientos.size();i++)
		{
			Movimiento m=(Movimiento) mMovimientos.elementAt(i);
			r+=m.getImporte();
			
		}
		return r;
	}

	
	public void addMovimiento(Movimiento m)
	{
		mMovimientos.addElement(m);
	}
}
