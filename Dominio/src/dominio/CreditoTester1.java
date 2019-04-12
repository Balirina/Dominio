package dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreditoTester1 {


	public CreditoTester1(StringsTestName)
	{
		super (sTestName);
	}
	
	
	public void setUp()throws Exception
	{
		cuenta= new Cuenta ("0001.0002.12.1234567890", "Fulano de Tal");
		cuenta.ingresar(1000.0);
		Date hoy=new Date();
		long tiempo=Long.parseLong("12096000000");
		Date fecha= new Date(hoy.getTime()+ tiempo);
		tarjeta= new Credito("1234567890123456", "Fulano de Tal",fecha, 1000.0); //100 € de credito
		
		tarjeta.setCuenta(cuenta);
	}
	
	
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
