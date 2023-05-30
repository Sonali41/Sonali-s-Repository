package testNGflags;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag {
	
	//used to run skipped test case
  
	@Test(description = "Login TestCase")
    public void loginMethod() 
     {
		Reporter.log("Login performed!", true);
     }
	
	@Test(description = "Create User TestCase", dependsOnMethods = "loginMethod")
	public void createUserMethod() 
	  {
		Assert.fail();	
		Reporter.log("User is created!", true);
	  }
	
	@Test(description = "Logout TestCase", dependsOnMethods = "createUserMethod", alwaysRun = true)
	public void logoutMethod() 
	  {
			Reporter.log("Logout performed!", true);
	  }
}
