package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  
	  //System.out.println("Hii TestNG");//If only print then will get only in console 
	  //To get in report use Reporter
	  Reporter.log("Hii TestNG!!!", true);//will get in report only
  }
  
 // @Test 
//  public void g() {
//  
//	  System.out.println("Hey Java!!!");
//	  Reporter.log("Hey Java", true);//will get in console as well as report
//  }
}
