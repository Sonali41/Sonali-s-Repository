package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	
	//used to execute method or annotations multiple times
	//default value is 1
  @Test(invocationCount = 10 )
  public void method()
  {
	  Reporter.log("Login Test Case", true);
  }
}





