package testClasses;

import testing.Assert;
import java.util.ArrayList;
import testing.AssertionException;
import testing.SuiteException;
import testing.SuperTest;
import testing.Test;

public class TestSumaOperation extends Test{
	
	public TestSumaOperation(String name) {
		super(name);
	}

	protected TestSumaOperation createNewTest(String testName) {
		TestSumaOperation test = new TestSumaOperation(testName);
		return test;
	}

	public void test() throws AssertionException {
		Operation operation = new Operation();
		int resultado = operation.suma(5,5);
		Assert.assertTrue(resultado == 10);
	}

}
