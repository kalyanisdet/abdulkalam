package DailyPractice;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TricentisTest {
    @Test
	public void listOutItems() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("(//div[@class='listbox'])[1]/descendant::a[1]"));
		try {
			ele.click();
		}
		catch(NoSuchElementException e) {
			System.out.println();
		}
		
driver.findElement(By.xpath("//div[@class='filter-content']/descendant::a[2]")).click();
driver.navigate().back();
List<WebElement> allItems=driver.findElements(By.xpath("//div[@class='product-grid']/child::div"));
for(WebElement items:allItems) {
	try {
	items.click();
	
	String x=driver.findElement(By.xpath("//div[@class='product-name']")).getText();
	
	System.out.println("Item is:" +x);
	}
	catch(NoSuchElementException e){
		driver.executeScript("arguments[0].click();", items);
	}
	driver.navigate().back();
}
	}

}
