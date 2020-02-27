package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrmDataDrivenStepDef {
WebDriver driver;
	
	@Given("^user is already on the login page$")
	public void user_is_already_on_the_login_page()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.crmpro.com"); 
	}

	@When("^the title of the login page is \"([^\"]*)\"$")
	public void the_title_of_the_login_page_is(String arg1)  {
		String title = driver.getTitle();
		System.out.println("the title of the login page is==>"+title);
	    Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password)  {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	}
    
	@Then("^user is on the home page$")
	public void user_is_on_the_home_page()  {
		String title = driver.getTitle();
		System.out.println("the title of the home page is==> "+ title);
	}

	@Then("^user clicks on contact link$")
	public void user_clicks_on_contact_link() {
		driver.switchTo().frame("mainpanel");
	    driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}
     
	@Then("^user colse the browser$")
	public void user_colse_the_browser()  {
	   driver.close();
	}
}
