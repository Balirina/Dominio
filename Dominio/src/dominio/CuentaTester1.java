package dominio;


import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class CuentaTester1 extends TestCase 
{
	Cuenta cuenta;
	

	/**Metodo que procede de TestCase que 
	 * @author Nerea
	 */
	public CuentaTester1(String TestName)
	{
		super(TestName);
	}
	
	/** Metodo que crea una nueva cuenta con el numero de cuenta y el nombre de la persona
	 * @author Nerea
	 * @throws Exception que se realiza si no se crea una nueva cuenta
	 */
	
	public void setUp() throws Exception
	{
		cuenta= new Cuenta("0001.0002.12.1234567890","Fulano de Tal");
	
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
	public void testIngresar1000()
	{
		
	}
	
	/**
	 * @author Balirina
	 */
	public void testRetirar1000()
	{
		

	}

}
