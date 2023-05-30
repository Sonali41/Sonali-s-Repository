package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
	
	//Method or Annotation is enabled or disabled
	//flag default value true
	//boolean default value false
	//possible to use multiple flags for annotations
  @Test(enabled = false, description = "Login method")
  public void method() 
  {
	  Reporter.log("Login Performed!", true);
  }
  
  @Test(enabled = true, description = "Logout method")
  public void method2()
  {
	  Reporter.log("Logout performed!", true);
  }
}
