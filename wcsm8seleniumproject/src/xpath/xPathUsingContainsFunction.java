package xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xPathUsingContainsFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.airindia.in/");
		
		driver.findElement(By.xpath("//input[contains(@id,'from')]")).sendKeys("Pune");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@id='ui-id-536']")).click();
		driver.findElement(By.xpath("//a[text()='Pune, Lohegaon Airport, PNQ, India, IN']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).sendKeys("Seoul");
		//driver.findElement(By.xpath("//a[contains(@id,'ui-id-484')]")).click();
		driver.findElement(By.xpath("//a[text()='Seoul, Incheon International Airport, ICN, South Korea, KR']")).click();
		driver.findElement(By.xpath("//input[@id='_depdateeu1']")).click();
		driver.findElement(By.linkText("8")).click();
		
		
		
		//driver.findElement(By.xpath("//div[contains(text(),'CCU')]")).click();
		

	}

}
