package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		Dimension dsize = new Dimension(550, 550);
		driver.manage().window().setSize(dsize);
		
		Thread.sleep(2000);
		
		Point pposition = new Point(150, 150);
		driver.manage().window().setPosition(pposition);
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
