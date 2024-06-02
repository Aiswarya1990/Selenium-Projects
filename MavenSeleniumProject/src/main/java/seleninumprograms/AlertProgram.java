package seleninumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*This program navigates to a web page, interacts with two different types of JavaScript alerts
& performs actions like reading the alert text, accepting the alert, and sending text to a prompt.
*/

public class AlertProgram {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		
		//finds the button of the Webpage using its XPath
		WebElement clickMe=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMe.click();
		
		String alerttext=driver.switchTo().alert().getText(); //This Switches to the alert & gets the text displayed.
		System.out.println(alerttext); 
		
		driver.switchTo().alert().accept(); // to accept the alert(Clicks the OK button)
		//driver.switchTo().alert().dismiss(); //to dismiss the alert
		
	
		WebElement promptBox=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		promptBox.click();
		
		//This sends the text "Alert message" to the prompt alert.
		driver.switchTo().alert().sendKeys("Alert message");
		
	}

}
