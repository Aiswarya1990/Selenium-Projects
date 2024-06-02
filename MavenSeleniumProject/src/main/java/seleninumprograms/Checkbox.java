package seleninumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//open browser
		driver.get("https://selenium.qabible.in/check-box-demo.php");//hit the url
		driver.manage().window().maximize();//maximize the window
		
		WebElement checkBox1=driver.findElement(By.cssSelector("input#gridCheck"));
		checkBox1.click();
		boolean check= checkBox1.isSelected(); //is selected method  is used to verify whether its selected
		System.out.println(check);
		
	}

}
