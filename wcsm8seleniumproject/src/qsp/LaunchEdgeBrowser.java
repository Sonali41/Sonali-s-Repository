package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	public static void main(String[] args) throws InterruptedException {
  		// TODO Auto-generated method stub
     System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		
     EdgeDriver driver = new EdgeDriver();
     Thread.sleep(2000);
            //stop the execution of script for 2secs
     driver.close();
	}


}
