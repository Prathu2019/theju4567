package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeLogn {
  
	WebDriver driver;
	
	@Given("User should be present in Actitime login page.")
	public void user_should_be_present_in_actitime_login_page() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("http://localhost/login.do");   
	    		
	}

	@When("Enter Username and password")
	public void enter_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    
	}

	@And("Clicks on Loginbutton.")
	public void he_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	
	@Then("Homepage will be displayed")
	public void homepage_will_be_displayed() {
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
	    System.out.println(jse.executeScript("return document.titile"));
	}

}
