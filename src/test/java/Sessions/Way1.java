package Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Way1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().arch64().driverVersion("113").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://seletech.in/practice/");

	}

}
