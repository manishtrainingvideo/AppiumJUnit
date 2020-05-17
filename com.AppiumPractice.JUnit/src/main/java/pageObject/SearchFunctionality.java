package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchFunctionality {
	
	public SearchFunctionality (AndroidDriver<AndroidElement> driver){
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/action_search")
	public WebElement searchIcon;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/search_src_text")
	public WebElement searchInputName;
	
//	@AndroidFindBy(id="android:id/text1")
//	private WebElement dropdown;
//	
//	public WebElement getdropdown(){
//		
//		return dropdown;
//	}
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Test 50 group']")
	public WebElement searchGroup;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Aravind Staging']")
	public WebElement searchSingleUser;
	
	
	

}
