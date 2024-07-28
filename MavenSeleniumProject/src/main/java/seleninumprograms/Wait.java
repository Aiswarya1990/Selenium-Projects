package seleninumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		
		//Implicit wait is general mainly for pageload- here Duration is static- method & a java class
		
		//Always add in begin-whereever pageload is available this wait will have life
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); 
		
		
		
		WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("Carol");
		
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		
		//This is Explicit Wait-driver wil wait until certain element contains meet
		//even after 10 sec if Workers element is not present we will get exception as no such element and test will fail
		//Explicit delay should be added to the page where we are getting delay -here its for Workers tab(page)
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(10000));//create object for  WebDriverWait class
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Workers")));//call the condtion and pass the parameters
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		WebElement workers=driver.findElement(By.linkText("Workers"));
		workers.click();
		
		
		
		
		
		
	}
}

