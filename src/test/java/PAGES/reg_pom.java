package PAGES;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BASE_CLASS.utilities;
import BASE_CLASS.wait_type;

public class reg_pom {

	
	WebDriver dr; 
	wait_type wt;
	
	public reg_pom(WebDriver dr) 
	{
		this.dr=dr;
		wt=new wait_type(dr);
	}
	 
	
		 
 By signup=By.linkText("Sign up");
 By username=By.xpath("//input[@id='sign-username']");
 By password=By.xpath("//input[@id='sign-password']");
 By signup_btn=By.xpath("//body[@class='modal-open']/div[2]/div[1]/div/div[3]/button[2]");
 
 
 By login=By.xpath("//a[@id='login2']");
 By l_usr=By.xpath("//input[@id='loginusername']");
 By l_pwd=By.xpath("//input[@id='loginpassword']");
 By l_btn=By.xpath("//body[@class='modal-open']/div[3]/div[1]/div/div[3]/button[2]");

 public void click_sign() {
	WebElement we_sign=wt.elementToBeClickable(signup, 60);
	we_sign.click();
	// dr.findElement(signup).click();
 }
	
public void set_username(String un)
{
	WebElement we_usr=wt.waitForElement(username, 40);
	we_usr.sendKeys(un);
}

public void set_pwd(String pwd)
{
	WebElement we_pwd=wt.elementToBeClickable(password, 40);
	we_pwd.sendKeys(pwd);
}

public void sign_btn()
{
	WebElement we_sbtn=wt.elementToBeClickable(signup_btn, 40);
	we_sbtn.click();
}

public void alert() 
{
//    try {
//		//Thread.sleep(9000);
//		} 
//    catch(InterruptedException e) 
//       {
//	 	e.printStackTrace();
//	   }
	try {
	    WebDriverWait wait = new WebDriverWait(dr, 10);
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert = dr.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	   	} catch (Exception e) {
	    //exception handling  
		e.printStackTrace();
	}
 
 
  
	 }
 

public void click_login()
{
	WebElement we_login=wt.elementToBeClickable(login, 40);
	we_login.click();
}

public void set_loginusr(String lu)
{
//	WebElement we_lu=wt.waitForElement(l_usr, 40);
//	we_lu.sendKeys(lu);
	dr.findElement(l_usr).sendKeys(lu);
}

public void set_loginpwd(String lp)
{
	WebElement we_pwd=wt.waitForElement(l_pwd, 40);
	we_pwd.sendKeys(lp);
}

public void login_btn()
{
	WebElement we_lbtn=wt.elementToBeClickable(l_btn, 40);
	we_lbtn.click();
}
  
public void do_reg(String u,String p) throws InterruptedException
{   
	Thread.sleep(1000);
	this.click_sign();
	this.set_username(u);
	this.set_pwd(p);
	this.sign_btn();
	Thread.sleep(2000);
//	this.alert(); 
//	Thread.sleep(4000);
	
	
}

public void do_login(String lu1,String lp1) throws InterruptedException
{
	this.click_login();
	Thread.sleep(1000); 
	
	this.set_loginusr(lu1);
	Thread.sleep(2000); 
	
	this.set_loginpwd(lp1);
	this.login_btn();
}


}

