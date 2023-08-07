package JavaPrograms;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectImages {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		//Create a new folder if not exists
		
		File folder=new File("c://AmazonImages.png");
		if(!folder.exists()) {
			folder.mkdirs();
		}
		
		//Collect all the images in page source.
		List<WebElement> images=driver.findElements(By.xpath("//img"));
		System.out.println(images.size());
		int count=1;
		
		for(WebElement image:images) {
			try {
				
			
		
			//Take each image's "src" attribute value.
			String imageUrl=image.getAttribute("src");
			String fileName="image"+count+".png";
			Path destinationPath=Path.of(folder.getAbsolutePath(), fileName);
			
			//Contact that "src" url to download image.
			
			URL url=new URL(imageUrl);
			BufferedInputStream in=new BufferedInputStream(url.openStream());
			//Save that downloaded image in to our folder.
		//Files.copy(in, destinationPath, StandardCopyOption.REPLACE_EXISTING);
			//Close the streams.
			in.close();
			count++;
			
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		}
		
		
	}

}