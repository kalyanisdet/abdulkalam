package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TableRowWay4 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/points-table-standings");
		Thread.sleep(5000);
		List<WebElement> SecTableTeamLabels=driver.findElements(By.xpath("(//table/tbody)[2]/tr"));
		for(int i=0;i<SecTableTeamLabels.size();i++) {
			System.out.println(SecTableTeamLabels.get(i).getText());
			
		}
		Thread.sleep(5000);	
		WebElement z=driver.findElement(By.xpath("((//table[contains(@class,'table')])[2]/tbody/tr/descendant::div)[1]"));
		String zim=z.getText();
		System.out.println("In second table first row name:"+zim);
		
	}

}

