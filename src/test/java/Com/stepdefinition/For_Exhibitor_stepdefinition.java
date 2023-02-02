package Com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class For_Exhibitor_stepdefinition {
	 public static WebDriver driver;
	@Given("users able to enter the ForExhibitor Module")
	public void users_able_to_enter_the_for_exhibitor_module() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://tagexpo.in/");
		driver.manage().window().maximize();
	}
	@Given("users enter the Click to exhibit button")
	public void users_enter_the_click_to_exhibit_button() {
		WebElement exhibitButton = driver.findElement(By.xpath("(//a[@class='ekit-menu-nav-link ekit-menu-dropdown-toggle'])[2]"));
		exhibitButton.click();
		WebElement clicktoExhibit = driver.findElement(By.xpath("//button[@class='msme-btn msme_close_btn']"));
		clicktoExhibit.click();
	}
	@Given("users enter the company Name")
	public void users_enter_the_company_name() {
		WebElement companyName = driver.findElement(By.xpath("//input[@name='name']"));
		companyName.sendKeys("InfinityHub");
	}
	@Given("users enter the brand name")
	public void users_enter_the_brand_name() {
		WebElement brandName= driver.findElement(By.xpath("//input[@name='brand_name']"));
		brandName.sendKeys("Addidas");
	}
	@Given("users enter the Address")
	public void users_enter_the_address() {
		WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
	    address.sendKeys("Erode infinityHub");
	}
	@Given("users enter the Managing Director")
	public void users_enter_the_managing_director() {
		WebElement managingDirector = driver.findElement(By.xpath("//input[@name='managing_director']"));
		managingDirector.sendKeys("Sachin");
	}
	@Given("users enter the Mobile Number")
	public void users_enter_the_mobile_number() {
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@name='mobile_number']"));
		mobileNumber.sendKeys("9943277196");
	}
	@Given("users enter the Contact Person")
	public void users_enter_the_contact_person() {
		WebElement contactPerson = driver.findElement(By.xpath("//input[@name='contact_person']"));
		contactPerson.sendKeys("Dinesh");
	}
	@Given("users enters the designation")
	public void users_enters_the_designation() {
		WebElement designation = driver.findElement(By.xpath("//*[@id=\"designation\"]"));
		designation.sendKeys("Software Testwer");
	}
	@Given("users enter the Pan Number")
	public void users_enter_the_pan_number() {
		WebElement panNO = driver.findElement(By.xpath("//input[@name='pan_no']"));
		panNO.sendKeys("ABCTY1234D");
		
	}
	@Given("users enter the GST Number")
	public void users_enter_the_gst_number() {
		WebElement gstNo = driver.findElement(By.xpath("//input[@name='gst_no']"));
		gstNo.sendKeys("33AAIFI1412L1ZM");
		
	}
	@Given("users enter the Phone Number")
	public void users_enter_the_phone_number() {
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone_no']"));
		phoneNumber.sendKeys("6379732890");
	}
	@Given("users enters the emailId")
	public void users_enters_the_email_id() {
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email_id\"]"));
		email.sendKeys("dinesh.krishnan@roundrockabaschool.onmicrosoft.com");
	}
	@Given("Users enters the website")
	public void users_enters_the_website() {
		WebElement website = driver.findElement(By.xpath("//input[@name='website']"));
		website.sendKeys("https://tagexpo.in/exhibitor");
	}
	@Given("users enter the Passward")
	public void users_enter_the_passward() {
		WebElement passward = driver.findElement(By.xpath("//input[@name='password']"));
		passward.sendKeys("12345678");
	}
	@Given("users upload the companyLogo")
	public void users_upload_the_company_logo() {
		WebElement companyLogo = driver.findElement(By.xpath("//input[@name='company_logo']"));
		companyLogo.click();
		companyLogo.sendKeys("C:\\Users\\Dinesh K\\OneDrive - Round Rock ABA school LLC\\step2.png");
	}
	@Given("users upload the profile image")
	public void users_upload_the_profile_image() {
		WebElement profileImage = driver.findElement(By.xpath("//input[@name='profile_img']"));
		profileImage.click();
		profileImage.sendKeys("C:\\Users\\Dinesh K\\OneDrive - Round Rock ABA school LLC\\Pictures\\step2.png");
	}
	@Given("users select the category")
	public void users_select_the_category() {
		WebElement firsrBox = driver.findElement(By.xpath("(//input[@name='category[]'])[1]"));
		firsrBox.click();
		WebElement secondBox = driver.findElement(By.xpath("(//input[@name='category[]'])[2]"));
		secondBox.click();
	}
	@Given("users select the Product on Display")
	public void users_select_the_product_on_display() {
		WebElement firstDisplay = driver.findElement(By.xpath("(//input[@name='products_on_display[]'])[2]"));
		firstDisplay.click();
		WebElement secondDisplay = driver.findElement(By.xpath("(//input[@name='products_on_display[]'])[3]"));
		secondDisplay.click();
	}
	@Given("users able to book the stall")
	public void users_able_to_book_the_stall() {
		WebElement booking= driver.findElement(By.xpath(" //*[@id=\"msform\"]/fieldset/div[8]/div[1]/div/button"));
		booking.click();
		WebElement slot = driver.findElement(By.xpath(" (//label[@id='tooltip'])[18]"));
		slot.click();
		WebElement bookingStall= driver.findElement(By.xpath("//button[@id='confirmstall']"));
		bookingStall.click();
	}
	@Given("users able to click the Acknowledge button")
	public void users_able_to_click_the_acknowledge_button() {

		WebElement acknowledge = driver.findElement(By.xpath("//input[@name='acknowledge_check[]']"));
		acknowledge.click();
	}
	@Then("users able to click the Confirm your Space button")
	public void users_able_to_click_the_confirm_your_space_button() {
		WebElement submit = driver.findElement(By.xpath("//button[@class='action-button text-center']"));
		submit.click();
	}

}