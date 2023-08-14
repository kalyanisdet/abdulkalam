package JavaPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableCount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/points-table-standings");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		try {
			
		
		driver.findElements(By.xpath("//table"))
		.forEach(t->t.findElements(By.xpath("tbody/tr"))
				.forEach(r->{r.findElements(By.xpath("td")).forEach(c->{System.out.println(c.getText());
				});}));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		

	}

}
