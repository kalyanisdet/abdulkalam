package JavaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeggregateSingleAndMultiDropdown2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Collect all dropdowns as a list.
		List<WebElement> allItems=driver.findElements(By.xpath("//div[@class='ui active tab']/child::div/div[contains(@class,'dropdown')]"));
		//Seggregate single and multi-select dropdowns
		int ssdd=0;
		int msdd=0;
		for(WebElement items:allItems) {
			if(!items.getAttribute("class").contains("multiple")) {
				ssdd++;
				driver.executeScript("arguments[0].style.border='2px solid blue';", items);
				
		}
			else {
				msdd++;
			}
		

	}
		System.out.println("All dropdowns size "+allItems.size());
		System.out.println("Single select dropdowns count: "+ssdd);
		System.out.println("Multiselect dropdowns count:"+msdd);
}
}