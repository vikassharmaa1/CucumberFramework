package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTest {
	
	WebDriver driver = null;
	
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	    throw new PendingException();
	}

	
	@When("^I enter valid username$")
	public void i_enter_valid_username() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("vikassharmaa1@gmail.com");
	    throw new PendingException();
	}

	@When("^valid password$")
	public void valid_password() throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("DL7sad3832^");
	    throw new PendingException();
	}

	@When("^click on submit$")
	public void click_on_submit() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	    throw new PendingException();
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    System.out.println("User logged in successfully");
	    throw new PendingException();
	}

}