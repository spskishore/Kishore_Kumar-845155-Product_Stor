package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASS.wait_type;

public class homepage {

	WebDriver dr;
	wait_type wt;
	
	public homepage(WebDriver dr)  
	{ 
		this.dr=dr;
		wt=new wait_type(dr);
	}
	
	//By product1=By.linkText("Iphone 6 32gb");
 By add_lap=By.xpath("//div[@class='list-group']/a[3]");
 By select_lap=By.linkText("MacBook air");
 By username=By.id("nameofuser");
 
 public String read_name() 
	{
	  WebElement  we_readname=wt.waitForElement(username, 30);
	   return we_readname.getText();
	}
	 
	public void set_product1()
	{
//		WebElement we_prod=wt.elementToBeClickable(product1, 40);
//		we_prod.click();
		dr.findElement(By.linkText("Iphone 6 32gb")).click();
	}
	
	public void add_laptop()
	{
	  WebElement we_lap=wt.elementToBeClickable(add_lap, 60);
	  we_lap.click();
	 // dr.findElement(add_lap).click();
	
   }
	
	 
	public void select_laptop()
	{
		WebElement we_sel_lap=wt.elementToBeClickable(select_lap, 60);
		  we_sel_lap.click();
		//dr.findElement(select_lap).click();
	}
	 
	
	public void add_product1()
	{

		this.set_product1();
		
//		this.add_laptop();
//		this.select_laptop();
	}
	
	
}
