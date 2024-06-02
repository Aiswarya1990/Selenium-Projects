package seleninumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		WebElement dropdown1=driver.findElement(By.id("single-input-field"));
		Select obj=new Select(dropdown1);//obj creation required to select
		//obj.selectByIndex(1); //if we need to  chose 1st position(eg Red) select 0 and so on //selects the value
		
		//obj.selectByVisibleText("Yellow");
		obj.selectByValue("Red");// value attribute value is selected here
		WebElement selectvalue=obj.getFirstSelectedOption(); //to verify
		String text=selectvalue.getText();
		System.out.println(text);
		
	}

}
