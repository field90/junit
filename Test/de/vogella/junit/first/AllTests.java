package de.vogella.junit.first;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for de.vogella.junit.first");
		//$JUnit-BEGIN$
		suite.addTestSuite(MyClassTest.class);
		//$JUnit-END$
		return suite;
	}

}
