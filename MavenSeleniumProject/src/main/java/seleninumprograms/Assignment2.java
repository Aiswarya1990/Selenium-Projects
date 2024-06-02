package seleninumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
        driver.manage().window().maximize();
        
        WebElement radiobutton=driver.findElement(By.cssSelector("input#inlineRadio1"));
        radiobutton.click();
        boolean radio=radiobutton.isSelected();
        System.out.println("Radio Button Selected:" +radio);
        
        
       
      
	}
}
       
	
       
	
		




       
       
        
      
