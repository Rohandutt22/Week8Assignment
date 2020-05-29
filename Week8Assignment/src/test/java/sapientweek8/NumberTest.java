package sapientweek8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberTest {

	Number n;
	@Before
	public void setup()
	{
		 n=new Number();
	}
	@Test
	public void testprimeNumber() {
		assertEquals(1,n.checkPrime(11) );
	}
	@Test
	public void testprimeNumberFalse() {
		assertEquals(0,n.checkPrime(10) );
	}
	@Test
	public void testArmstrongNumber() {
		assertTrue(n.checkAmstrong(153));
		
	}
	@Test
	public void testArmstrongNumberFalse() {
		assertFalse(n.checkAmstrong(11));
	}
	@Test
	public void testpalindrome() {
		assertTrue(n.CheckPolindrom(11) );
		
	}
	@Test
	public void testpalindromeFalse() {
		assertFalse(n.CheckPolindrom(10) );
		
	}
	@Test(expected = AssertionError.class)
	public void testnonFunctional() {
		assertTrue(n.CheckPolindrom(-1));

	}
	
	
}
