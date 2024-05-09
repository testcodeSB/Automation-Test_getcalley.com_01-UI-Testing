package DealsDrayAutomationTestforMobile;

import java.io.IOException;

import DealsDrayAutomationTest.ToTestgetcalleyinChrome;

public class ToTestgetcalleyMobile extends ToTestgetcalleyinChromeforMobile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		TestinChrome1(); //For 1920×1080 Resolution
		TestinChrome2(); //For 1366×768 Resolution
		TestinChrome3(); //For 1536×864 Resolution
		
		
		TestinFirefox1(); //For 1920×1080 Resolution
		TestinFirefox2(); //For 1366×768 Resolution
		TestinFirefox3(); //For 1536×864 Resolution

	}

}
