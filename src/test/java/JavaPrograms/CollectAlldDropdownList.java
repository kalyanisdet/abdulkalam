package JavaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectAlldDropdownList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Taken xpath for all dropdowns in the page
		List<WebElement> allDropdowns=driver.findElements(By.xpath("//div[@class='ui active tab']/child::div/div[contains(@class,'dropdown')]"));
		//get(5) is the dropdown->(Index starts from zero for dropdown list in the list) "4", It will open dropdown 4
		allDropdowns.get(5).click();
		allDropdowns.get(5).findElement(By.xpath("child::div[contains(@class,'menu')]/div[1]")).click();

	}

}
