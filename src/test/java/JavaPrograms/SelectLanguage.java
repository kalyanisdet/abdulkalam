package JavaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectLanguage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Collect all the dropdowns in pagesource
				WebElement e=driver.findElement(By.xpath("(//div[contains(@class,'multiple search')])[2]/descendant::div[1]"));
		
				e.click();
			List<WebElement> selectAllInDropdown=e.findElements(By.xpath("(//div[contains(@class,'multiple search')])[2]/descendant::div[contains(@class,'menu')]/div"));
			for(WebElement dd:selectAllInDropdown) {
				dd.click();
				
				
			}
			
	List<WebElement> allUncheckSelectedItems=driver.findElements(By.xpath("(//div[contains(@class,'multiple search')])[2]/descendant::a/child::i[@class='delete icon']"));
	for(WebElement check:allUncheckSelectedItems) {
		
		check.click();
	}
		
		}
	
		

	}


