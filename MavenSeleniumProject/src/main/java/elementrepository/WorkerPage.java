package elementrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkerPage {
	WebDriver driver;
	
	// we use parameterized constuctor
		public WorkerPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(linkText="Workers")
	WebElement workermenu;

	@FindBy(xpath= "//button[@type='submit']")
	WebElement searchButton;
	
	//By workermenu = By.linkText("Workers");
	//By searchButton = By.xpath("//button[@type='submit']");
	

	public void navigateWorker() {
		workermenu.click();
	}

	
	public String getSearchButtonText() 
	{
		String text = searchButton.getText();
		return text;
	}
		
		public String getFontsizeofSearchButton()
		{
			String fontsize=searchButton.getCssValue("font-size");
			return fontsize;
			
			
		}

	}

