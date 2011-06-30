package de.vogella.junit.first;

import org.junit.Test;

import junit.framework.TestCase;

public class MyClassTest extends TestCase {

	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
		assertEquals("Result", 50, tester.multiply(10, 5));
	}
	public void testSubtract(){
		MyClass tester = new MyClass();
		assertEquals("Result", 3, tester.subtract(5,2));
		
	}
}
