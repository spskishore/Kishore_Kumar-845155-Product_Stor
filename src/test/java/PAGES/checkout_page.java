package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BASE_CLASS.wait_type;

public class checkout_page {
	
	WebDriver dr; 
	wait_type wt;
 
	public checkout_page(WebDriver dr) {
		
		this.dr=dr;
		wt=new wait_type(dr);
	}
	
	By product_name=By.xpath("//tbody[@id='tbodyid']/tr[1]/td[2]");
	By total_price=By.xpath("//h3[@id='totalp']");
	By delete_item=By.xpath("//tbody[@id='tbodyid']/tr[1]/td[4]/a");
	By final_price=By.xpath("//h3[@id='totalp']");
	
	public String get_prodname() 
	{
		WebElement we_productname=wt.waitForElement(product_name, 40);
	   return	we_productname.getText();
	}
	
	public String get_totalprice() {
		
		WebElement  price=wt.waitForElement(total_price, 30);
		return price.getText();
		
	}
	
	public void dele_product() throws InterruptedException {
		Thread.sleep(7000);
		WebElement  del_item=wt.elementToBeClickable(delete_item, 30);
		del_item.click();
		
	}
	
public String total_price_afterdel() throws InterruptedException {
		Thread.sleep(7000);
		WebElement  fprice=wt.waitForElement(final_price, 30);
		return fprice.getText();
		
		
	}

}
