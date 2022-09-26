package dad.codeSignal;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import dad.codesignal.TheJourneyBegins;

public class AddTest1 {
	
	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		
		assertEquals(3, tjb.add(1, 2));
	}
	
	@Test
	public void test2() {	
		assertEquals(8, tjb.add(10, -2));
		
	}
	
	@Test
	public void test3() {
		assertEquals(5, tjb.add(2, 3));
	}
	
	@Test
	public void test4() {
		assertEquals(18, tjb.centuryFromYear(1701));
	}
	
	@Test
	public void test5() {
		assertEquals(17, tjb.centuryFromYear(1700));
	}
	
	@Test
	public void test6() {
		assertEquals(42, tjb.centuryFromYear(4175));
	}
	
	@Test
	public void test7() {
		assertEquals(false, tjb.palindrome("hola"));
	}
	
	@Test
	public void test8() {
		assertEquals(true, tjb.palindrome("hola aloh"));
	}
	
	
}
