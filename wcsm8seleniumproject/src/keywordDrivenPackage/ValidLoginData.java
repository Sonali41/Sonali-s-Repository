package keywordDrivenPackage;

import java.io.IOException;

public class ValidLoginData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Flib flib = new Flib();
		
		String un = flib.readPropertyData("./datafiles/config.properties", "password");
		System.out.println(un);

	}

}
