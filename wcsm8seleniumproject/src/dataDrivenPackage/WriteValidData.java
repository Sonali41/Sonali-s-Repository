package dataDrivenPackage;

import java.io.IOException;

public class WriteValidData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Flib flib = new Flib();
		
		flib.writeExcelData("./datafiles/ActiTimeTestData.xlsx", "ValidData", 0, 2, "LoginButton");
		flib.writeExcelData("./datafiles/ActiTimeTestData.xlsx", "ValidData", 1, 2, "Login");
	}

}
