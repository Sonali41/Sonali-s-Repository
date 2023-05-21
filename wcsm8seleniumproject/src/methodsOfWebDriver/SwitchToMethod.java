package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
	    driver.manage().window().maximize();
	    
	    driver.navigate().to("https://www.instagram.com/");
	    
	    driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);

	}

}
