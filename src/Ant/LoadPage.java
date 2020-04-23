package Ant;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoadPage {

	WebDriver driver;
	
	//archivo:build.xml
	@Test
	public void Load() throws InterruptedException
	{
	
		System.setProperty("webdriver.gecko.driver", "C:\\Librerias64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.quit();
	}
	
//archivo:build1.xml	
/*	 public static void main(String args[]) throws InterruptedException{									       
			System.out.println("HELLO GURU99 ANT PROGRAM");					        
			System.out.println("TODAY's DATE IS->"+ currentDate() );
			
		/*	System.setProperty("webdriver.gecko.driver", "C:\\Librerias64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Thread.sleep(5000);
			driver.quit();
	}		    		   
	 
	 
	public static String currentDate(){					        
		return new Date().toString();					  
		}		
	
	*/
	
}
