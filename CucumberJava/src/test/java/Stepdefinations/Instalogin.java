package Stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Instalogin {
	WebDriver driver= null;

	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Browser got opened");
	    System.getProperty("webdriver.gecko.driver","C:/Users/Anusha Jabu/eclipse-workspace/CucumberJava/src/test/resources/drivers/geckodriver.exe");
	  driver =new FirefoxDriver();
	  driver.manage().window().maximize();
}
@And("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("user on login page");
	    
	driver.navigate().to("https://example.testproject.io/web/ ");
}
@When("^user enters (.+)and (.+)$")
	public void user_enters_username_and_password(String username,String password) {
	    System.out.println("User entered UN and PWD");
	    driver.findElement(By.id("name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	    
}
 @And("user clicks on login button")
 public void clicks_on_login_button() throws InterruptedException {
	System.out.println("clicks on login button");
    driver.findElement(By.id("login")).click();
    Thread.sleep(10000);
 }

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    System.out.println("Finally Homepage");
	   driver.close();
	    driver.quit();
	}
}
