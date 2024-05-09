package DealsDrayAutomationTestforMobile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTestgetcalleyinFirefoxforMobile {
	//For 360×640 Resolution
	public static void TestinFirefox1()throws InterruptedException, IOException {
		
		WebDriver driver1=new FirefoxDriver();
		
		driver1.manage().window().setSize(new Dimension(360,640));
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver1.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		
		Thread.sleep(2000);
		String timestamp = getCurrentTimestamp();
		driver1.findElement(By.linkText("https://www.getcalley.com/")).click();
		String screenshotName1 = "./MobileScreenshotFireFox/Mob_fox360_1-" + timestamp + ".png";
		TakesScreenshot Ts=(FirefoxDriver) driver1;
		File Src = Ts.getScreenshotAs(OutputType.FILE);
		File target = new File(screenshotName1);
		FileHandler.copy(Src, target);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		String screenshotName2 = "./MobileScreenshotFireFox/Mob_fox360_2-" + timestamp + ".png";
		File Src2 = Ts.getScreenshotAs(OutputType.FILE);
		File target2 = new File(screenshotName2);
		FileHandler.copy(Src2, target2);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		String screenshotName3 = "./MobileScreenshotFireFox/Mob_fox360_3-" + timestamp + ".png";
		File Src3 = Ts.getScreenshotAs(OutputType.FILE);
		File target3 = new File(screenshotName3);
		FileHandler.copy(Src3, target3);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
		String screenshotName4 = "./MobileScreenshotFireFox/Mob_fox360_4-" + timestamp + ".png";
		File Src4 = Ts.getScreenshotAs(OutputType.FILE);
		File target4 = new File(screenshotName4);
		FileHandler.copy(Src4, target4);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/calley-zoho-crm-integration/")).click();
		String screenshotName5 = "./MobileScreenshotFireFox/Mob_fox360_5-" + timestamp + ".png";
		File Src5 = Ts.getScreenshotAs(OutputType.FILE);
		File target5 = new File(screenshotName5);
		FileHandler.copy(Src5, target5);
		driver1.navigate().back();
		
		driver1.quit();
	}
	
	//For 414×896 resolution
	public static void TestinFirefox2()throws InterruptedException, IOException {
		
		WebDriver driver1=new FirefoxDriver();
		
		driver1.manage().window().setSize(new Dimension(414,896));
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver1.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		
		Thread.sleep(2000);
		String timestamp = getCurrentTimestamp();
		driver1.findElement(By.linkText("https://www.getcalley.com/")).click();
		String screenshotName1 = "./MobileScreenshotFireFox/Mob_fox414_1-" + timestamp + ".png";
		TakesScreenshot Ts=(FirefoxDriver) driver1;
		File Src = Ts.getScreenshotAs(OutputType.FILE);
		File target = new File(screenshotName1);
		FileHandler.copy(Src, target);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		String screenshotName2 = "./MobileScreenshotFireFox/Mob_fox414_2-" + timestamp + ".png";
		File Src2 = Ts.getScreenshotAs(OutputType.FILE);
		File target2 = new File(screenshotName2);
		FileHandler.copy(Src2, target2);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		String screenshotName3 = "./MobileScreenshotFireFox/Mob_fox414_3-" + timestamp + ".png";
		File Src3 = Ts.getScreenshotAs(OutputType.FILE);
		File target3 = new File(screenshotName3);
		FileHandler.copy(Src3, target3);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
		String screenshotName4 = "./MobileScreenshotFireFox/Mob_fox414_4-" + timestamp + ".png";
		File Src4 = Ts.getScreenshotAs(OutputType.FILE);
		File target4 = new File(screenshotName4);
		FileHandler.copy(Src4, target4);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/calley-zoho-crm-integration/")).click();
		String screenshotName5 = "./MobileScreenshotFireFox/Mob_fox414_5-" + timestamp + ".png";
		File Src5 = Ts.getScreenshotAs(OutputType.FILE);
		File target5 = new File(screenshotName5);
		FileHandler.copy(Src5, target5);
		driver1.navigate().back();
		
		driver1.quit();
	}
	
	//For 375×667  resolution
	public static void TestinFirefox3()throws InterruptedException, IOException {
		
		WebDriver driver1=new FirefoxDriver();
		
		driver1.manage().window().setSize(new Dimension(375,667));
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver1.navigate().to("https://www.getcalley.com/page-sitemap.xml");
		
		Thread.sleep(2000);
		String timestamp = getCurrentTimestamp();
		driver1.findElement(By.linkText("https://www.getcalley.com/")).click();
		String screenshotName1 = "./MobileScreenshotFireFox/Mob_fox375_1-" + timestamp + ".png";
		TakesScreenshot Ts=(FirefoxDriver) driver1;
		File Src = Ts.getScreenshotAs(OutputType.FILE);
		File target = new File(screenshotName1);
		FileHandler.copy(Src, target);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		String screenshotName2 = "./MobileScreenshotFireFox/Mob_fox375_2-" + timestamp + ".png";
		File Src2 = Ts.getScreenshotAs(OutputType.FILE);
		File target2 = new File(screenshotName2);
		FileHandler.copy(Src2, target2);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		String screenshotName3 = "./MobileScreenshotFireFox/Mob_fox375_3-" + timestamp + ".png";
		File Src3 = Ts.getScreenshotAs(OutputType.FILE);
		File target3 = new File(screenshotName3);
		FileHandler.copy(Src3, target3);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
		String screenshotName4 = "./MobileScreenshotFireFox/Mob_fox375_4-" + timestamp + ".png";
		File Src4 = Ts.getScreenshotAs(OutputType.FILE);
		File target4 = new File(screenshotName4);
		FileHandler.copy(Src4, target4);
		driver1.navigate().back();
		
		Thread.sleep(2000);
		driver1.findElement(By.linkText("https://www.getcalley.com/calley-zoho-crm-integration/")).click();
		String screenshotName5 = "./MobileScreenshotFireFox/Mob_fox375_5-" + timestamp + ".png";
		File Src5 = Ts.getScreenshotAs(OutputType.FILE);
		File target5 = new File(screenshotName5);
		FileHandler.copy(Src5, target5);
		driver1.navigate().back();
		
		driver1.quit();			
		
	}
	
	public static String getCurrentTimestamp() {
		// TODO Auto-generated method stub
		 	LocalDateTime currentTime = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmm");
	        return currentTime.format(formatter);
	        
	}
}
