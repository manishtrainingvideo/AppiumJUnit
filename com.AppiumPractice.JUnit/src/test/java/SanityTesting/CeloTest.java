package SanityTesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.Camera;
import pageObject.Library;
import pageObject.MoreModule;
import pageObject.SearchFunctionality;
import utilities.CaptureScreenshot;
import utilities.CeloBase;
import utilities.ScrollFeature;


public class CeloTest extends CeloBase{
	
	@Test
	public void testRun() throws IOException, InterruptedException{
	AndroidDriver<AndroidElement> driver= capabilities();
	
	Library lb= new Library(driver);
	MoreModule mm= new MoreModule(driver);
	Camera ca= new Camera(driver);
	CaptureScreenshot cs= new CaptureScreenshot(driver);
	ScrollFeature sf= new ScrollFeature(driver);
	
	// Library feature
	
	lb.libraryModuleBtn.click();
	
	Thread.sleep(5000);		
	sf.scroll("April 2020");
	
	Thread.sleep(2000);
	sf.scroll("May 2020");
	
	lb.imageClick.get(0).click();
	lb.shareBtn.click();
	lb.clickOUserName.click();
	//lb.sendPhotoBtn.click();
	Thread.sleep(5000);
	lb.timeView.click();
	Thread.sleep(2000);
	cs.takeScreenshot();
	driver.navigate().back();
	driver.navigate().back();
	
	//Camera
	
	ca.cameraModuleBtn.click();
	ca.cameraAllowPopup.click();
	ca.captureBtn.click();
	ca.cameraSaveBtn.click();
	Thread.sleep(10000);
	ca.imageClick.get(0).click();
	ca.cameraShareBtn.click();
	ca.selectUser.click();
	ca.sendPhotoBtn.click();
	
	//MoreModule
	
	mm.moreModule.click();
	
	sf.scroll("Logout");
			
	//mm.logOutButton.click();

}
}