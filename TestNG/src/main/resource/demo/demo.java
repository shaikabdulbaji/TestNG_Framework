package demo;

import java.util.Date;

public class demo {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date.toString());
		
		System.out.println("-------------------------");
		
		System.out.println("After Replacing Gaps With _ ");
		System.out.println(date.toString().replace(" ", "_"));
		
		System.out.println("-------------------------");
		
		System.out.println("After Replacing Gaps With : ");
		System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
		
		
		System.out.println("-------------------------");
		
	}

}