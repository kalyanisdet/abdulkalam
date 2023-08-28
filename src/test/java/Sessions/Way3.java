package Sessions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Way3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().config().setChromeDriverVersion("113");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seletech.in/practice/");

	}

}
