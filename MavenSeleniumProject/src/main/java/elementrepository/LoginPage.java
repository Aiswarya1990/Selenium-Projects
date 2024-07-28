package elementrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	// we use parameterized constuctor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	// POM with PageFactory
	@FindBy(id = "loginform-username")
	WebElement username;

	@FindBy(id = "loginform-password")
	WebElement password;

	@FindBy(name = "login-button")
	WebElement login;
	
	// declaring webelements in login page witout Pagefactory
	// By username = By.id("loginform-username");
	// By password = By.id("loginform-password");
	// By login = By.name("login-button");

	public void inputusername()
	{
		username.sendKeys("carol");// element.sendkeys

	}

	public void inputpassword() 
	{
		password.sendKeys("1q2w3e4r");

	}

	public void clickloginbutton() 
	{
		login.click();

	}
}
