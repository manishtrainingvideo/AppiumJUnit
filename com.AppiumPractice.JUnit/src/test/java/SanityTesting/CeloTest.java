package SanityTesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.Camera;
import pageObject.ChatNAttachment;
import pageObject.Directory;
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
	SearchFunctionality sf= new SearchFunctionality(driver);
	ChatNAttachment cna = new ChatNAttachment(driver);
	ScrollFeature scrollfe = new ScrollFeature(driver);
	Directory dr= new Directory(driver);
	
	
	Thread.sleep(3000);
	//-------------------------Search Group and send attachment photo and text message 
	

	sf.searchIcon.click();
	sf.searchInputName.sendKeys("Test 50 group");
	Thread.sleep(3000);
	sf.searchGroup.click();
	Thread.sleep(2000);
	cna.attachmentIcon.click();
	Thread.sleep(2000);
	cna.celoSceurePhotosBtn.click();
	Thread.sleep(5000);		
	scrollfe.scroll("April 2020");
	
	Thread.sleep(2000);
	scrollfe.scroll("May 2020");
	
	lb.imageClick.get(0).click();
	cna.doneBtn.click();
	Thread.sleep(3000);
	cna.chatbox.sendKeys("Test Message");
	cna.chatboxSendBtn.click();
	Thread.sleep(5000);
	cs.takeScreenshot();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	//------------------Search Single user and send attachment photo and text message 
	
	sf.searchIcon.click();
	sf.searchInputName.sendKeys("Aravind Staging");
	Thread.sleep(5000);
	sf.searchSingleUser.click();
	Thread.sleep(2000);
	cna.attachmentIcon.click();
	Thread.sleep(2000);
	cna.celoSceurePhotosBtn.click();
	Thread.sleep(5000);		
	scrollfe.scroll("April 2020");
	
	Thread.sleep(2000);
	scrollfe.scroll("May 2020");
	
	lb.imageClick.get(0).click();
	cna.doneBtn.click();
	Thread.sleep(3000);
	cna.chatbox.sendKeys("Test Message");
	cna.chatboxSendBtn.click();
	Thread.sleep(5000);
	cs.takeScreenshot();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	// -------------------Directory module functionality------------------------
	
	dr.directoryBtn.click();
	
	scrollfe.scroll("Venu Bhamidi");
	Thread.sleep(2000);
	scrollfe.scroll("Barco Zaleta12");
	Thread.sleep(2000);
	dr.celotestWorksplace.click();
	Thread.sleep(2000);
	dr.celoWorkspace.click();
	dr.celotestWorksplace.click();
	dr.myWorksplace.click();
	
	
	//-----------------------Camera-----------------------------------
	
	ca.cameraModuleBtn.click();
	ca.cameraAllowPopup.click();
	Thread.sleep(2000);
	ca.captureBtn.click();
	ca.cameraSaveBtn.click();
	Thread.sleep(10000);
	ca.imageClick.get(0).click();
	ca.cameraShareBtn.click();
	ca.selectUser.click();
	ca.sendPhotoBtn.click();
	
	
	
	//----------------------------- Library feature-------------------------------
	
	lb.libraryModuleBtn.click();
	
	Thread.sleep(3000);		
	scrollfe.scroll("April 2020");
	
	Thread.sleep(2000);
	scrollfe.scroll("May 2020");
	
	lb.imageClick.get(0).click();
	lb.shareBtn.click();
	lb.clickOUserName.click();
	lb.sendPhotoBtn.click();
	Thread.sleep(5000);
	lb.timeView.click();
	Thread.sleep(3000);
	cs.takeScreenshot();
	Thread.sleep(3000);
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	Thread.sleep(3000);
	
	//---------------------------MoreModule-----------------------------------
	
	mm.moreModule.click();
	
	scrollfe.scroll("Logout");
			
	//mm.logOutButton.click();

}
}