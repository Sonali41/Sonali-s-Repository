package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	//used to switch the control of method by priority 
  
	@Test(description = "Login TestCase")
    public void loginMethod() 
     {
		Reporter.log("Login performed!", true);
     }
	
	@Test(description = "Create User TestCase", dependsOnMethods = "loginMethod")
	public void createUserMethod() 
	  {
			Reporter.log("User is created!", true);
	  }
	
	@Test(description = "Logout TestCase", dependsOnMethods = "createUserMethod")
	public void logoutMethod() 
	  {
			Reporter.log("Logout performed!", true);
	  }
}
