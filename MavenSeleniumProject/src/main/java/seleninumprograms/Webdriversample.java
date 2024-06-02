package seleninumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriversample {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");//to invoke any url
		driver.getCurrentUrl(); 
        String url=driver.getCurrentUrl(); // to get any url
		System.out.println(url);
		driver.getTitle();
		String title=driver.getTitle(); //to get title of the page
		System.out.println(title);
		//driver.getPageSource();
		//String source=driver.getPageSource() ; // to get html code of the web page
		//System.out.println(source);
		driver.manage().window().fullscreen();
		//driver.manage().window().minimize();
		
		driver.navigate().back(); //to navigate to backward to previous page
		driver.navigate().forward(); //to navigate to next page
	    driver.navigate().refresh(); //to refresh the page
	    //driver.manage().deleteAllCookies(); //to delete cookies
	    driver.close(); //to close the browser in focus
	    driver.quit(); //all windows will be closed
	}
}

