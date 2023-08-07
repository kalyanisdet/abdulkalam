package Sessions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Way4 {
	//In this case it will open 3 chromebrowsers and close, after that navigate to given url
// Create method will open & close the browser immediately.
	public static void main(String[] args) {
		//
		WebDriverManager.chromedriver().create(3);
		WebDriver driver=new ChromeDriver();
		driver.get("https://seletech.in/practice/");

	}

}
