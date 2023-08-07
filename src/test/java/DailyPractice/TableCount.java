package DailyPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableCount {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("userId")).sendKeys("kalyani");
		driver.findElement(By.id("pass")).sendKeys("kalyani");
		driver.findElement(By.name("company")).sendKeys("Orbit BI Analytics");
		driver.findElement(By.name("mobile number")).sendKeys("8106537416");
		//driver.findElement(By.name("test")).sendKeys("kalyani");
		//driver.findElement(By.xpath("(//input[@class='nameFld'])[2]")).sendKeys("Arakota");
		Select s=new Select(driver.findElement(By.xpath("//select[@name='cars']")));
		s.selectByIndex(3);
		
		WebElement date=driver.findElement(By.name("the_date"));
		date.click();
		List<WebElement> checkList=driver.findElements(By.xpath("//table/tbody/tr[@class='usr_acn']/td[1]"));
		for(WebElement lists:checkList) {
			//To select checkboxes
			lists.click();
			Thread.sleep(5000);
			//To deselect checkboxes
			
		}
	Select select=new Select(driver.findElement(By.xpath("//select[@name='tablepress-1_length']")));
	select.selectByIndex(0);
	
	List<WebElement> totalRows=driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
	for(WebElement total:totalRows) {
		String y=total.getText();
		}
	int j=totalRows.size();
	System.out.println("Total rows:" +j);
	
	
	}
	
	

}
