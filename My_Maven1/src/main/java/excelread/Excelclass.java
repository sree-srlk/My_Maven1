package excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelclass 
{
   XSSFSheet sh;
   public Excelclass() throws IOException
   {
	  FileInputStream f=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\My_Maven1\\src\\main\\resources\\FRUITS.xlsx"); 
 XSSFWorkbook w=new XSSFWorkbook(f);
	  sh=w.getSheet("Sheet1");
	}
     public void readdata()
     {
    	 for(Row r:sh) {
    	  for(Cell c:r) {
    		  System.out.println(c);
    	  }
    	  
    	 }
     }
}
