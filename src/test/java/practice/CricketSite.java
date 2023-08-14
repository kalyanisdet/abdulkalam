package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketSite {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/points-table-standings");
		
WebElement e=driver.findElement(By.xpath("(//table/tbody/tr/td)[1]/a//div/span[text()='Sri Lanka']"));
String x=e.getText();
System.out.println(x);
Thread.sleep(10000);
List<WebElement> list=driver.findElements(By.xpath("(//table)[1]/tbody/tr/td"));
for(WebElement l:list) {
	String y=l.getText();
	System.out.println(y);
}

	}

}
