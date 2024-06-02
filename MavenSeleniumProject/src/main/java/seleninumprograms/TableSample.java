package seleninumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td]"));
		
		//// Iterate through rows and get the first column (Name)
		for (int i = 0; i < rows.size(); i++) 
		{
            WebElement row = rows.get(i);
            
            List<WebElement> firstColumn = row.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
            
            String firstName = firstColumn.get(i).getText();
            
            if(firstName.contains("Tiger"))
            {
            	System.out.println("Name :"+firstName + ",Locator :row"+ (i + 1));
            }
	}
}
}
