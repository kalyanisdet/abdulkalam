package DailyPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableUtilsTest {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://seletech.in/practice");
		Thread.sleep(5000);
		WebElement wt=driver.findElement(By.xpath("//table[@class='product']"));
		TableTestUtil obj=new TableTestUtil();
		List<WebElement> headers=obj.getHeaders(wt);
		for(WebElement header:headers) 
		{
			System.out.println((String)driver.executeScript(
					"return(arguments[0].textContent);",header)+"      ");  
		}
		System.out.println();
		int nor=obj.getRowsCount(wt);
		for(int i=1; i<=nor; i++)
		{
			int noc=obj.getColumnsCountInRow(wt,i);
			for(int j=1; j<=noc; j++) 
			{
				System.out.println(obj.getCellValue(driver, wt, i, j)+"  ");

			}
			System.out.println();
		}
	}

}
