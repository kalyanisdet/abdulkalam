package DailyPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement e=driver.findElement(By.xpath("//span[text()='Login']/preceding::button[@class='_2KpZ6l _2doB4z']"));
		try {
			e.click();
		}
		catch(Exception ex) {
			System.out.println("Element not displayed"+ ex);
			
		}
		
		driver.findElement(By.name("q")).click();
		WebElement w=driver.findElement(By.name("q"));
		w.sendKeys("Mobiles", Keys.ARROW_DOWN);
		w.sendKeys(Keys.ENTER);
		
		List<WebElement> list=driver.findElements(By.cssSelector("._13oc-S"));
		for(WebElement each:list) {
			each.click();
			ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			
			WebElement prices=driver.findElement(By.xpath("//div[@id='price-info-icon']/preceding::div[@class='_30jeq3 _16Jk6d']"));
			String price=prices.getText();
			System.out.println(price);
			driver.close();
			driver.switchTo().window(tabs.get(0));
			
			
			
		}

	}

}
