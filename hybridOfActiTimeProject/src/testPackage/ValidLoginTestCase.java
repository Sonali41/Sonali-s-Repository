package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListners;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TaskListPage;
import pagePackage.UsersPage;
@Listeners(CustomListners.class)
public class ValidLoginTestCase extends BaseTest {
	
     @Test
     public void validTestCase() throws IOException, InterruptedException
     {
    	 BaseTest bt = new BaseTest();
    	 bt.setUp();
    	 Flib flib = new Flib();
    	 LoginPage lp = new LoginPage(driver);
    	 lp.validLogin(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
    	 Thread.sleep(2000);
    	 HomePage hp = new HomePage(driver);
    	 hp.usersModule();
    	 Thread.sleep(2000);
    	 UsersPage up = new UsersPage(driver);
    	 up.CreateNewUser(flib.readExcelData(EXCEL_PATH, "Manager", 1, 0), flib.readExcelData(EXCEL_PATH, "Manager", 1, 1),
    			 flib.readExcelData(EXCEL_PATH, "Manager", 1, 2), flib.readExcelData(EXCEL_PATH, "Manager", 1, 3));
    	 Thread.sleep(2000);
    	 up.selectCheckBox();
    	 Thread.sleep(2000);
    	 up.createManager();
    	 Thread.sleep(2000);
    	 hp.tasksModule();
    	 TaskListPage tls = new TaskListPage(driver);
    	 tls.createNewCustomer(flib.readExcelData(EXCEL_PATH, "CustomerAndProject", 1, 0));
    	 Thread.sleep(2000);
    	 tls.createNewProject(1,flib.readExcelData(EXCEL_PATH, "CustomerAndProject", 1, 1));
     }
}
