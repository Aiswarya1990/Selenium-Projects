package seleninumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();
		
		WebElement fileupload=driver.findElement(By.id("uploadfile_0"));
		//fileupload.click(); //direct click wont work because tag name is input for fileupload-it should be button
		//so we need to mouse hover-for mouse hover we need to use actions class
		
		
		Actions actions=new Actions(driver);
		actions.moveToElement(fileupload).click().perform();
		
		
		//Copy file path to system clipboard //copying using string selection class in Java
	     StringSelection ss = new StringSelection("C:\\Users\\lenovo\\Desktop\\Assignment 15Feb.docx");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//and pasting by robot -To press one key we need to use 2 methods Keypress and KeyRelease
		Robot obj=new Robot();
		obj.keyPress(KeyEvent.VK_CONTROL); //vk-virtualkey
		obj.delay(1000); // to control execution we are using delay method
		obj.keyPress(KeyEvent.VK_V);
		obj.delay(1000); // to control execution we are using delay method
		obj.keyRelease(KeyEvent.VK_CONTROL);
		obj.delay(1000);
		obj.keyRelease(KeyEvent.VK_V);
		obj.delay(1000);
		
		obj.keyPress(KeyEvent.VK_ENTER);
		obj.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement submit=driver.findElement(By.id("submitbutton"));
		submit.click();
		
		
	

		
//obj.keyPress(KeyEvent.KEY_FIRST); // to press one key we need to use 2 methods Keypress and KeyRelease
 // obj.keyRelease(KeyEvent.KEY_FIRST);
  
	


}

}