package dominio;

public class Credito {

public void liquidar(int mes, int a�o)
{
	Movimiento liq= new Movimiento();
	liq.setConcepto("Liquidacion de operaciones tarj.credito,"+ (mes+1)+ " de" + (a�o+1900));
	
	double r=0.0;
	for (int i;i<this.mMovimientos.size();i++)
	{
		Movimiento m=(Movimiento)mMovimientos.elementAt(i);
		if (m.getFecha().getMonth()+1==mes&& m.getFecha().getYear()+1900==a�o)
			
				r+=m.getImporte();
		
		}
		liq.setImporte(r);
		if(r!=0)
				mCuentaAsociada.addMovimiento(liq);
		
	}
	
	
	
}

