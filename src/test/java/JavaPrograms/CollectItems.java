package JavaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectItems {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement e=driver.findElement(By.xpath("(//select[@name='skills'])[1]/parent::div"));
		//(//div[contains(@class,'dropdown selection')])[last()-2]
		driver.executeScript("arguments[0].scrollIntoView();", e);
		e.click();
		List<WebElement> allItems=e.findElements(By.xpath("child::div[contains(@class,'menu')]/div"));
		for(WebElement eachItem:allItems) {
			eachItem.click();
		}

		List<WebElement> deSelectItems=e.findElements(By.xpath("child::a"));
		for(WebElement deSelect:deSelectItems) {
			deSelect.findElement(By.xpath("child::i")).click();
		}
			
			
	}
	

}
