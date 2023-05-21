package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="pwd") private WebElement passwordTB;
	@FindBy(id="loginButton") private WebElement loginBt;
	@FindBy(linkText = "Actimind Inc.") private WebElement actiLink;
	@FindBy(id="licenseLink") private WebElement licenseLink;
	
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}

    public WebElement getPasswordTB() {
		return passwordTB;
	}
    public WebElement getLoginBt() {
		return loginBt;
	}
    public WebElement getActiLink() {
		return actiLink;
	}
    public WebElement getLicenseLink() {
		return licenseLink;
	}
    
    
	//Operational method
    public void validLogin(String validun, String validpw)
    {
    	usernameTB.sendKeys(validun);
    	passwordTB.sendKeys(validpw);
    	loginBt.click();
    }
    
    public void invalidLogin(String invalidun, String invalidpw) throws InterruptedException
    {
    	usernameTB.sendKeys(invalidun);
    	passwordTB.sendKeys(invalidpw);
    	loginBt.click();
    	Thread.sleep(2000);
    	usernameTB.clear();
    }
	
	
	
	

}
