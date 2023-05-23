package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest2 {
	@Test
	  public void g() 
	  {
		  Reporter.log("g method from DemoTest3", true);
	  }
	
	@Test
	  public void h() 
	  {
		  Reporter.log("h method from DemoTest3", true);
	  }

	
	@Test
	  public void i() 
	  {
//		  int i=10;
//		  int j=0;
//		  int res=i/j;
		  Reporter.log("a method from DemoTest3", true);
	  }


}
