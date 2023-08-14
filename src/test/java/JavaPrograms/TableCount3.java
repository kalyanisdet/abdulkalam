package JavaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableCount3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String x="mac";
		
		List<WebElement> e=driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[2]"));
		int z=e.size();
				System.out.println(z);
		for(WebElement allOsList:e) {
			allOsList.getText();
			
			
			
			if(e.contains(x)) {
				System.out.println(x);
			}
			else {
				
				
			}
			
		}System.out.println("Not correct");
		}
		
		
		
		
		
		

	}


