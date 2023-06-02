package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.WorkLib;


public class UsersPage {
	
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
	@FindBy(xpath = "//*[@id='right12']") private WebElement ModifyTimeTrack;
	@FindBy(xpath = "//*[@id='right2']") private WebElement ManageProj_Cust;
	@FindBy(xpath = "//*[@id='right1']") private WebElement GenerateReports;
	@FindBy(xpath = "//*[@id='right5']") private WebElement ManageUsers;
	@FindBy(xpath = "//*[@id='right7']") private WebElement ManageBillingTypes;
	@FindBy(xpath = "//*[@id='right10']") private WebElement ManageWorkSchedule;
	
	//initialization
	public UsersPage(WebDriver driver)//should be always sameeeee
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
	public WebElement getModifyTimeTrack() {
		return ModifyTimeTrack;
	}

	public WebElement getManageProj_Cust() {
		return ManageProj_Cust;
	}

	public WebElement getGenerateReports() {
		return GenerateReports;
	}

	public WebElement getManageUsers() {
		return ManageUsers;
	}

	public WebElement getManageBillingTypes() {
		return ManageBillingTypes;
	}

	public WebElement getManageWorkSchedule() {
		return ManageWorkSchedule;
	}
	
	//Operational Methods
	public void CreateNewUser(String usn, String pw, String fn, String ln) throws InterruptedException
	{
		Thread.sleep(1000);
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
	}
	
	public void deleteUser() throws InterruptedException	
	{
		link.click();
		Thread.sleep(1000);
		deleteUser.click();
		WorkLib wl = new WorkLib();
		wl.acceptConfirmation();
	}
	
	 public void selectCheckBox()
	    {
	    	ModifyTimeTrack.click();
	    	ManageProj_Cust.click();
	    	GenerateReports.click();
	    	ManageUsers.click();
	    	ManageBillingTypes.click();
	    	ManageWorkSchedule.click();
	    }

	 public void createManager()
	 {
		 createUser.click();
	 }
	
	


}
