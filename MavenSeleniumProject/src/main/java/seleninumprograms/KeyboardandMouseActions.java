package seleninumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardandMouseActions {

	public static void main(String[] args) {

         WebDriver driver=new ChromeDriver();
         driver.get("https://demoqa.com/buttons");
         driver.manage().window().maximize();
         
         WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
         
         //Actions -It is dedicated class n selenium to handle all keybooard & mouse related activiites
         //This creates an instance of the Actions class, which is used to perform advanced keyboard and mouse interactions.
         Actions act=new Actions(driver); //classname obj=new classname()
         
         //eg.for same methodname diffrent methods-method overlappping
         //This performs a double-click action on the found button.
         act.doubleClick(doubleClick).perform();
         
         WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
         
         //This performs a right-click [context click()]action on the found button.
         act.contextClick(rightClick).perform(); 
         
         //This moves the mouse cursor to the found button. moveToElement- move the mouse to a specific element.
         act.moveToElement(rightClick).perform();
         
         
         //To perform Actions on keyboard ie Stimulate pressing specific keyboard keys.
         
         act.sendKeys(Keys.MULTIPLY).perform(); //This sends the multiply (*) key to the browser.
         act.sendKeys(Keys.EQUALS).perform(); //This sends the equals (=) key to the browser.
         

      
}

}
