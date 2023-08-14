package JavaPrograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectAllItems {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(5000);
		List<WebElement> titles=driver.findElements(By.cssSelector(".product-title"));
		Thread.sleep(5000);
		List<WebElement> prices=driver.findElements(By.cssSelector(".prices"));
		Thread.sleep(5000);
		String t;
		double p;
		HashMap<String, Double> products=new HashMap<String, Double>();
		
		Thread.sleep(5000);
		
		
		/*
		 * for(int i=0;i<products.size();i++) { t=titles.get(i).getText();
		 * p=Double.parseDouble(prices.get(i).getText()); Thread.sleep(5000);
		 * products.put(t,p);
		 * 
		 * 
		 * } for(Entry<String, Double> e:products.entrySet()) {
		 * System.out.println(e.getKey() + "Product price is: "+ e.getValue());
		 * 
		 * }
		 */

	}

}
