package leafgroundtesting;

import java.io.File;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DownloadFiles {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		 WebDriverManager.chromedriver().setup();
		  
		 WebDriver driver=new ChromeDriver();
		  
		 driver.get("http://demo.automationtesting.in/FileDownload.html");
		 driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a")).
		 click();
		 
		
		
		File file=new File("C:\\Users\\Naren\\Downloads");
		
		File[] listFiles = file.listFiles();
		
		for (File file2 : listFiles) {
			
			if(file2.getName().equalsIgnoreCase("samplefile")) {
				
				System.out.println("File is downloaded and available in local machine");
				break;
			}
			
		}
			
			System.out.println("File is downloaded");
		}		
		
	}


