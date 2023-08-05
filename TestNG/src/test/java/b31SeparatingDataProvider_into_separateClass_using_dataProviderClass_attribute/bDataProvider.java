package b31SeparatingDataProvider_into_separateClass_using_dataProviderClass_attribute;

import org.testng.annotations.DataProvider;

public class bDataProvider {

	@DataProvider(name = "getTestData")
	public String[][] datasupplier()
	{
		String [][] data = {{"amotooricap1@gmail.com","12345"},
				{"amotooricap3@gmail.com","12345"},
				{"amotooricap12@gmail.com","12345"},
				{"amotooricap13@gmail.com","12345"}};
		
		return data;
	}
	
	
}
