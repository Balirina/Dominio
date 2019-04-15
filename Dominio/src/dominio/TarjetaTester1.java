package dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TarjetaTester1 extends TestCase 
{
	
	public TarjetaTester1(String sTestName)
	{
		super(sTestName);
	}
	
   public abstract Tarjeta getTarjetaObtenida();
   
   public abstract Tarjeta prepararTarjetaEsperada();
   
   public void testRetirar100()
   {
	   
   }
	

	

}
