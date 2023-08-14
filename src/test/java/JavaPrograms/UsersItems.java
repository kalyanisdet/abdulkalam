package JavaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsersItems {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e=driver.findElement(By.xpath("//i[@class='add user icon']/parent::div[contains(@class,'icon')]"));
		e.click();
		List<WebElement> allItems=e.findElements(By.xpath("child::div[@class='menu transition visible']/child::div"));
		for(WebElement all:allItems) {
			String e1=all.getText();
			driver.executeScript("arguments[0].screenIntoView", allItems);
			System.out.println("User names list:"+e1);
		}
		
		WebElement y=e.findElement(By.xpath("child::div[@class='menu transition visible']/child::div[2]"));
		y.click();
		
		System.out.println("User has taken specific name correctly.");
	}
	
	
	
	
}
