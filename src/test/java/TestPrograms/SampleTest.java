package TestPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {

	public static void main(String[] args)throws JavascriptException  {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame("pact");
		
		
		WebElement shadow=driver.findElement(By.id("snacktime"));
		SearchContext search=shadow.getShadowRoot();
		
	
		WebElement focus= search.findElement(By.xpath("//*[text()='Testers Food']"));
		focus.click();

	
		

	
	}
}
