package PAGES;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASS.wait_type;

public class add_tocart {

	
	WebDriver dr;
	wait_type wt;
	
	public add_tocart(WebDriver dr) 
	{
		this.dr=dr;
		wt=new wait_type(dr);
	}
	 
	
	By a_cart=By.xpath("//div[@id='tbodyid']/div[2]/div/a");
	By contact=By.linkText("Contact");
	By contact_Email=By.id("recipient-email");
	By contact_Name=By.id("recipient-name");
	By msg=By.id("message-text");
	By send_msg=By.xpath("//button[contains (text(),'Send message')]");
	By home=By.xpath("//div[@id='navbarExample']/ul/li[1]/a");
    By gotocart=By.xpath("//div[@id='navbarExample']/ul/li[4]/a");
	
	public void  set_cart()
	{
//		WebElement we_cart=wt.elementToBeClickable(a_cart, 40);
//		we_cart.click();
		dr.findElement(By.xpath("//div[@id='tbodyid']/div[2]/div/a")).click();
	}
	
	public void add_alert() 
	{
	    try {
			Thread.sleep(6000);
			} 
	    catch(InterruptedException e) 
	       {
		 	e.printStackTrace();
		   }
	 
	     Alert alt=dr.switchTo().alert();
	     alt.accept();
	  
	 }
	
	public void click_contact()
	{
		WebElement we_cont=wt.elementToBeClickable(contact, 40);
		we_cont.click();
	}
	
	public void set_contemail(String em)
	{
		WebElement we_contemail=wt.waitForElement(contact_Email, 40);
		we_contemail.sendKeys(em);
	}
	
	public void set_contname(String na)
	{
		
		WebElement we_contname=wt.waitForElement(contact_Name, 40);
		we_contname.sendKeys(na);
	}
	
	public void set_msg(String ms)
	{
		WebElement we_msg=wt.waitForElement(msg, 40);
		we_msg.sendKeys(ms);
	}
	
	public void clic_sendmsg()
	{
		WebElement we_sdmsg=wt.elementToBeClickable(send_msg, 40);
		we_sdmsg.click();
	}
	
	public void thanks_msg() 
	{
	    try {
			Thread.sleep(4000);
			} 
	    catch(InterruptedException e) 
	       {
		 	e.printStackTrace();
		   }
	 
	     Alert alt1=dr.switchTo().alert();
	     alt1.accept();
	  
	 }
	
	public void click_home()
	{
		WebElement we_home=wt.elementToBeClickable(home, 40);
		we_home.click();
	}
	
	public void click_home1()
	{
		WebElement we_home=wt.elementToBeClickable(home, 40);
		we_home.click();
	}
	

	
	public void add_alert1() 
	{
	    try {
			Thread.sleep(8000);
			} 
	    catch(InterruptedException e) 
	       {
		 	e.printStackTrace();
		   }
	 
	     Alert alt=dr.switchTo().alert();
	     alt.accept();
	  
	 }
	
	
	public void goto_cart()
	{
		dr.findElement(gotocart).click();
	}
	public void add_cart(String e,String n,String m) throws InterruptedException
	{
		//Thread.sleep(3000);
		
		//this.set_cart();
		this.add_alert();
		
		Thread.sleep(3000);
		
		this.click_contact();
		this.set_contemail(e);
		this.set_contname(n);
		this.set_msg(m);
		this.clic_sendmsg();
		
		Thread.sleep(2000);
		this.thanks_msg();
		this.click_home();
		this.click_home1();
		

	}
}
