package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
	
	//Always test cases are going to execute in alphabetical manner
  @Test(priority = 4)
  public void method1() 
  {
	  Reporter.log("From method1", true);
  }
  
  @Test(priority = 3)
  public void method2()
  {
	  Reporter.log("From method2", true);
  }
  
  @Test(priority = 2)
  public void method3()
  {
	  Reporter.log("From method3", true);
  } 
  
  
  @Test(priority = 1)
  public void method4()
  {
	  Reporter.log("From method4", true);
  } 
  
  @Test(priority = 0)
  public void method5()
  {
	  Reporter.log("From method5", true);
  } 
  
  @Test(priority = 0)
  public void method6()
  {
	  Reporter.log("From method6", true);
  } 
  
  @Test(priority = -1)
  public void method7()
  {
	  Reporter.log("From method7", true);
  } 
  
  
  @Test(priority = -2)
  public void method8()
  {
	  Reporter.log("From method8", true);
  } 
  
}
