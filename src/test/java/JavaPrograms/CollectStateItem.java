package JavaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectStateItem {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement states=driver.findElement(By.xpath("(//div[contains(@class,'selection multiple')])[2]"));
		states.click();
		
		List<WebElement> collectitems=states.findElements(By.xpath("child::div[@class='menu transition visible']/child::div"));
		for(WebElement items:collectitems) {
			items.click();
		
	}
	
	List<WebElement> l=states.findElements(By.xpath("child::a"));
	for(WebElement li:l) {
		li.findElement(By.xpath("child::i")).click();
		
	}
	

}
}