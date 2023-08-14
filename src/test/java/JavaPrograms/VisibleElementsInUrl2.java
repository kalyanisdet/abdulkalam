package JavaPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibleElementsInUrl2 {

	public static void main(String[] args) throws Exception
	{
		//Open browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); 
		//Launch google
		driver.get("https://www.amazon.com");
		Thread.sleep(5000); 
		//collect all elements in page source
		List<WebElement> list=driver.findElements(By.xpath("//*"));
		System.out.println(list.size());
		int vec=0;
		int iec=0;
		for(WebElement l:list) {
			if(l.isDisplayed()) {
				vec=vec+1;
				driver.executeScript("arguments[0].style.border='2 px dotted yellow';", l);
				
			}
			else {
				iec=iec+1;
			}
			
		}
		System.out.println(vec);
		
		System.out.println(iec);
		
		//close site
		//driver.close();
	}






	}


