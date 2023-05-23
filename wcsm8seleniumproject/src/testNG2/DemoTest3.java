package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest3 {
  @Test
  public void a() 
  {
	  Reporter.log("a method from DemoTest3", true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("b method from DemoTest3", true);
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("c method from DemoTest3", true);
  }


}
