package a7TestngXML_for_BatchExecution;

import org.testng.annotations.Test;

public class cDemo {
	
	@Test(priority = -2)
	public void methodOne()
	{
		System.out.println("cDemo - MethodOne");
	}
	
	@Test(priority = 0)
	public void methodTwo()
	{
		System.out.println("cDemo - MethodTwo");
	}
	
	@Test(priority = 2)
	public void methodThree()
	{
		System.out.println("cDemo - MethodThree");
	}
	
	@Test
	public void methodFour()
	{
		System.out.println("cDemo - MethodFour");
	}

}
