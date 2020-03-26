package BASE_CLASS;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import EXCEL_UTILITY.excel_product;

public class utilities extends excel_product {

	protected WebDriver dr;
	   public int counter=1;

		public static WebDriver launch_browser(String browser, String url)
		{
			WebDriver dr=null;
			 
			
			String chr_path="src\\test\\resources\\DRIVER\\chromedriver_v79.exe";
			String fir_path="src\\test\\resources\\DRIVER\\geckodriver.exe";
			switch(browser)
			{
			case "CHROME":
				System.setProperty("webdriver.chrome.driver",chr_path);
			    dr=new ChromeDriver();
			    break;
			    
			case "FIREFOX":
				System.setProperty("webdriver.geckop.driver",fir_path);
			    dr=new FirefoxDriver();
				break;
				
			default:
				System.out.println("Supported browser options : chrome & firefox");
			    break;
			}
			dr.get(url);
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			return dr;
			
		}
		
	      
		
		public void screenshot(WebDriver dr)  {
			
			File f =((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			String path="C:\\Users\\Kishore Kumar\\eclipse-workspace\\Demoblaze_Maven\\src\\test\\resources\\SCREENSHOTS\\pic1.png";
			try {
				FileUtils.copyFile(f,new File(path));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
			
		/*
		 * File f1=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE); File f2= new
		 * File(path+filename);
		 */
			
			/*try
			{
				FileUtils.copyFileToDirectory(f1, f2);
			}
			catch(IOException e)
			{
				//this.update_log("IOException ocuured while taking screenshot");
				System.out.println("Screenshot" +counter +"failed");
				e.printStackTrace();
			}
		
		}

		*/

