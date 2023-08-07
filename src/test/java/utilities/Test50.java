package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test50 {
	public int getCountOfSlides(WebElement slider) {
		int count=0;
		if(slider.getTagName().equalsIgnoreCase("ul")||
		slider.getTagName().equalsIgnoreCase("ol"));
		{
			count=slider.findElements(By.xpath("child::li")).size();
		}
		 if(slider.getTagName().equalsIgnoreCase("div"))
		{
			List<WebElement> temp1=slider.findElements(By.xpath("child::div"));
			List<WebElement> temp2=new ArrayList<WebElement>();
			for(WebElement e:temp1) {
				try {
					if(!e.getAttribute("class").contains("clone")) {
						if(e.getAttribute("data-clone").equals("false"))
						{
							temp2.add(e);//data-clone is false to an element(visible)
							
						}
					}
				}
				catch(Exception ex) {
					temp2.add(e);
				}
			}
			count=temp2.size();
			
		}
		else {
			System.out.println("Unknown tag");
			System.exit(0);//Stop execution forcibly.
		}
	
		return count;
		
	
		
	}

}
