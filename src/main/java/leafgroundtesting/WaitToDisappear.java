package leafgroundtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitToDisappear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[contains(text(),\"Wait to Disappear\")]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		Boolean until = wait.until(ExpectedConditions.elementSelectionStateToBe(By.id("btn"), false));
		
		System.out.println(until);
	
	}

}
