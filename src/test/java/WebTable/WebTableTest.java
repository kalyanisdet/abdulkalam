package WebTable;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTest {
@Test
	public void collectAllItems() throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/india-in-west-indies-2023-1381201/"
				+ "west-indies-vs-india-1st-test-1381212/full-scorecard");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement wt=driver.findElement(By.xpath("(//table[contains(@class,'ci-scorecard-table')])[2]"));
		WebTableU obj=new WebTableU();
		List<WebElement> headers=obj.getHeader(wt);
		for(WebElement header:headers) {
			System.out.println((String)driver.executeScript("return(arguments[0].textContent);", header)+"     ");
			
			
		}

System.out.println();
int nor=obj.getRowsCount(wt);
for(int i=1; i<nor; i++) {
	
	int noc=obj.getColumnsCountInRow(wt,i);
	for(int j=1; j<=noc; j++) {
		System.out.println(obj.getCellValue(driver, wt, i, j)+ "  ");
		
	}
	System.out.println();
	
}

	}

}
