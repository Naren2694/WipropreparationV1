package leafgroundtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		String Tooltipname="Enter your Name";

		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[contains(text(),\"Tool Tip\")]")).click();
		/*
		 * WebElement attribute = driver.findElement(By.id("age"));
		 * 
		 * Actions action=new Actions(driver);
		 * 
		 * action.moveToElement(attribute).build().perform();
		 */
		
		String attribute2 = driver.findElement(By.id("age")).getAttribute("title");
		
		if(Tooltipname.equals(attribute2)) {
			System.out.println("Tooltip name is passed");
		}
		
	}

}
