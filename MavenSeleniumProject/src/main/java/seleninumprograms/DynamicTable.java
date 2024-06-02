package seleninumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Get the salary value of "Garrett Winters" dynamically & print it.2nd row & 3rd column)
public class DynamicTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		

		String locator = null;
		// identifying unique column
        List<WebElement> column = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));

     // Iterating it
		for (int i = 0; i < column.size(); i++) 
		{
			if (column.get(i).getText().equals("Garrett Winters")) {
				locator = "//table[@id='dtBasicExample']//tbody//tr[" + (i + 1) + "]//td[3]";
				System.out.println("Locator=" + locator);
				break;

			}
		}
		WebElement location = driver.findElement(By.xpath(locator));
		String text = location.getText();
		System.out.println("Location of Garrett Winters is " + text);

	}
}
