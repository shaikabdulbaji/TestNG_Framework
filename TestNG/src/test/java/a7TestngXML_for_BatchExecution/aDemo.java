package a7TestngXML_for_BatchExecution;

import org.testng.annotations.Test;

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
