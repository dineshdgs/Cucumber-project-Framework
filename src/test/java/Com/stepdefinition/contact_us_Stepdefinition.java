package Com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contact_us_Stepdefinition {
	public static WebDriver driver;
	
	@Given("user able to enter the contactus")
	public void user_able_to_enter_the_contactus() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://tagexpo.in/");
		driver.manage().window().maximize();
		WebElement forMedia = driver.findElement(By.xpath("(//a[@class='ekit-menu-nav-link'])[5]"));
		forMedia.click();
	}
	@When("user able to enter the name")
	public void user_able_to_enter_the_name() {
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Dinesh k");
	}
	@When("user able to enter the Email")
	public void user_able_to_enter_the_email() {
		WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		email.sendKeys("dinesh005@gmail.com");
		
	}
	@When("user able to enter the MobileNumber")
	public void user_able_to_enter_the_mobile_number() {
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@name='mobile_no']"));
		mobileNumber.sendKeys("6379732892");
		
	}
	@When("user able to enter the message")
	public void user_able_to_enter_the_message() {
		WebElement message = driver.findElement(By.xpath("//input[@name='message']"));
		message.sendKeys("Thankyou for support");
		
	}
	@Then("user able to click the submit button")
	public void user_able_to_click_the_submit_button() {
		WebElement submit = driver.findElement(By.xpath("//button[@class='buyer-btn px-5 mt-5']"));
		submit.click();
	}


}
