package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass 
{
	public static String userdataexcel(int row, int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile = new FileInputStream("E:\\JAVA\\selenium\\kite data.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		 String value = mysheet.getRow(row).getCell(col).getStringCellValue();
		return value;			
	}
	
	public static String getdatafromproperty(String key) throws EncryptedDocumentException, IOException
	{
		Properties prop = new Properties();
		FileInputStream myfile = new FileInputStream("C:\\Users\\online comp\\eclipse-workspace\\123\\kiteproperties.properties");
		prop.load(myfile);
		 String value = prop.getProperty(key);
		return value;			
	}
	
	public static void screenshot(WebDriver driver,int TCID) throws IOException
	{		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\JAVA\\screenshot\\Testcase"+TCID+".png");
		FileHandler.copy(src, dest);
	}
	
	
}
