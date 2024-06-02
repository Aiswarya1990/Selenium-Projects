package seleninumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();

		List<WebElement> firstRow=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td")); ////to find row xpath give tr value
		
	for(int i=0;i<firstRow.size();i++) 
	{
		String text=firstRow.get(i).getText();
		System.out.println(text);
		
		
	}
List<WebElement> firstcolumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));//to find column xpath give td value

for(int j=0;j<firstcolumn.size();j++) 
{
	String value=firstcolumn.get(j).getText();
	System.out.println(value);
	
}

}
}
