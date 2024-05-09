package DealsDrayAutomationTest;

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

public class ToTestgetcalleyinFirefox {
			//For 1920×1080 Resolution
			public static void TestinFirefox1()throws InterruptedException, IOException {
				
				WebDriver driver1=new FirefoxDriver();
				
				driver1.manage().window().setSize(new Dimension(1920,1080));
				driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver1.navigate().to("https://www.getcalley.com/page-sitemap.xml");
				
				Thread.sleep(2000);
				String timestamp = getCurrentTimestamp();
				driver1.findElement(By.linkText("https://www.getcalley.com/")).click();
				String screenshotName1 = "./DealsDrayScreenshotsForFirefox/Desk_fox1920_1-" + timestamp + ".png";
				TakesScreenshot Ts=(FirefoxDriver) driver1;
				File Src = Ts.getScreenshotAs(OutputType.FILE);
				File target = new File(screenshotName1);
				FileHandler.copy(Src, target);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
				String screenshotName2 = "./DealsDrayScreenshotsForFirefox/Desk_fox1920_2-" + timestamp + ".png";
				File Src2 = Ts.getScreenshotAs(OutputType.FILE);
				File target2 = new File(screenshotName2);
				FileHandler.copy(Src2, target2);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
				String screenshotName3 = "./DealsDrayScreenshotsForFirefox/Desk_fox1920_3-" + timestamp + ".png";
				File Src3 = Ts.getScreenshotAs(OutputType.FILE);
				File target3 = new File(screenshotName3);
				FileHandler.copy(Src3, target3);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
				String screenshotName4 = "./DealsDrayScreenshotsForFirefox/Desk_fox1920_4-" + timestamp + ".png";
				File Src4 = Ts.getScreenshotAs(OutputType.FILE);
				File target4 = new File(screenshotName4);
				FileHandler.copy(Src4, target4);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/calley-zoho-crm-integration/")).click();
				String screenshotName5 = "./DealsDrayScreenshotsForFirefox/Desk_fox1920_5-" + timestamp + ".png";
				File Src5 = Ts.getScreenshotAs(OutputType.FILE);
				File target5 = new File(screenshotName5);
				FileHandler.copy(Src5, target5);
				driver1.navigate().back();
				
				driver1.quit();
			}
			
			//For 1366×768 resolution
			public static void TestinFirefox2()throws InterruptedException, IOException {
				
				WebDriver driver1=new FirefoxDriver();
				
				driver1.manage().window().setSize(new Dimension(1366,768));
				driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver1.navigate().to("https://www.getcalley.com/page-sitemap.xml");
				
				Thread.sleep(2000);
				String timestamp = getCurrentTimestamp();
				driver1.findElement(By.linkText("https://www.getcalley.com/")).click();
				String screenshotName1 = "./DealsDrayScreenshotsForFirefox/Desk_fox1366_1-" + timestamp + ".png";
				TakesScreenshot Ts=(FirefoxDriver) driver1;
				File Src = Ts.getScreenshotAs(OutputType.FILE);
				File target = new File(screenshotName1);
				FileHandler.copy(Src, target);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
				String screenshotName2 = "./DealsDrayScreenshotsForFirefox/Desk_fox1366_2-" + timestamp + ".png";
				File Src2 = Ts.getScreenshotAs(OutputType.FILE);
				File target2 = new File(screenshotName2);
				FileHandler.copy(Src2, target2);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
				String screenshotName3 = "./DealsDrayScreenshotsForFirefox/Desk_fox1366_3-" + timestamp + ".png";
				File Src3 = Ts.getScreenshotAs(OutputType.FILE);
				File target3 = new File(screenshotName3);
				FileHandler.copy(Src3, target3);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
				String screenshotName4 = "./DealsDrayScreenshotsForFirefox/Desk_fox1366_4-" + timestamp + ".png";
				File Src4 = Ts.getScreenshotAs(OutputType.FILE);
				File target4 = new File(screenshotName4);
				FileHandler.copy(Src4, target4);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/calley-zoho-crm-integration/")).click();
				String screenshotName5 = "./DealsDrayScreenshotsForFirefox/Desk_fox1366_5-" + timestamp + ".png";
				File Src5 = Ts.getScreenshotAs(OutputType.FILE);
				File target5 = new File(screenshotName5);
				FileHandler.copy(Src5, target5);
				driver1.navigate().back();
				
				driver1.quit();
			}
			
			//For 1536×864  resolution
			public static void TestinFirefox3()throws InterruptedException, IOException {
				
				WebDriver driver1=new FirefoxDriver();
				
				driver1.manage().window().setSize(new Dimension(1536,864));
				driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver1.navigate().to("https://www.getcalley.com/page-sitemap.xml");
				
				Thread.sleep(2000);
				String timestamp = getCurrentTimestamp();
				driver1.findElement(By.linkText("https://www.getcalley.com/")).click();
				String screenshotName1 = "./DealsDrayScreenshotsForFirefox/Desk_fox1536_1-" + timestamp + ".png";
				TakesScreenshot Ts=(FirefoxDriver) driver1;
				File Src = Ts.getScreenshotAs(OutputType.FILE);
				File target = new File(screenshotName1);
				FileHandler.copy(Src, target);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
				String screenshotName2 = "./DealsDrayScreenshotsForFirefox/Desk_fox1536_2-" + timestamp + ".png";
				File Src2 = Ts.getScreenshotAs(OutputType.FILE);
				File target2 = new File(screenshotName2);
				FileHandler.copy(Src2, target2);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
				String screenshotName3 = "./DealsDrayScreenshotsForFirefox/Desk_fox1536_3-" + timestamp + ".png";
				File Src3 = Ts.getScreenshotAs(OutputType.FILE);
				File target3 = new File(screenshotName3);
				FileHandler.copy(Src3, target3);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
				String screenshotName4 = "./DealsDrayScreenshotsForFirefox/Desk_fox1536_4-" + timestamp + ".png";
				File Src4 = Ts.getScreenshotAs(OutputType.FILE);
				File target4 = new File(screenshotName4);
				FileHandler.copy(Src4, target4);
				driver1.navigate().back();
				
				Thread.sleep(2000);
				driver1.findElement(By.linkText("https://www.getcalley.com/calley-zoho-crm-integration/")).click();
				String screenshotName5 = "./DealsDrayScreenshotsForFirefox/Desk_fox1536_5-" + timestamp + ".png";
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
