package dominio;

import java.sql.Date;

import junit.framework.TestCase;

/**
 * Pruebas de la clase Credito
 * @author Win10_Irina_2018
 *
 */
public class CreditoTester1 extends TestCase
{
	Credito tarjeta;
	Cuenta cuenta;

/** Contructor que recibe TestName
 * @author Nerea
 */
     public CreditoTester1(String TestName)
	{
		super (TestName);
	}
	
	
     /**
      * @author Nerea
      * t
      */
	public void setUp()throws Exception
	{
		cuenta= new Cuenta ("0001.0002.12.1234567890", "Fulano de Tal");
		cuenta.ingresar(1000.0);
		Date hoy= new Date(20);
		long tiempo= Long.parseLong("12096000000");
		Date fecha= new Date(hoy.getTime()+ tiempo);// Caduca en 4 años
		tarjeta= new Credito ("1234567890123456", "Fulano de Tal",fecha,1000.0); // 1000€ de credito
		
		tarjeta.setCuenta(cuenta);
	}
	
	

	/**
	 * @author Balirina
	 */
	public void tearDown() throws Exception
	{
		

	}
	
	/**
	 * @author Balirina
	 */
	public void testIngresar500()
	{
		
	}
	
	/**
	 * Test del metodo retirar300
	 * @author Aitor
	 */
	public void testRetirar300()
	{
		
	}
	
	/**
	 * Test del metodo Liquidar
	 * @author Aitor
	 */
	public void testLiquidar()
	{
		
	}

	public static void main(String[] args) {
		
		junit.swingui.TestRunner.run(CreditoTester1.class);
		
	}

}
