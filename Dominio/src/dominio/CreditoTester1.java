package dominio;

import java.sql.Date;

import junit.framework.TestCase;

public class CreditoTester1 extends TestCase
{
	Credito tarjeta;
	Cuenta cuenta;

/** Contructor que recibe todos los atributos del  TestCase
 * @author Nerea
 */
     public CreditoTester1(String TestName)
	{
		super (TestName);
	}
	
	
     /** Metodo que crea una nueva cuenta, con el numero cuenta y en nombre de la persona, donde ingresa 1000€,
      * con fecha de hoy, que caduca en 4 años y consigue una nueva tarjeta de credito con 1000€
      * @author Nerea
      * 
      */
	public void setUp()throws Exception
	{
		cuenta= new Cuenta ("0001.0002.12.1234567890", "Fulano de Tal");
		cuenta.ingresar(1000.0);
		Date hoy= new Date();
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
	


}
