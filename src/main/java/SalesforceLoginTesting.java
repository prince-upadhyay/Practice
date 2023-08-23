import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SalesforceLoginTesting 
{
public static void main(String[] args) throws IOException
{
	FileInputStream fis=new FileInputStream("C://Users//TC User 2//Desktop//LoginData.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	int sheets=workbook.getNumberOfSheets();
	
	for(int i=0;i<sheets;i++)
	{
		if(workbook.getSheetName(i).equalsIgnoreCase("credentials"));
		{
			XSSFSheet sheet=workbook.getSheetAt(i);
			Iterator<Row> rows= sheet.rowIterator();//Sheet s a collection of rows
			Row firstrow=rows.next();
			Iterator<Cell> cell=firstrow.cellIterator();//collection of cells 
			while(cell.hasNext())
			{
			Cell value=cell.next();
			if (value.getStringCellValue().equals("Message"))
			{
				//System.out.println(value);
			}
			}
			}
			}
	    }
	
}
		  
		
	

