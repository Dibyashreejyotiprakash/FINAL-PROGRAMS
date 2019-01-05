package FILE_READER;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertFileReader {

	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\MY SELENIUM\\BHANUPRATAPFRAMEWORK\\PROGRAMME_PRACTICE\\src\\test.property");
		FileInputStream fis=new FileInputStream(f);	
		Properties p=new Properties();
		p.load(fis);
		p.getProperty("name");
		p.getProperty("place");
		
		
	}
}
