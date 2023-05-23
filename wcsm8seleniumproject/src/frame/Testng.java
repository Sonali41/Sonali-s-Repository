package frame;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import keywordDrivenPackage.IAutoConstant;

public class Testng implements IAutoConstant {
  @Test
  public void chromebrowser() {
	  //System.setProperty(CHROME_KEY, CHROME_PATH);
	 // ChromeOptions co = new ChromeOptions();
	 // co.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://www.selenium.dev/");
	  
  }
}
