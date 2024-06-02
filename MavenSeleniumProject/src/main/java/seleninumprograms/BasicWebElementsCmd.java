package seleninumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElementsCmd {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("loginform-username")); //To declare an element //by is findElement parameter
		//by.id is static classname.staic method
		username.sendKeys("Aiswarya");
		username.clear(); //clear method is used to clear the text field
		
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("May2024!");
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		String text=login.getText(); //getText() is used to displayed on the webelement
		System.out.println(text);
		
		String propertyValue=login.getCssValue("font-family");
		System.out.println(propertyValue);
		
		String background=login.getCssValue("background-color");
		System.out.println(background);
		
		String tagName=login.getTagName();
		System.out.println(tagName);
		
		String attributeValue=login.getAttribute("class");
		System.out.println(attributeValue);
	}

}
