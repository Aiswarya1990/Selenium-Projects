package testNGCommands;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SampleTestCase {
	WebDriver driver; // Always Declare WebDriver globally so that it is accessible to all
/*
	@Test
	public void verifytheTextofSearchButtonInWorkersPage() {
		WebElement username = driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();

		WebElement workers = driver.findElement(By.linkText("Workers"));
		workers.click();

		String expected = "Searched"; // wrong one given
		WebElement searchElement = driver.findElement(By.xpath("//button[@type='submit']"));
		String actual = searchElement.getText();

		// Assertion-// Compares Actual wise Expected

		// Assert.assertEquals(actual, expected,"Search Button text is not displayed");
		// System.out.println("*********");

		SoftAssert object = new SoftAssert(); // Soft assertion syntax.(Class.obj=new Classname)It is also called Verify
		object.assertEquals(actual, expected, "Text displayed is not expected");
		System.out.println("******");
		object.assertAll(); // This is mandatory for all soft assertion

	}

	@Test
	public void verifythebackgroundcolourofSearchButtonfromClientsPage() {

		WebElement username = driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();

		WebElement client = driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
		client.click();

		String expected = "rgba(51, 122, 183, 1)"; // Expected background color
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		String actual = searchButton.getCssValue("background-color");

		// Assert.assertEquals(actual, expected);
		SoftAssert object = new SoftAssert();
		object.assertEquals(actual, expected);
		object.assertAll();

	}

	@Test
	public void verifytheTooltipvalueofEditiconinClientsPage() {

		WebElement username = driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();

		WebElement client = driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
		client.click();

		WebElement editIcon = driver.findElement(By.xpath("//a[@href='/payrollapp/client/update?id=1']"));

		String expected = "Update";
		String actual = editIcon.getAttribute("title");
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void verifytheLogoutFeature() {

		WebElement username = driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();

		WebElement user = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		user.click();
		
		String expectedURL="https://www.qabible.in/payrollapp/site/login";

		WebElement logoutbutton = driver.findElement(By.xpath("//a[@data-method='post']"));
		logoutbutton.click();
		 
		String actualURL = driver.getCurrentUrl();
		//verify te presence of elements in the login page and add assertion
		 
		SoftAssert object = new SoftAssert();
		object.assertEquals(actualURL, expectedURL);
	}

	@Test

	public void verificationOfTitleDropDownfromtheCreateWorkersubpage() {
		WebElement username = driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		WebElement workers = driver.findElement(By.linkText("Workers"));
		workers.click();
		WebElement createworker = driver.findElement(By.xpath("//a[@href='/payrollapp/worker/create']"));
		createworker.click();

		WebElement dropdown = driver.findElement(By.id("worker-title"));
		Select obj = new Select(dropdown);// obj creation required to select
		obj.selectByIndex(1);
		WebElement selectedvalue = obj.getFirstSelectedOption();
		String actual = selectedvalue.getText();
		String expected = "Mr";

		Assert.assertEquals(actual, expected);

	}
*/
	@Test(priority=1)// we can add enable to stop running the testcase-//enable=false
	public void verificationofRequirePoCheckboxfromCreateClientSubPage() {
		WebElement username = driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		WebElement clients = driver.findElement(By.linkText("Clients"));
		clients.click();
		WebElement createclient = driver.findElement(By.linkText("Create Client"));
		createclient.click();

		boolean expectedcheck = true;
		WebElement requirePO = driver.findElement(By.id("client-require_po"));
		requirePO.click();

		boolean actualcheck = requirePO.isSelected();
		Assert.assertEquals(actualcheck, expectedcheck);

	}

	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String b) 
	{
		if(b.equals("Chrome"))
		{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

	}
		else if(b.equals("Edge"))
		{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

		}
	}


	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
