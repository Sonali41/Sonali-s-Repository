package pageObjectModel;

import java.io.IOException;

public class CreateNewUser extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
		HomePage hp = new HomePage(driver);
		hp.usersModule();
		Thread.sleep(2000);
		
		
		UserListPage ulp = new UserListPage(driver);
		
		
		short cc = flib.cellCount(EXCEL_PATH, "CreateUser", 1);
		
//		for(int i=0; i<cc; i++)
//		{
//		String ed = flib.readExcelData(EXCEL_PATH, "CreateUser", 1, i);
//		System.out.println(ed);
//		}
		
		String usn = flib.readExcelData(EXCEL_PATH, "CreateUser", 1, 0);
		String pw = flib.readExcelData(EXCEL_PATH, "CreateUser", 1, 1);
		String fn = flib.readExcelData(EXCEL_PATH, "CreateUser", 1, 2);
		String ln = flib.readExcelData(EXCEL_PATH, "CreateUser", 1, 3);
		
		ulp.CreateUser(usn, pw, fn, ln);
		Thread.sleep(2000);
		ulp.deleteUser();
		
		

	}

}
