package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Directory {
	
public Directory(AndroidDriver<AndroidElement> driver){
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="nz.co.celo.app.staging:id/bb_directory")
	public WebElement directoryBtn; 
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/company_name")
	public WebElement celotestWorksplace; 
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Celo']")
	public WebElement celoWorkspace;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/itemTextView")
	public WebElement myWorksplace;
	
	
	
}
