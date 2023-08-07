package tricentisUtil;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestU {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		WebElement e=driver.findElement(By.xpath("//div[contains(@class,'product-grid')]div/child::div/div[2])"));
		TricentU obj=new TricentU();
		List<WebElement> multipleItems=obj.getAllOptions(e);
		for(WebElement items:multipleItems) {
			
			
			System.out.println((String)driver.executeScript(
					"return(arguments[0].textContent);", items));
			}

	}

}
