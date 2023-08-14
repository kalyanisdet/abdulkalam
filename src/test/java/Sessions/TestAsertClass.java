package Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAsertClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().browserVersion("113.0.5672.93").setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("email")).sendKeys("8106537416",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("8106537416",Keys.ENTER);
		WebElement e=driver.findElement(By.linkText("New Releases"));
		e.click();
		WebElement e2=driver.findElement(By.xpath("//span[text()='Amazon Hot New Releases']"));
		
		String actualResult=e2.getText();
		String expectedResult="Amazon Hot New Releases";
		Assert.assertEquals(expectedResult, actualResult);
		System.out.println(actualResult);
		

	}

}
