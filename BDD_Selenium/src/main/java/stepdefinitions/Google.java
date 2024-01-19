package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
	WebDriver driver;
	@Given("user is present in google webpage")
	public void user_is_present_in_google_webpage() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	 
	}

	@When("user searches for qspiders basavangudi")
	public void user_searches_for_qspiders_basavangudi() {
		driver.findElement(By.id("APjFqb")).sendKeys("Qspiders Basavangudi"+Keys.ENTER) ;
		
		
	}

	@Then("searchpage should be displayed")
	public void searchpage_should_be_displayed() {
	    String title = driver.getTitle();
	    System.out.println(title);
	}



}
