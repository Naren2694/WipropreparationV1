package leafgroundtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[contains(text(),\"Auto Complete\")]")).click();
		
		driver.findElement(By.id("tags")).sendKeys("s");
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		
		for (WebElement webElement : elements) {
			
			if(webElement.getText().equals("Selenium")) {
				
				webElement.click();
				
			}
			}
			
		}
	}


