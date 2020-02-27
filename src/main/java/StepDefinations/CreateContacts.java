package StepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContacts {

	WebDriver driver;

	@Given("^user should be login page$")
	public void user_should_be_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.crmpro.com");
	}

	@When("^the login page title is \"([^\"]*)\"$")
	public void the_login_page_title_is(String arg1) {
		String title = driver.getTitle();
		System.out.println("the title of the login page is==>" + title);
	}

	@Then("^user enters valid username and password$")
	public void user_enters_valid_username_and_password(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(data.get(1).get(0));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get(1).get(1));
	}

	@Then("^user hits on the login button$")
	public void user_hits_on_the_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String homepageTitle = driver.getTitle();
		System.out.println("the home page title is ==> " + homepageTitle);
	}

	@Then("^user clicks on New Contacts link$")
	public void user_clicks_on_New_Contacts_link() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();

	}

//	@Then("^user enters firstname and lastname and position$")
//	public void user_enters_firstname_and_lastname_and_position(DataTable contactsInfo) {
//	List<Map<String,String>> contacts= contactsInfo.asMaps(String.class, String.class) ;
//	
//        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(contacts.get(0).get("firstname"));
//        driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(contacts.get(1).get("lastname"));
//        driver.findElement(By.xpath("//input[@id='company_position']")).sendKeys(contacts.get(2).get("position"));
//	}
	@Then("^user enters firstname and lastname and position$")
	public void user_enters_firstname_and_lastname_and_position(DataTable contactsInfo) {
	for(Map<String,String> contacts : contactsInfo.asMaps(String.class, String.class)) {
	
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(contacts.get("firstname"));
        driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(contacts.get("lastname"));
        driver.findElement(By.xpath("//input[@id='company_position']")).sendKeys(contacts.get("position"));
        driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")).click();
        
        
        Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();

	}
	}
	
	@Then("^user hits on the save button$")
	public void user_hits_on_the_save_button() {
		driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/input[2]")).click();

	}

	@Then("^user quite the browser\\.$")
	public void user_quite_the_browser() {
		driver.quit();
	}

}
