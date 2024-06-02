package seleninumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		
		WebElement multiselect=driver.findElement(By.cssSelector("select#multi-select-field"));
		Select obj=new Select(multiselect);
		obj.selectByIndex(0);
		obj.selectByIndex(1);
		obj.selectByValue("Red");
		obj.selectByValue("Yellow");
		List<WebElement> selectvalue=obj.getAllSelectedOptions();
		
		 // Print the selected options to verify using for-eachloop
        for (WebElement value : selectvalue)
        {
        System.out.println("Selected option: " + value.getText());
        }
        

	
	}
}


/*
Finding Elements: You locate the multi-select dropdown using driver.findElement(), which returns a single WebElement.

Selecting Options: You use the Select class to select options by index.

Getting Selected Options: The getAllSelectedOptions() method returns a List<WebElement>, 
which contains all the currently selected options in the multi-select dropdown.

Iterating Through List: You iterate through the List<WebElement> using a for-each loop to print and verify the selected options.

Why Use List<WebElement>:

Handle Multiple Elements: It allows you to handle multiple elements at once.
 For instance, you can get all options, all links, all buttons, etc.
Iteration and Manipulation: You can easily iterate through the list, manipulate the elements, and perform bulk operations.
This approach makes it easy to work with multiple web elements in a structured and efficient manner.
*/
