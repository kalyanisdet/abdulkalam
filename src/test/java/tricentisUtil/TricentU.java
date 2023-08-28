package tricentisUtil;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TricentU {
	
	public List<WebElement> getAllOptions(WebElement e){
		List<WebElement> allOpt=e.findElements(By.xpath("child::a"));
		return(allOpt);
	}
	
	
	

}
