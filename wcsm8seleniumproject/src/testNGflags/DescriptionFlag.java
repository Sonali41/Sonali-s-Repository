package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
	
	//To describe the method
  @Test(description = "This method performs login!!!")
  public void method1()
  {
	  Reporter.log("Method1 Login!", true);
  }
}
