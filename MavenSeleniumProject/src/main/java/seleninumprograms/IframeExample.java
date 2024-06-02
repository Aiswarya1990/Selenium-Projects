package seleninumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        
       driver.switchTo().frame("frame1"); // to switch from driver to frame by id
       
       // Interact with elements within the iframe
       WebElement name=driver.findElement(By.id("sampleHeading")); //Locate the iframe
        String text=name.getText();
        System.out.println(text);
        driver.switchTo().defaultContent(); // To Switch back to the main content
        //driver.switchTo().parentFrame();
        
        //The iframe is located as a WebElement, and then the switch is made to this iframe.
       WebElement iframe = driver.findElement(By.id("frame1")); 
       driver.switchTo().frame(iframe); 
       
      
       //Interact with the element
   
      WebElement element= driver.findElement(By.id("sampleHeading"));
       String value = element.getText();
       System.out.println(value);
       driver.switchTo().defaultContent(); 
   
        
       // Switch to the iframe by index
       driver.switchTo().frame(2); // in  html find//iframe and find the index number and give
       WebElement ByIndex = driver.findElement(By.id("sampleHeading"));
       String valueByIndex = ByIndex.getText();
       System.out.println(valueByIndex);
       
       
        
        
        
        
        
	}

}
