package pageObjectModel;

public class ConfirmationPopup extends BaseTest {
	
	public void popup()
	{
		driver.switchTo().alert().accept();
	}


}
