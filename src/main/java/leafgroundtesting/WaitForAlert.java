package leafgroundtesting;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlert {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//*[contains(text(),\"Wait for Alert\")]")).click();
		driver.findElement(By.id("alert")).click();

		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());

		/*
		 * TakesScreenshot shot=(TakesScreenshot)driver; File destinationfile =
		 * shot.getScreenshotAs(OutputType.FILE); File sourcefile=new File("//D:");
		 * FileUtils.copyFile(destinationfile, sourcefile);
		 */
		Robot robot=new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage createScreenCapture = robot.createScreenCapture(rectangle);
		File destinationfile =new File("D://sample.png");
		ImageIO.write(createScreenCapture, "png", destinationfile);

		driver.switchTo().alert().accept();



	}

}
