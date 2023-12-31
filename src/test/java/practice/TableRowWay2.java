package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableRowWay2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/points-table-standings");
		
		Thread.sleep(5000);
		//Get all tables in page source
		List<WebElement> tables=driver.findElements(By.xpath("//table/tbody"));
		System.out.println(tables.size());
		Thread.sleep(5000);
		//Collect all rows in each table.
		for(int i=0;i<tables.size();i++) {
			List<WebElement> rows=tables.get(i).findElements(By.xpath("child::tr"));
			System.out.println(rows.size());
			//Collect all columns in each row
			Thread.sleep(5000);
			for(int j=0;j<rows.size();j++) {
				List<WebElement> cols=rows.get(i).findElements(By.xpath("child::td"));
				System.out.println(cols.size());
			}
			
		}

	}

}
