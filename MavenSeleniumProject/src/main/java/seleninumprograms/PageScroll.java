package seleninumprograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	JavascriptExecutor js=(JavascriptExecutor)driver; // to interact with webelement we use javascript
	//selenium provided interface is  JavascriptExecutor
	js.executeScript("window.scrollBy(0,250)"," ");//to run java scroll
	
	}
	

	}


