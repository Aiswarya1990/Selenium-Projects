package testNGCommands;

import org.testng.annotations.Test;

public class BasicCommands {
	@Test // basic test annotation-which is equivalent to main method -which should be
			// added  above all testcases
	public void testCase1() {
		System.out.println("TestCase1 Executed");
	}

	@Test

	public void testcase2() {
		System.out.println("TestCase2 Executed");
	}

	//@Test
	public void testcase3() {
		System.out.println("TestCase3 Executed");
	}
}
