package SeleniumTests;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test122 {
	RemoteWebDriver driver;
	@Test
	public void settings() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("identifier")).sendKeys("magnitiait");
		driver.findElement(By.xpath("//*[text()='Next']/parent::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("Passwd")).sendKeys("Magnitia@262");
		driver.findElement(By.xpath("//*[text()='Next']/parent::button")).click();
		Thread.sleep(10000);
		//way-1: locate target element directly
		WebElement e1=driver.findElement(By.xpath("(//table)[6]/tbody/tr[1]/td[4]/div[1]"));
		String o1=(String) driver.executeScript("return(arguments[0].textContent);",e1);
		System.out.println(o1);
		
		
	}

}
