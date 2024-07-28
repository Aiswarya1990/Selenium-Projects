package testNGCommands;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider = "data-provider",dataProviderClass = Priority.class) //name given in dataprovider syntax  is what used to connect dataprovider and testcase
	public void testcase1(int a,int b) {
		int c=a+b;
		System.out.println("Value="+c);
	}
//dataprovider syntax
	/*
@DataProvider (name = "data-provider")
public Object[][] dpMethod(){
	return new Object[][] {{2, 3}, {5, 7},{9,5}};
}
*/
}