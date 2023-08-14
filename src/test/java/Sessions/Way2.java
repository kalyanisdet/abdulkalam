package Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Way2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().browserVersion("113.0.5672.64").arch64().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://seletech.in/practice/");

	}

}
