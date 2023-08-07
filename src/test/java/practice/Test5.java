package practice;

import java.io.File;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/?ref_=icp_country_from_us");
		driver.manage().window().maximize();

		TakesScreenshot tscr=(TakesScreenshot)driver;
		File f=tscr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\MyNewFol\\org.magnitia.abdulkalam\\Screenshots\\Amazonhomepage.jpg"));
		


	}

}
