package seleninumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
        driver.manage().window().maximize();
        
        WebElement entermessage=driver.findElement(By.id("single-input-field"));
        entermessage.sendKeys("Message");
        
        WebElement showmessage=driver.findElement(By.id("button-one"));
        showmessage.click();
        
        WebElement valueA=driver.findElement(By.xpath("//input[@id='value-a']"));
        valueA.sendKeys("100");
        
        WebElement valueB=driver.findElement(By.xpath("//input[@id='value-b']"));
        valueB.sendKeys("200");
        
        WebElement getTotal=driver.findElement(By.id("button-two"));
        getTotal.click();
        
        String text=showmessage.getText(); 
		System.out.println("Text:" + text);
		
		String styleproperties=showmessage.getCssValue("background-color");
		System.out.println("Background-color : "+styleproperties);
		
		String attributeValue=showmessage.getAttribute("class");
		System.out.println("Attribute value :"+ attributeValue);
		
		String buttontag=showmessage.getTagName();
		System.out.println("Tag name:" +buttontag);
	
        
}

}