package BASE_CLASS;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_type {

	//Logger log;
	
WebDriver dr;
	
	public wait_type(WebDriver dr)
	{
		this.dr=dr;
		//log=Logger.getLogger("devpinoyLogger");
	}
	
//	 public void update_log(String msg)
//	 {
//		 log.debug(msg);
//	 }

	public WebElement waitForElement(By locator, int timeout) {
		
		try {
			WebDriverWait wait=new WebDriverWait(dr, timeout);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("Element located");
			return element;
		}
		catch(Exception e)
		{
			System.out.println("Element not located" +e);
		
		}
		return null;	
	}
	
	
	public  WebElement elementToBeClickable(By locator, int timeout) {
		
		try {
			WebDriverWait wait=new WebDriverWait(dr, timeout);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			System.out.println("Element located");
			return element;
		}
		catch(Exception e)
		{
			//this.update_log("Exception occured in elementToBeClickable Method");
			System.out.println("Element not located" +e);
		
		}
		
		return null;
		
		
	}
}
