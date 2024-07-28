package seleninumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");

		WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("Carol");
		
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(10000));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Workers")));
		WebElement workers=driver.findElement(By.linkText("Workers"));
		workers.click();
		

		WebElement search=driver.findElement(By.xpath("//button[@type='submit']"));
		wait.until(ExpectedConditions.textToBePresentInElement(search, "Search"));
		//search.click();
		
		//WebElement tooltip=driver.findElement(By.xpath("//a[@href='/payrollapp/worker/view?id=1']"));
		//wait.until(ExpectedConditions.attributeToBe(tooltip, "title", "Update"));
		//String text=tooltip.getAttribute("title");
		//System.out.println("Tooltip text="+text);
		
		WebElement delete=driver.findElement(By.xpath("//table[@class='table table-striped table-bordered']//tr[3]//span[@class='glyphicon glyphicon-trash']"));
		delete.click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
		
				
		
		
		
	}

}
		

