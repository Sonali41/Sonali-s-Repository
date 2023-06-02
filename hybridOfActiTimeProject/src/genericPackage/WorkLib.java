package genericPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorkLib extends BaseTest {
	
 //Handle Popup
  public void acceptAlert()
  {
	  driver.switchTo().alert().accept();
  }

  public void dismissAlert()
  {
	  driver.switchTo().alert().dismiss();
  }
  
  public void acceptConfirmation()
  {
	  driver.switchTo().alert().accept();
  }

  public void dismissConfirmation()
  {
	  driver.switchTo().alert().dismiss();
  }

  //Handle Mouse Actions
  public void rightClick(WebElement target)
  {
	  Actions act = new Actions(driver);
	  act.contextClick(target).perform();
  }
  
  public void mouseHover(WebElement target)
  {
	 Actions act =new Actions(driver);
	 act.moveToElement(target).perform();
  }
  
  public void doubleClick(WebElement target)
  {
	 Actions act =new Actions(driver);
	 act.doubleClick(target).perform();
  }
  
  public void dragDrop(WebElement src, WebElement target)
  {
	 Actions act =new Actions(driver);
	 act.dragAndDrop(src, target).perform();
  }
  
  //Handle Frame
  public void handleFrameByIndex(int index)
  {
	  driver.switchTo().frame(index);
  }
  
  public void handleFrameByNameorId(String NameorId)
  {
	  driver.switchTo().frame(NameorId);
  }
  
  public void handleFrameByFrameElement(WebElement frame)
  {
	  driver.switchTo().frame(frame);
  }
  
  //Handle Dropdown
  public void handleDropdown(WebElement element, int index)
  {
	  Select sel = new Select(element);
	  sel.selectByIndex(index);
  }
}
