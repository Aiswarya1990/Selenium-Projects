package seleninumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
       WebElement newtab=driver.findElement(By.id("tabButton"));
 	   newtab.click();
	//Handle Windows-Get the parent window handle.
 	  String parentwindow=driver.getWindowHandle();//returns the parentwindow
 	   //here we are using collections set-Get all window handles.Switch to Child Window:
 	   Set<String> allwindows=driver.getWindowHandles(); //returns all the id
 	  System.out.println(parentwindow);
 	  System.out.println(allwindows);
 	  
 	  for(String childwindow :allwindows)
	{
 	if(!childwindow.equals(parentwindow)) 
 		{
     driver.switchTo().window(childwindow);
     
     // Declare the element in the new tab, get text and print 
     WebElement header=driver.findElement(By.id("sampleHeading"));
     String text=header.getText();
     System.out.println("Text in new tab ="+text);
    		 }
 }
 driver.switchTo().window(parentwindow);
	}
}

	
	    

	              
