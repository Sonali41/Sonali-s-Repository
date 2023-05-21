package readPropertyDataKDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./datafiles/config.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String username = prop.getProperty("username");
		
		System.out.println(username);
		
		

	}

}
