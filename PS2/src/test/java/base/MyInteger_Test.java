package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MyInteger integer1 = new MyInteger(3);
		MyInteger integer2 = new MyInteger(8);
				
		assertFalse(integer1.isEven());
		assertTrue(integer2.isEven());
		
		assertTrue(integer1.isOdd());
		assertFalse(integer2.isOdd());
		
		assertTrue(integer1.isPrime());
		assertFalse(integer2.isPrime());
		
		assertTrue(MyInteger.isEven(8));
		assertFalse(MyInteger.isEven(3));
		
		assertTrue(MyInteger.isOdd(3));
		assertFalse(MyInteger.isOdd(8));
		
		assertTrue(MyInteger.isPrime(3));
		assertFalse(MyInteger.isPrime(8));
		
		assertTrue(MyInteger.isEven(integer2));
		assertFalse(MyInteger.isEven(integer1));
		
		assertTrue(MyInteger.isOdd(integer1));
		assertFalse(MyInteger.isOdd(integer2));
		
		assertTrue(MyInteger.isPrime(integer1));
		assertFalse(MyInteger.isPrime(integer2));
		
		assertTrue(integer1.equals(integer1));
		assertFalse(integer1.equals(integer2));
		
		assertEquals(integer1.getiValue(), 3);
	}

}
