package JavaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownsList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Collect all the dropdowns in pagesource
		List<WebElement> allDropdowns=driver.findElements(By.xpath("//div[@class='ui active tab']/child::div/child::div"));
		//Then, goto specific dropdown in the page.
		allDropdowns.get(2).click();
		//And, click on specific dropdown value.
		WebElement e=driver.findElement(By.xpath("(//div[contains(@class,'ui dropdown')])[2]/child::div/child::div[text()='Female']"));
		e.click();
		}
		

	}


