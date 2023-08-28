package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	RemoteWebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
	     WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	     driver.get("https://app.fastmail.com/login");
		System.out.println("Enters on Login page successffully.");
		
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Exception {
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("mindqkalyani123", Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Kalyani@125$");
		System.out.println("Enter user name and password successfully");
		/*
		 * driver.findElement(By.name("username")).sendKeys("kalyanisdet92@gmail.com");
		 * driver.findElement(By.name("password")).sendKeys("Kalyani@1234$");
		 */
	   
	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//div[@class='v-PushSelect']/descendant::label[text()='Pinned']")).click();
	    System.out.println("Click on Login button");
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() throws Exception{
		Thread.sleep(2000);
	   WebElement title=driver.findElement(By.xpath("//a[text()='This account is overdue. Pay now to avoid losing access.']"));
	   String titlename=title.getText();
	   System.out.println("Home page is visible with: " +titlename);
	}

}
