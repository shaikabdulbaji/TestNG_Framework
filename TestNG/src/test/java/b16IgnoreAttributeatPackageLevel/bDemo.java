package b16IgnoreAttributeatPackageLevel;

import org.testng.annotations.Test;

public class bDemo {
	
	@Test(priority = 1)
	public void methodOne()
	{
		System.out.println("bDemo - MethodOne");
	}
	
	@Test(priority = 2)
	public void methodTwo()
	{
		System.out.println("bDemo - MethodTwo");
	}
	
	@Test(priority = 0)
	public void methodThree()
	{
		System.out.println("bDemo - MethodThree");
	}
	
}
