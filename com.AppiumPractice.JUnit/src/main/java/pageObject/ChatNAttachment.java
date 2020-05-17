package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChatNAttachment {
	
public ChatNAttachment (AndroidDriver<AndroidElement> driver){
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="nz.co.celo.app.staging:id/attach_button")
	public WebElement attachmentIcon;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/attach_option_library")
	public WebElement celoSceurePhotosBtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='DONE']")
	public WebElement doneBtn;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/input_edit_text")
	public WebElement chatbox;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/send_button")
	public WebElement chatboxSendBtn;
	
	
	
	
	

}
