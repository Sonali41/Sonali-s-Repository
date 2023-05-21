package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	 WebDriver driver=new ChromeDriver(co);
	 driver.manage().window().maximize();
	 
	 Thread.sleep(2000);
	 driver.get("https://www.instagram.com/");
	 
	 System.out.println(driver.getTitle());
	 
	 
	 

	}

}
