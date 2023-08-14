package JavaPrograms;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectAllItems6 {

	public static void main(String[] args) throws Exception {
		//Collect each item name along with prices get back continiue until last product.
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com");
driver.findElement(By.xpath("(//ul[@class='list'])[1]/descendant::li/a[normalize-space()='Gift Cards']")).click();
WebElement e=driver.findElement(By.xpath("//span[text()='View as']/following::select[2]"));
Select s=new Select(driver.findElement(By.xpath("//span[text()='View as']/following::select[2]")));
s.selectByIndex(3);
	Select s1=new Select(driver.findElement(By.xpath("//span[text()='Display']/following::select[1]")));
	
	s1.selectByIndex(0);
	Select s2=new Select(driver.findElement(By.xpath("//span[text()='View as']/following::select[1]")));
	s2.selectByVisibleText("List");
	
		
		
			}

}
