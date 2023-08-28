package JavaPrograms;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectAllItems2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com");
		List<WebElement> titles=driver.findElements(By.cssSelector(".product-title"));
		List<WebElement> prices=driver.findElements(By.cssSelector(".prices"));
		
		HashMap<String, Double> products=new HashMap<String, Double>();
		for(int i=0;i<titles.size();i++) {
			products.put(titles.get(i).getText(), Double.parseDouble(prices.get(i).getText()));
			
		}
		products.entrySet().stream().forEach(e->{System.out.println(e.getKey()+" \"price is:\" "+e.getValue());});
		
		
		
	}

}
