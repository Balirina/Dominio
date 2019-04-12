package dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TarjetaTester1 extends TestCase {
	
	public TarjetaTester1(String sTestName)
	{
		super(sTestName);
	}
	
   public abstract Tarjeta getTarjetaObtenida();
   
   public abastract Tarjeta prepararTarjetaEsperada();
   
   public void testRetirar100()
   {
	   
   }
	

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
