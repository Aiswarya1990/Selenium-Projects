package seleninumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
        driver.manage().window().maximize();
        
        String locator=null;
        
        List<WebElement>  column=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
        
        for (int i = 0; i < column.size(); i++)
        	
        {
        	if (column.get(i).getText().equals("Cedric Kelly" )) 
        	{

              locator="//table[@id='dtBasicExample']//tbody//tr[" + (i + 1) + "]//td[6]";
              System.out.println("Locator=" + locator);
              break;
        	}
        }
        
        WebElement salary=driver.findElement(By.xpath(locator));
        String value = salary.getText();
		System.out.println("Salary of Cedric Kelly is " + value);
	}
}

              
  