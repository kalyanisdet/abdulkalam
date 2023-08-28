package JavaPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectVisibleInvisibleEle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.yahoo.com");
		List<WebElement> l=driver.findElements(By.xpath("//a"));
		int itemsSize=l.size();
		System.out.println(itemsSize);
		int VEC=0;
		int IEC=0;
		for(WebElement e:l) {
			if(e.isDisplayed()) {
				VEC=VEC+1;
			
			}
			else {
				IEC=IEC+1;
			}
		}
		System.out.println("Total Visible count is:"+VEC);
		System.out.println("Total invisible count is: "+IEC);
		

	}

}
