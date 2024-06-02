package seleninumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PresenceofElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://selenium.qabible.in/simple-form-demo.php");
        driver.manage().window().maximize();

        
        WebElement showmessage =driver.findElement(By.id("button-one"));
        boolean value=showmessage.isDisplayed(); // to verify element presence
        System.out.println(value);
         boolean value2=showmessage.isEnabled();
         System.out.println(value2);
        
        
	}

}
