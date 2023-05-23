package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 {
	@Test
	  public void d() 
	  {
		  Reporter.log("d method from DemoTest3", true);
	  }
	
	@Test
	  public void e() 
	  {
		  Reporter.log("e method from DemoTest3", true);
	  }
	
	@Test
	  public void f() 
	  {
		  Reporter.log("f method from DemoTest3", true);
	  }



}
