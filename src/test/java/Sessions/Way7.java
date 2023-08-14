package Sessions;





import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Way7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seletech.in/practice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='container']/child::div[@class='block large-row-spacer']"));
		int msdd=0;
		for(WebElement lists:list) {
			if(lists.getAttribute("id").contains("multiple")) {
				msdd++;
			}
			
		}
		System.out.println("Total multiple dropdowns list:" +msdd);
		
	}

}
