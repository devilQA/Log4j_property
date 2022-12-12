package practice.log.testng;

import org.testng.annotations.Test;

public class Class2 {

	@Test
	void test()
	{
		System.out.println("the class2 test 1");
	}
	@Test
	void test1()
	{
		System.err.println("the class2 test 2");
	}
	@Test
	void test2()
	{
		System.out.println("the class2 test3");
	}
}
