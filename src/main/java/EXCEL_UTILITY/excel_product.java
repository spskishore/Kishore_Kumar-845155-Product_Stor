package EXCEL_UTILITY;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_product {

	
 static String filename="src\\test\\resources\\TESTDATA\\data.xlsx";
 static String sheetname="demoblaze";
 
 protected static String[][]testdata; 
 public static int rowno,colno; 

	public  void get_test_data(){
		
		testdata=new String[2][8];
		
	   for(rowno=0;rowno<=1;rowno++){
		   
		                        try{
			                          
		                       System.out.println("in get test data row: " +rowno);
		                               File f=new File(filename);
		                               FileInputStream fis = new FileInputStream(f);
			                           XSSFWorkbook wb = new XSSFWorkbook(fis);
			                           XSSFSheet sh = wb.getSheet(sheetname);
			                           XSSFRow r = sh.getRow(rowno);
			                           
			                           XSSFCell cell1 = r.getCell(0);
			                           testdata[rowno][0]=cell1.getStringCellValue();
			                           System.out.println(testdata[rowno][0]);
			                          
			                           
			                           XSSFCell cell2 = r.getCell(1);			                         
			                           testdata[rowno][1]=cell2.getStringCellValue();
			                           System.out.println(testdata[rowno][1]);
			                           
			                           XSSFCell cell3 = r.getCell(2);			                          
			                           testdata[rowno][2]=cell3.getStringCellValue();
			                           System.out.println(testdata[rowno][2]);
			                           
			                           XSSFCell cell4 = r.getCell(3);			                          
			                           testdata[rowno][3]=cell4.getStringCellValue();
			                           System.out.println(testdata[rowno][3]);
			                           
			                           XSSFCell cell5 = r.getCell(4);			                          
			                           testdata[rowno][4]=cell5.getStringCellValue();
			                           System.out.println(testdata[rowno][4]);
			                           
			                           XSSFCell cell6 = r.getCell(5);			                          
			                           testdata[rowno][5]=cell6.getStringCellValue();
			                           System.out.println(testdata[rowno][5]);
			                           
			                           XSSFCell cell7 = r.getCell(6);			                          
			                           testdata[rowno][6]=cell7.getStringCellValue();
			                           System.out.println(testdata[rowno][6]);
			                           
			                           XSSFCell cell8 = r.getCell(7);			                          
			                           testdata[rowno][7]=cell8.getStringCellValue();
			                           System.out.println(testdata[rowno][7]);
			                        
			                           
			                           
		                       }
		       catch(FileNotFoundException e)
		                { 
		    	          e.printStackTrace();
		                }
		        catch(IOException e)
		                { 
			               e.printStackTrace();
		                }
		
	
		
		
	          }
	
	
	
	}
}
