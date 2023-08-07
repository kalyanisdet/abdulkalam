package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TableRowWay5 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/points-table-standings");
		Thread.sleep(5000);
		List<WebElement> tables=driver.findElements(By.xpath("//table/tbody"));
		System.out.println("Total tables count is: "+tables.size());
		
		//Highlight each visible table with border 
		for(WebElement table:tables) {
			if(table.isDisplayed()) {
				driver.executeScript("arguments[0].style.border='2px dotted blue';", table);
			}
		}
		//Collect rows in each table.
		for(WebElement table:tables) {
			List<WebElement> rows=table.findElements(By.xpath("child::tr"));
			System.out.println("Total rows:"+rows.size());
			for(WebElement r:rows) {
				List<WebElement> cols=r.findElements(By.xpath("child::td"));
				System.out.println(cols.size());
				for(WebElement col:cols) {
					System.out.print(col.getText()+",");
				}
				System.out.println();
			}
		}
		
	}

}

