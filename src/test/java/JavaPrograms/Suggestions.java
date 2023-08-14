package JavaPrograms;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Suggestions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("Kalam sir");
		List<WebElement> allItems=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/child::li"));
		int flag=0;
		for(WebElement items:allItems) {
			String x=items.getText();
			
			if(items.)
			
		}
		

	}

}
