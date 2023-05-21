package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText = "Logout") private WebElement logoutLink;
	@FindBy(xpath = "//A[@class='content tt_selected selected']/DIV[2]/IMG") private WebElement Timetrack;
	@FindBy(xpath = "//A[@class='content tasks']/IMG[@class='sizer']") private WebElement tasks;
	@FindBy(xpath = "//A[@class='content reports']/IMG[@class='sizer']") private WebElement reports;
	@FindBy(xpath = "//A[@class='content users']/IMG[@class='sizer']") private WebElement users;
	
   //initialization
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
    
	//Utilization
	public WebElement getLogoutLink() {
		return logoutLink;
	}
    public WebElement getTimetrack() {
		return Timetrack;
	}
    public WebElement getTasks() {
		return tasks;
	}
    public WebElement getReports() {
		return reports;
	}
    public WebElement getUsers() {
		return users;
	}
    
    //operational methods
    public void logoutMethod()
    {
    	logoutLink.click();
    }
    
    public void TimetrackModule()
    {
    	Timetrack.click();
    }
    
    public void tasksModule()
    {
    	tasks.click();
    }
    
    public void reportsModule()
    {
    	reports.click();
    }
    
    public void usersModule()
    {
    	users.click();
    }
	
	
	

}
