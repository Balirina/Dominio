package dominio;

public class Debito {

	
	public void ingresar(double x) throws Exception
	{
		this.mCuentaAsociada.retirar("Ingreso en cajero automatico", x);
	}
	
	public void pagoEnEstablecimiento (String datos, double x)throws Exception
	{
		
		this.mCuentaAsociada.retirar("Compra en:"+ datos,x);
	}
	
	public  double getSaldo()
	{
		return mCuentaAsociada.getSaldo();
	}
}
