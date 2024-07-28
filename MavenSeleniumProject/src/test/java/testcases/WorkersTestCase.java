package testcases;

import org.testng.annotations.Test;

import elementrepository.LoginPage;
import elementrepository.WorkerPage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class WorkersTestCase {
	WebDriver driver;

	@Test
	// creating new test case
	public void verifyTheTextofSearchButtoninWorkersPage() {

		LoginPage lp = new LoginPage(driver);
		lp.inputusername();
		lp.inputpassword();
		lp.clickloginbutton();
		
		WorkerPage wp = new WorkerPage(driver);
		wp.navigateWorker();
		String actualResult = wp.getSearchButtonText();
		String expectedResult = "Search";
		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test
	public void verifythefontsizeofSearchbuttoninWorkerPage() 
	{
	LoginPage lp = new LoginPage(driver);
	lp.inputusername();
	lp.inputpassword();
	lp.clickloginbutton();
	
	WorkerPage wp = new WorkerPage(driver);
	wp.navigateWorker();
	String actualResult = wp.getFontsizeofSearchButton();
	String expectedResult = "14px";
	Assert.assertEquals(actualResult, expectedResult);


	}

	@BeforeMethod
	public void beforeMethod() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
