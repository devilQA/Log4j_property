package practice.log.testng;

import org.testng.annotations.Test;

public class Class1 {
	@Test
	void test()
	{
		System.out.println("the test 1");
	}

	@Test()
	void test1()
	{
		System.out.println("the test 2");
	}
	@Test
	void test3()
	{
		System.out.println("the test 3");
	}
}
