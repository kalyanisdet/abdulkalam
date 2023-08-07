package JavaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownsList2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Collect all the dropdowns in pagesource
		WebElement e=driver.findElement(By.xpath("(//div[contains(@class,'ui floating dropdown')])[2]"));
		e.click();
				WebElement f=e.findElement(By.xpath("child::input[@class='search']/following::div[@class='menu transition visible']/child::div[text()='English']"));
				f.click();
		
				
		}
	
		

	}


