package DealsDrayAutomationTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

public class ToTestgetcalley extends ToTestgetcalleyinChrome{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		TestinChrome1(); //For 1920×1080 Resolution
		TestinChrome2(); //For 1366×768 Resolution
		TestinChrome3(); //For 1536×864 Resolution
		
		
		TestinFirefox1(); //For 1920×1080 Resolution
		TestinFirefox2(); //For 1366×768 Resolution
		TestinFirefox3(); //For 1536×864 Resolution
		
		

	}
	
	
	


	
}
