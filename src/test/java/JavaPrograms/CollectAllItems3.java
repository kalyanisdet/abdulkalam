package JavaPrograms;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectAllItems3 {

	public static void main(String[] args) throws Exception {
		//Collect each item name & get back continiue until last product.
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com");
		List<WebElement> prices=driver.findElements(By.cssSelector(".product-title"));
		for(int i=0;i<prices.size();i++) {
			prices.get(i).click();
			WebElement e=driver.findElement(By.xpath("//div[@class='product-name']/h1"));
			String x=e.getText();
			System.out.println(x);
			driver.navigate().back();
		}
		
			}

}
