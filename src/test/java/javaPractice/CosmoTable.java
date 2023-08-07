package javaPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CosmoTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
List<WebElement> allItems=driver.findElements(By.xpath("//table[@id='countries']/child::tbody"));

for(WebElement all:allItems) {
	String str=all.getText();
	List<WebElement> rows=all.findElements(By.xpath("child::tr[11]"));
	
	for(WebElement row:rows) {
		try {
		WebElement cols=row.findElement(By.xpath("child::td[1]/input"));
		cols.click();
		}
		catch(Exception e)
		{
			driver.executeScript("arguments[0].click();", e);
		}
		
	}
	
	
	
	
}
	


	}
	
}
