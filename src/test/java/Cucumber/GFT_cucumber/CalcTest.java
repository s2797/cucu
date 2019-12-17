package Cucumber.GFT_cucumber;

import junit.framework.TestCase;

public class CalcTest extends TestCase {
	Calc cal;

	public void setUp() throws Exception {
		cal=new Calc();
		super.setUp();
	}

	public void tearDown() throws Exception {
		super.tearDown();
		cal=null;
	}
	public void testAdd()
	{
		assertEquals(8,cal.add(3,5));
	}
	public void testMul()
	{
		assertEquals(8,cal.mul(2,4));
	}
	
	
	

}
