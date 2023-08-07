package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableRowWay1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/points-table-standings");
		//Get all tables in page source
		Thread.sleep(5000);
		List<WebElement> tables=driver.findElements(By.xpath("//table/tbody"));
		System.out.println("Total count of tables:"+tables.size());
		//Collect rows in each table
		Thread.sleep(5000);
		for(WebElement table:tables) {
			List<WebElement> rows=table.findElements(By.xpath("child::tr"));
			//Goto each row and get the value.
			System.out.println("The total count of rows in table:"+rows.size());
			
			//Collect all columns in each row
			Thread.sleep(5000);
			for(WebElement row:rows) {
				List<WebElement> columns=row.findElements(By.xpath("child::td"));
				System.out.println("The total count of columns in table:"+columns.size());
				//Go to each column & get value.
			}
		}

	}

}
