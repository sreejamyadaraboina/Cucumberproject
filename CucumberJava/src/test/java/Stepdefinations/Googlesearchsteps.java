package Stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlesearchsteps {
	
	WebDriver driver= null;
	
/*	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Open the browser");
		System.getProperty("webdriver.chrome.driver","C:/Users/Anusha Jabu/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver.exe");
  driver =new ChromeDriver();
   driver.manage().window().maximize();
 }
@And("user is on search bar")
	public void user_is_on_search_bar() {
		System.out.println("on search bar");
driver.navigate().to("https://www.google.co.in/");
	}

	@When("user enters text in search bar")
	public void user_enters_text_in_search_bar()  {
		System.out.println("Inside step-user enters text in search bar");
 driver.findElement(By.name("q")).sendKeys("Lord venkateswara Images");
 
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("hitting enter button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user able to see search results")
	public void user_able_to_see_search_results() {
		System.out.println("Navigate to seach bar");
driver.close();
driver.quit();
	}
*/

}
