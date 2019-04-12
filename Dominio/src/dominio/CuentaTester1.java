package dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTester1 {

	
	public CuentaTester1(String sTestName)
	{
		super(sTestName);
	}
	
	public void setUp() throws Exception
	{
		cuenta= new Cuenta("0001.0002.12.1234567890","Fulano de Tal");
	
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
