package DivTable;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DivUtilTest {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//div[text()='From']/following::input[1]")).clear();
		driver.findElement(By.xpath("//div[text()='From']/following::input[1]")).sendKeys("Bengaluru (BLR");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='To']/following::input[1]")).clear();
		
		driver.findElement(By.xpath("//div[text()='To']/following::input[1]")).sendKeys("Delhi (DEL)");
		Thread.sleep(5000);
		
		WebElement dateClick=driver.findElement(By.xpath("(//div[text()='28'])[1]"));
		
		try {
			dateClick.click();
		}
		catch(Exception e) {
			driver.executeScript("arguments[0].click();", dateClick);
		}
		
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']"));
		try {
		e.click();
		}
		catch(Exception ex) {
			driver.executeScript("arguments[0].scrollIntoView();", e);
		}
			
		
		Thread.sleep(5000);
		WebElement dt=driver.findElement(By.xpath("//div[text()='SpiceMax']/following::div[2]"));

		
		DivUtil obj=new DivUtil();
		int x=obj.getChildDIVCount(dt);
		System.out.println("Count of flights are:" +x);
		
		List<WebElement> flights=obj.getChildDIVs(dt);
		int lfare=0;
		for(WebElement flight:flights) {
			By b=By.xpath("child::div[@data-testid='searchPage-sortingOption-spicemax']/following::div[1]");
			
			String value=obj.getDIVValue(driver, flight, b);
			String num=value.replaceAll("[^0-9]","");
			if(lfare==0) {
				lfare=Integer.parseInt(num);
				
			}
			else if(lfare>Integer.parseInt(num)) {
				lfare=Integer.parseInt(num);
				flight.findElement(By.xpath("child::div/div[2]/div[1]//*[name()='svg']")).click();
				
			}
			
		}
		
		System.out.println(lfare);
		
		
	}
}