package JavaPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableCount2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String x="OS";
		String y="mac";
		driver.findElements(By.xpath("(//table)[2]")).
		forEach(r->r.findElements(By.xpath("tbody/tr")).
				forEach(s->{s.findElements(By.xpath("td")).
					forEach(t->{System.out.println(t.getText());});}));
		
				
		}
		
		
		
		
		
		

	}


