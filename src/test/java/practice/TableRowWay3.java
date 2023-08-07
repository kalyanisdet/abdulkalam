package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableRowWay3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/points-table-standings");
		
		Thread.sleep(5000);
		//Get all tables in page source
		List<WebElement> tables=driver.findElements(By.xpath("//table/tbody"));
		System.out.println(tables.size());
		//Collect all rows in each table.
		Thread.sleep(5000);
		for(int i=1;i<=tables.size();i++) {
			List<WebElement> rows=driver.findElements(By.xpath("(//table/tbody)["+i+"]/tr"));
			
			System.out.println(rows.size());
			Thread.sleep(5000);
			
			for(int j=1;j<=rows.size();j++) {
				List<WebElement> cols=driver.findElements(By.xpath("(//table/tbody)["+i+"]/tr["+j+"]/td"));
				System.out.println(cols.size());
				
			}
			
		}
		

	}

}
