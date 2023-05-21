package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	
	@FindBy(xpath="//input[@value='Create New User']") private WebElement createNewUser;
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="passwordText") private WebElement passwordTB;
	@FindBy(name="passwordTextRetype") private WebElement retypePass;
	@FindBy(name="firstName") private WebElement firstName;
	@FindBy(name="lastName") private WebElement lastName;
	@FindBy(xpath="//input[@type='submit']") private WebElement createUser;
	@FindBy(xpath="/HTML/BODY/DIV/FORM/TABLE/TBODY/TR[4]/TD/INPUT[2]") private WebElement cancel;
	@FindBy(xpath="//a[text()='B, A (testEng)']") private WebElement link;
	@FindBy(xpath="//input[@value='Delete This User']") private WebElement deleteUser;
	
	//initialization
	public UserListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getCreateNewUser() {
		return createNewUser;
	}
    public WebElement getUsernameTB() {
		return usernameTB;
	}
    public WebElement getPasswordTB() {
		return passwordTB;
	}
    public WebElement getRetypePass() {
		return retypePass;
	}
    public WebElement getFirstName() {
		return firstName;
	}
    public WebElement getLastName() {
		return lastName;
	}
	public WebElement getCreateUser() {
		return createUser;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getLink() {
		return link;
	}
	public WebElement getDeleteUser() {
		return deleteUser;
	}
	
	//Operational Methods
	public void CreateUser(String usn, String pw, String fn, String ln) throws InterruptedException
	{
		createNewUser.click();
		Thread.sleep(1000);
		usernameTB.sendKeys(usn);
		Thread.sleep(1000);
		passwordTB.sendKeys(pw);
		Thread.sleep(1000);
		retypePass.sendKeys(pw);
		Thread.sleep(1000);
		firstName.sendKeys(fn);
		Thread.sleep(1000);
		lastName.sendKeys(ln);
		createUser.click();
	}
	
	public void deleteUser() throws InterruptedException
	{
		link.click();
		Thread.sleep(1000);
		deleteUser.click();
		ConfirmationPopup cp = new ConfirmationPopup();
		cp.popup();
	}
	
	

}
