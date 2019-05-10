package dominio;


import java.util.Date;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class DebitoTester1  extends TestCase{

	Debito debito;
	Cuenta cuenta;
	
	
	/**
	 * @author Balirina
	 */
	public DebitoTester1(String sTestName)
	{
		super(sTestName);
	}
	
	/**
	 * @author Balirina
	 */
	public void setUp() throws Exception
	{
		cuenta=new Cuenta("0001.0002.12.1234567890", "Fulano del Tal");
		cuenta.ingresar(1000.0);
		Date hoy =new Date();
		long tiempo=Long.parseLong("12096000000");
		Date fecha=new Date(hoy.getTime()+tiempo);  //Caduca cada 4 años
		debito=new Debito("1234567890123456", "Fulano de Tal", fecha);
		debito.setCuenta(cuenta);
		
	}
	
	/**
	 * 
	 * @author Aitor
	 */
	public void tearDown() throws Exception
	{
		
	}
	
	/**
	 * Test del metodo retirar1000
	 * @author Aitor
	 */
	public void testRetirar1000()
	{
		
	}
	
	public static void main(String[] args) {
		
		junit.swingui.TestRunner.run(DebitoTester1.class);
	}

}
