package Com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ForBuyer_stepdefinition {
	public static WebDriver driver;
	@Given("user able to enter the ForBuyer link")
	public void user_able_to_enter_the_for_buyer_link() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://tagexpo.in/");
		driver.manage().window().maximize();
		WebElement forBuyer = driver.findElement(By.xpath("(//a[@class='ekit-menu-nav-link ekit-menu-dropdown-toggle'])[1]"));
		forBuyer.click();
	}
	@When("user enter the company name")
	public void user_enter_the_company_name() {
		WebElement companyName = driver.findElement(By.xpath("//input[@name='company_name']"));
		companyName.sendKeys("InfinityHub");
		
	}
	@When("user enter the Brand name")
	public void user_enter_the_brand_name() {
		WebElement brandName = driver.findElement(By.xpath("//input[@name='brand_name']"));
		brandName.sendKeys("select * from brand_Name");
	}
	@When("user upload the profile")
	public void user_upload_the_profile() {
		WebElement uploadProfile = driver.findElement(By.xpath("//input[@name='profile_img']"));
		uploadProfile.sendKeys("C:\\Users\\Dinesh K\\OneDrive - Round Rock ABA school LLC\\Pictures\\Tag Expo Logo.png");
		
	}
	@When("user enter the address")
	public void user_enter_the_address() {
		WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
		address.sendKeys("select * from address");
		
	}
	@When("user enter the Managing director")
	public void user_enter_the_managing_director() {
		WebElement managingDirector = driver.findElement(By.xpath("//input[@name='managing_director']"));
		managingDirector.sendKeys("Sachinadhanathan");
		
	}
	@When("user enter the Referal Mobile no")
	public void user_enter_the_referal_mobile_no() {
		WebElement ReferalMobileNo = driver.findElement(By.xpath("//input[@name='referal_mobile_no']"));
		ReferalMobileNo.sendKeys("8220575172");
		
	}
	@When("user enter the Contact person")
	public void user_enter_the_contact_person() {
		WebElement contactPerson = driver.findElement(By.xpath("//input[@name='contact_person']"));
		contactPerson.sendKeys("Anand");
		
	}
	@When("user enter the Designation")
	public void user_enter_the_designation() throws InterruptedException {
		WebElement designation = driver.findElement(By.xpath("//input[@name='designation']"));
		designation.sendKeys("Software Tester");
		Thread.sleep(3000);
		
	}
	@When("user enter the GSTNo")
	public void user_enter_the_gst_no() {
		WebElement gstNo= driver.findElement(By.xpath("//input[@name='gst_no']"));
		gstNo.sendKeys("33AAIFI1412L1ZM");
		
	}
	@When("user enter the EmailId")
	public void user_enter_the_email_id() {
		WebElement emailId = driver.findElement(By.xpath("//input[@name='email_id']"));
		emailId.sendKeys("sachinanand5845@gmail.com");
		
	}
	@When("user enter the MobileNo")
	public void user_enter_the_mobile_no() {
		WebElement mobileNo = driver.findElement(By.xpath("//input[@name='mobile_no']"));
		mobileNo.sendKeys("6379732890");
		
	}
	@When("user enter the Website")
	public void user_enter_the_website() {
		WebElement website = driver.findElement(By.xpath("//input[@name='website']"));
		website.sendKeys("https://tagexpo.in/buyer");
		
	}
	@When("user enter the Associate Details")
	public void user_enter_the_associate_details() {
		WebElement associateDetail = driver.findElement(By.xpath("//input[@name='association_details']"));
		associateDetail.sendKeys("NikeGroups");
		
	}
	@When("user able to pick the Bussiness Type")
	public void user_able_to_pick_the_bussiness_type() {
		WebElement firstType = driver.findElement(By.xpath("(//input[@name='business_type[]'])[1]"));
		firstType.click();
		WebElement secondType = driver.findElement(By.xpath("(//input[@name='business_type[]'])[5]"));
		secondType.click();
		WebElement others = driver.findElement(By.xpath("//input[@name='new_business']"));
		others.sendKeys("Bussiness man");
		
	}
	@When("user able to pick the Product Interested")
	public void user_able_to_pick_the_product_interested() {
		WebElement firstProduct = driver.findElement(By.xpath("(//input[@name='products[]'])[1]"));
		firstProduct.click();
		WebElement otherProduct = driver.findElement(By.xpath("//input[@name='new_product']"));
		otherProduct.sendKeys("Nike");
		
	}
	@When("user able to pick the Interested in B2B meeting")
	public void user_able_to_pick_the_interested_in_b2b_meeting() {
		WebElement b2b = driver.findElement(By.xpath("(//input[@name='interest_b2b_meet'])[1]"));
		b2b.click();
		
	}
	@When("user able to pick the Fashion show visit")
	public void user_able_to_pick_the_fashion_show_visit() {
		WebElement showVisit = driver.findElement(By.xpath("(//input[@name='fashion_show_visit'])[1]"));
		showVisit.click();
		
	}
	@When("user enter the Any other Reqiurement")
	public void user_enter_the_any_other_reqiurement() {
		WebElement otherrequirement = driver.findElement(By.xpath("//input[@name='other_requirement']"));
		otherrequirement.sendKeys("Shirts");
		
	}
	@When("user enter the password")
	public void user_enter_the_password() {
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Dinesh12345*@");
		
	}
	@When("user able to pick the confirm button")
	public void user_able_to_pick_the_confirm_button() {
		WebElement acknowledge = driver.findElement(By.xpath("//input[@name='acknowledge_check[]']"));
		acknowledge.click();
	}
	@Then("user able to click the register button")
	public void user_able_to_click_the_register_button() {
		WebElement button = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		button.click();
		
	}


}
