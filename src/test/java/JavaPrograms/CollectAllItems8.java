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
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CollectAllItems8 {

	public static void main(String[] args) throws Exception {
		//Collect each item name along with prices get back continiue until last product.
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.fastmail.com");
		List<WebElement> allElements=driver.findElements(By.xpath("//*"));
		System.out.println("Total elements in the pagesource: " +allElements.size());
		int vec=0;
		int iec=0;
		for(WebElement e:allElements) {
			if(e.isDisplayed()) {
				vec=vec+1;
				//driver.executeScript("arguments[0].style.border='2px dotted yellow';", e);
			}
			else {
				iec=iec+1;
				
			}
			
		}
		System.out.println("Visible elements count is:" +vec);
		System.out.println("Invisible elements count is:" +iec);
				
		}


		
	
		
		
			}


