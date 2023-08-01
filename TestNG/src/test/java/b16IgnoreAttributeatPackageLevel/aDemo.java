package b16IgnoreAttributeatPackageLevel;

import org.testng.annotations.Test;

/*
 * if you want not to run the tests(any no.of tests) which are under particular package go to that 
   package and right click on that package and create package, while creating please click on check 
   box "package-info.java" and after creating open that class and put "@Ignore" on above package.
 */


public class aDemo {
	
	@Test(priority = 1)
	public void methodOne()
	{
		System.out.println("aDemo - MethodOne");
	}
	
	@Test(priority = 2)
	public void methodTwo()
	{
		System.out.println("aDemo - MethodTwo");
	}
	
	@Test(priority = 0)
	public void methodThree()
	{
		System.out.println("aDemo - MethodThree");
	}
	
	@Test(priority = -3)
	public void methodFour()
	{
		System.out.println("aDemo - MethodFour");
	}

}
