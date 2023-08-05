package a6UsingPriorityInTestNG;

import org.testng.annotations.Test;

/*
 * If you not give priority keyword it was execute according to alphabetical order.
 * If you give priority keyword it was execute according to numbering (or) priority.
 * If you give negative priority also, it was execute according to numbering only.
 */


public class aDemo {
	
	@Test(priority = 1)
	public void sampleOne()
	{
		System.out.println("SampleOne Test Method");
	}
	
	@Test
	public void sampleTwo()
	{
		System.out.println("SampleTwo Test Method");
	}
	
	@Test(priority = 0)
	public void sampleThree()
	{
		System.out.println("SampleThree Test Method");
	}
	
	@Test(priority = 4)
	public void sampleFour()
	{
		System.out.println("SampleFour Test Method");
	}
	
	@Test(priority = -2)
	public void sampleFive()
	{
		System.out.println("SampleFive Test Method");
	}

}
