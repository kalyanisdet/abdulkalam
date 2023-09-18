package SeleniumTests;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Test128 {
	RemoteWebDriver driver;
	@Test
	public void settings() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
        driver.manage().window().maximize();
        //launch site
        driver.get("https://semantic-ui.com/modules/dropdown.html");
        Thread.sleep(5000);
        //Get screenshot of an element
       WebElement e=driver.findElement(By.xpath("//h4[text()='Floating']/following::div[1]"));
     File f1=e.getScreenshotAs(OutputType.FILE);
     File dest=new File("target\\ele.png");
     FileHandler.copy(f1,dest);
     
     Thread.sleep(1000);
     File f2=driver.getScreenshotAs(OutputType.FILE);
     File dest2=new File("target\\visiblePage.png");
     FileHandler.copy(f2, dest2);
       
     //Get Screenshot of complete page
     AShot as=new AShot();
     ShootingStrategy shs=ShootingStrategies.viewportPasting(500);
     Screenshot ss=as.shootingStrategy(shs).takeScreenshot(driver);
     File dest3=new File("target\\Wholepagescr.png");
     ImageIO.write(ss.getImage(), "PNG", dest3);
     
	}
}