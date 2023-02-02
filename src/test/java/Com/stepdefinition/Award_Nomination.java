package Com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Award_Nomination {
	
	 public static WebDriver driver;
	 
@Given("user able to enter the Award Nomination module")
public void user_able_to_enter_the_award_nomination_module() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh K\\eclipse-workspace\\Java_Testing\\drivercurrent\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://tagexpo.in/");
	driver.manage().window().maximize();
	WebElement awardNomination = driver.findElement(By.xpath("(//a[@class='ekit-menu-nav-link ekit-menu-dropdown-toggle'])[3]"));
	awardNomination.click();
}
@Given("user able to click the Nomination Now button")
public void user_able_to_click_the_nomination_now_button() {
	WebElement nominateNow = driver.findElement(By.xpath("//button[@class='msme-btn msme_close_btn']"));
	nominateNow.click();
}
@Given("user able to enter the Name of the Founder\\/owner")
public void user_able_to_enter_the_name_of_the_founder_owner() {
	WebElement founderName = driver.findElement(By.xpath("(//input[@class='login__input'])[1]"));
	founderName.sendKeys("Dinesh K");
}
@Given("user able to enter the Name of the contact person")
public void user_able_to_enter_the_name_of_the_contact_person() {
	WebElement contactPerson = driver.findElement(By.xpath("(//input[@class='login__input'])[2]"));
	contactPerson.sendKeys("sachin");
}
@Given("user enter the Mobile Number")
public void user_enter_the_mobile_number() {
	WebElement mobileNumber = driver.findElement(By.xpath("(//input[@class='login__input'])[3]"));
	mobileNumber.sendKeys("6379732890");
}
@Given("user enter the Email")
public void user_enter_the_email() {
	WebElement email = driver.findElement(By.xpath("(//input[@class='login__input'])[4]"));
	email.sendKeys("dineshkrishnan310700@gmail.com");
}
@Given("user enter the Passward")
public void user_enter_the_passward() {
	WebElement passward = driver.findElement(By.xpath("(//input[@class='login__input'])[5]"));
	passward.sendKeys("12345");
}
@Given("user enter the Address")
public void user_enter_the_address() {
	WebElement address = driver.findElement(By.xpath("(//input[@class='login__input'])[6]"));
	address.sendKeys("Erode");
}
@Given("user able to enter the Name of company\\/Firm")
public void user_able_to_enter_the_name_of_company_firm() {
	WebElement company = driver.findElement(By.xpath("(//input[@class='login__input'])[7]"));
	company.sendKeys("infinityHub");
}
@Given("user able to enter the Year of Establishment")
public void user_able_to_enter_the_year_of_establishment() {
	WebElement yearsEstablishment = driver.findElement(By.xpath("(//input[@class='login__input'])[8]"));
	yearsEstablishment.sendKeys("2022");
}
@Given("user enter the Brand Name")
public void user_enter_the_brand_name() {
	WebElement brandName = driver.findElement(By.xpath("(//input[@class='login__input'])[9]"));
	brandName.sendKeys("Nike");
}
@Given("user enter the GST Number")
public void user_enter_the_gst_number() {
	WebElement gstNo = driver.findElement(By.xpath("(//input[@class='login__input'])[10]"));
	gstNo.sendKeys("33AAIFI1412L1ZM");
}
@Given("user able to enter the No of Employees")
public void user_able_to_enter_the_no_of_employees() {
	WebElement noOfEmployes = driver.findElement(By.xpath("(//input[@class='login__input'])[11]"));
	noOfEmployes.sendKeys("5");
}
@Given("user able to enter the Main Products")
public void user_able_to_enter_the_main_products() {
	WebElement mainProduct = driver.findElement(By.xpath("(//input[@class='login__input'])[12]"));
	mainProduct.sendKeys("Adidas");
}
@Given("user able to enter the No.of factories\\/manufacturing units")
public void user_able_to_enter_the_no_of_factories_manufacturing_units() {
	WebElement noOfFactories = driver.findElement(By.xpath("(//input[@class='login__input'])[13]"));
	noOfFactories.sendKeys("3");
}
@Given("user able to upload the Profile image")
public void user_able_to_upload_the_profile_image() {
	WebElement chooseFile = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
	chooseFile.click();
	chooseFile.sendKeys("C:\\Users\\Dinesh K\\OneDrive - Round Rock ABA school LLC\\Pictures\\adidas.png");
}
@Given("user able to upload the CompanyLogo")
public void user_able_to_upload_the_company_logo() {
	WebElement companyLogo = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
	companyLogo.click();
	companyLogo.sendKeys("C:\\Users\\Dinesh K\\OneDrive - Round Rock ABA school LLC\\Pictures\\adidas.png");
}
@Given("user able to select the Award Category")
public void user_able_to_select_the_award_category() throws InterruptedException {
	WebElement selectAward = driver.findElement(By.xpath("//button[@class='login__input text-left']"));
	selectAward.click();
	Thread.sleep(3000);
	WebElement dropdown = driver.findElement(By.xpath("//span[text()='MOST ADMIRED BRAND']"));
	dropdown.click();
	Thread.sleep(3000);
	WebElement men = driver.findElement(By.xpath("//*[@id=\"default_collapse0\"]/div/div[1]/div[2]/label"));
	men.click();
	Thread.sleep(3000);
	WebElement womens = driver.findElement(By.xpath("//span[text()='MOST ADMIRED UPCOMING BRAND']"));
	womens.click();
	Thread.sleep(3000);
	WebElement admired = driver.findElement(By.xpath("//label[text()='MOST ADMIRED UPCOMING BRAND Children’s']"));
	admired.click();
	Thread.sleep(3000);
}
@Given("user able to enter the Substantiate & Quantify your reason for nomination to the specific category")
public void user_able_to_enter_the_substantiate_quantify_your_reason_for_nomination_to_the_specific_category() {
	WebElement specificCategory = driver.findElement(By.xpath("(//input[@class='login__input'])[14]"));
	specificCategory.sendKeys("Best Shirts");
}
@Given("user able to drag the Supporting Evidence")
public void user_able_to_drag_the_supporting_evidence() {
	WebElement supportingEvidence1 = driver.findElement(By.xpath("//*[@id=\"nominee_form\"]/div[21]/div/div[1]/div/div/div[2]"));
	supportingEvidence1.click();
	supportingEvidence1.sendKeys("C:\\Users\\Dinesh K\\OneDrive - Round Rock ABA school LLC\\Pictures\\adidas.png");
}
@Given("What are the key achievements of your brand in comparison to your competitor?")
public void what_are_the_key_achievements_of_your_brand_in_comparison_to_your_competitor() {
	WebElement competitor= driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/div[22]/input[1]"));
	competitor.sendKeys("yes compared");
}
@Given("user able to drag the Supporting Evidence2")
public void user_able_to_drag_the_supporting_evidence2() {
	WebElement supportingEvidence2 = driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/div[22]/input[1]"));
	//supportingEvidence2.click();
	supportingEvidence2.sendKeys("C:\\Users\\Dinesh K\\OneDrive - Round Rock ABA school LLC\\Pictures\\adidas.png");
}//C:\Users\Dinesh K\OneDrive - Round Rock ABA school LLC\Pictures\\adidas.png
@Given("user able to enter the Location present at")
public void user_able_to_enter_the_location_present_at() {
	WebElement location = driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/div[24]/input[1]"));
	location.sendKeys("Erode");
}
@Given("user able to enter the Retail Brands your produce for")
public void user_able_to_enter_the_retail_brands_your_produce_for() {
	WebElement retailBrand = driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/div[25]/input[1]"));
	retailBrand.sendKeys("Nike");
}
@Given("user able to enter the New innovations \\/ Distributions")
public void user_able_to_enter_the_new_innovations_distributions() {
	WebElement innovation = driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/div[26]/input[1]"));
	innovation.sendKeys("yes");
}
@Given("Where did you hear about TAGEXPO")
public void where_did_you_hear_about_tagexpo() {
	WebElement hear = driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/div[28]/div[1]/span[1]/label[1]/input[1]"));
	hear.click();
	WebElement others = driver.findElement(By.xpath("//body/div[3]/div[1]/form[1]/div[28]/div[1]/span[6]/label[1]/span[1]/input[1]"));
	others.sendKeys("words on mouth");
}
@Then("user able to submit the SignUp button")
public void user_able_to_submit_the_sign_up_button() {
	WebElement signUp = driver.findElement(By.xpath("//button[@id='nominee_submit']"));
	signUp.click();
} 

}
