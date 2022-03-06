import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValueDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//load file data into java class
		Properties p=new Properties();
		FileInputStream f_is=new FileInputStream("C:\\Users\\ABHISHEK KUMAR\\Selenium_Workspace\\selenium_practice\\src\\data.properties");
		p.load(f_is);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));
		
		p.setProperty("url", "facebook.com");
		
		//load java class modification to property file
		FileOutputStream f_os=new FileOutputStream("C:\\\\Users\\\\ABHISHEK KUMAR\\\\Selenium_Workspace\\\\selenium_practice\\\\src\\\\data.properties");
		p.store(f_os, null);
		System.out.println(p.getProperty("url"));
		
		

	}

}
