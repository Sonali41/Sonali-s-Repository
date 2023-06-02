package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.WorkLib;

public class TaskListPage {
	
	@FindBy(xpath = "//a[.='Open Tasks']") private WebElement OpenTaskModule;
	@FindBy(xpath = "//a[.='Completed Tasks']") private WebElement CompletedTaskModule;
	@FindBy(xpath = "//a[.='Projects & Customers']") private WebElement Projects_CustomersModule;
	@FindBy(xpath = "//a[.='Archives']") private WebElement Archives;
	@FindBy(xpath = "//input[@value='Create New Customer']") private WebElement CNCustomerButton;
	@FindBy(xpath = "//input[@value='Create New Project']") private WebElement CNProjectButton;
	@FindBy(xpath = "//*[@name='name']") private WebElement CustomerNameTB;
	@FindBy(xpath = "//input[@type='submit']") private WebElement CreateCustomerButton;
	@FindBy(xpath = "//input[@onclick='cancelCustomerCreation();']") private WebElement CancelCustomerButton;
	@FindBy(xpath = "//*[@name='customerId']") private WebElement ProjectDd;
	@FindBy(xpath = "//*[@name='name']") private WebElement ProjectNameTB;
	@FindBy(xpath = "//*[@name='createProjectSubmit']") private WebElement CreateProjectButton;
	@FindBy(xpath = "//input[@onclick='cancelProjectCreation();']") private WebElement CancelProjectButton;
	
	//Initialization
		public TaskListPage(WebDriver driver)//name same as classname
		{
			PageFactory.initElements(driver, this);
		}
		
	//Utilization
	public WebElement getOpenTaskModule() {
		return OpenTaskModule;
	}
	public WebElement getCompletedTaskModule() {
		return CompletedTaskModule;
	}
	public WebElement getProjects_CustomersModule() {
		return Projects_CustomersModule;
	}
	public WebElement getArchives() {
		return Archives;
	}
	public WebElement getCNCustomerButton() {
		return CNCustomerButton;
	}
	public WebElement getCNProjectButton() {
		return CNProjectButton;
	}
	public WebElement getCustomerNameTB() {
		return CustomerNameTB;
	}
	public WebElement getCreateCustomerButton() {
		return CreateCustomerButton;
	}
	public WebElement getCancelCustomerButton() {
		return CancelCustomerButton;
	}
	public WebElement getProjectDd() {
		return ProjectDd;
	}
	public WebElement getProjectNameTB() {
		return ProjectNameTB;
	}
	public WebElement getCreateProjectButton() {
		return CreateProjectButton;
	}
	public WebElement getCancelProjectButton() {
		return CancelProjectButton;
	} 
	
	
//Operational methods
	public void createNewCustomer(String custName) throws InterruptedException
	{
		Projects_CustomersModule.click();
		CNCustomerButton.click();
		CustomerNameTB.sendKeys(custName);
		Thread.sleep(2000);
		CreateCustomerButton.click();
	}
	
	public void createNewProject( int index, String projName) throws InterruptedException
	{
	   CNProjectButton.click();
	   WorkLib wl = new WorkLib();
	   wl.handleDropdown(ProjectDd, index);
	   ProjectNameTB.sendKeys(projName);
	   Thread.sleep(2000);
	   CreateProjectButton.click();
	}
	
	
	
	

}

