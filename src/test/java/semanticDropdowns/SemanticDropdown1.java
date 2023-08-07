package semanticDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SemanticDropdown1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Collect all dropdowns as a list.
		List<WebElement> multiSelectDropdown=driver.findElements(By.xpath("//div[@class='ui active tab']/div/div[contains(@class,'dropdown')]"));
		int msdd=0;
		for(WebElement multi:multiSelectDropdown) {
			if(multi.getAttribute("class").contains("multiple")) {
				msdd++;
			}
			
				
			
		
		

		}
		System.out.println("Total multiple select dropdowns are: "+msdd);
	}

}
