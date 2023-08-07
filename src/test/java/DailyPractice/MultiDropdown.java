package DailyPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='ui active tab']/child::div/child::div[contains(@class,'dropdown')]"));
		int multiSelect = 0;
		for(WebElement lists:list) {
			if(lists.getAttribute("class").contains("multiple")) {
				multiSelect++;
				driver.executeScript("arguments[0].style.border='2px.solid.blue';", lists);
			}
			
		}
		System.out.println("Total multiselect dropdowns in the webpage: "+multiSelect);
		System.out.println("Total single & multi dropdowns count in web page: "+list.size());
		////div[@class='ui active tab']/child::div/div[contains(@class,'dropdown')]

	}

}
