 package Com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class For_Media_Stepdefinition {
	public static WebDriver driver;
	
	@Given(":user able to click the For Media URL")
	public void user_able_to_click_the_for_media_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://tagexpo.in/");
		driver.manage().window().maximize();
		WebElement forMedia = driver.findElement(By.xpath("(//a[@class='ekit-menu-nav-link'])[3]"));
		forMedia.click();
	}
	@When(":user able to enter the Name of media")
	public void user_able_to_enter_the_name_of_media() {
		WebElement nameOfMedia = driver.findElement(By.xpath("//input[@name='media_name']"));
		nameOfMedia.sendKeys("Dinesh K");
		
	}
	@When(":user able to enter the Industry")
	public void user_able_to_enter_the_industry() {
		WebElement industry = driver.findElement(By.xpath("//input[@name='industry']"));
		industry.sendKeys("infinityHub");
		
	}
	@When(":user able to enter the Mobile Number")
	public void user_able_to_enter_the_mobile_number() {
		WebElement mobileNo = driver.findElement(By.xpath("//input[@name='mobile_no']"));
		mobileNo.sendKeys("6379732891");
		
	}
	@When(":user able to enter the Email")
	public void user_able_to_enter_the_email() {
		WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		email.sendKeys("dinesh@gmail.com");
		
	}
	@When(":user able to enter the contact person")
	public void user_able_to_enter_the_contact_person() {
		WebElement contactPerson = driver.findElement(By.xpath("//input[@name='contact_person']"));
		contactPerson.sendKeys("sachin");
		
	}
	@When(":user able to enter the position")
	public void user_able_to_enter_the_position() {
		WebElement position = driver.findElement(By.xpath("//input[@name='position']"));
		position.sendKeys("Software Tester");
		
	}
	@When(":user able to enter the Nature of media")
	public void user_able_to_enter_the_nature_of_media() {
		Select ii =new Select(driver.findElement(By.xpath("//select[@name='media_nature']")));
		ii.selectByVisibleText("Radio");
		
	}
	@When(":user able to enter the country")
	public void user_able_to_enter_the_country() {
		WebElement country = driver.findElement(By.xpath("//input[@name='country']"));
		country.sendKeys("India");
		
	}
	@When(":user able to enter the city")
	public void user_able_to_enter_the_city() {
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Erode");
		
	}
	@When(":user able enter the Address")
	public void user_able_enter_the_address() {
		WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
		address.sendKeys("Erode infinityHub");
		
	}
	@Then(":user able to click the submit button")
	public void user_able_to_click_the_submit_button() {
		WebElement submit = driver.findElement(By.xpath("//span[@class='button__text']"));
		submit.click();
		
	}

}
