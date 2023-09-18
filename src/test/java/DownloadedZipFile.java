import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DownloadedZipFile {
	RemoteWebDriver driver;
	@Test
	public void DownldZp() throws Exception {
		File fileToZip=new File("C:\\MyNewFol\\selenium-java-4.9.0.zip");
		FileInputStream fis=new FileInputStream(fileToZip);
		File zipfile=new File("C:\\MyNewFol\\selenium-java-4.9.0.zip");
	}

}
