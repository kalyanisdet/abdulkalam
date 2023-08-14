package JavaPrograms;

import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllImages {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		//Create a new folder if not exists
		File folder=new File("C:\\batch264images");
		if(!folder.exists()) {
			folder.mkdirs();
		}
		//Collect all images in page source.
		List<WebElement> images=driver.findElements(By.xpath("//*"));
		int allimagesfile=images.size();
		System.out.println(allimagesfile);
		int count=1;
		for(WebElement image:images) {
			try {
				//Take images source value
				String imageUrl=image.getAttribute("src");
				String fileName="image"+count+".png";
				Path destinationPath=Path.of(folder.getAbsolutePath(),fileName);
				URL url=new URL(imageUrl);
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	
	
	
		
			}	

	}


