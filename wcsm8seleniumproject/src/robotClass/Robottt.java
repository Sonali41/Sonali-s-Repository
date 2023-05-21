package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robottt {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_P);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CANCEL);
		robot.keyRelease(KeyEvent.VK_CANCEL);
		
//		robot.keyPress(KeyEvent.VK_ALT);
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_ALT);
//		robot.keyRelease(KeyEvent.VK_TAB);
	}

}
