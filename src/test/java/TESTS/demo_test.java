package TESTS;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BASE_CLASS.utilities;
import BASE_CLASS.wait_type;
import EXCEL_UTILITY.excel_product;
import PAGES.add_tocart;
import PAGES.checkout_page;
import PAGES.homepage;
import PAGES.reg_pom;

public class demo_test extends excel_product {

	
WebDriver dr;
	
	utilities ut; 
	wait_type wt;
	
	reg_pom rp;
	homepage hp;
	add_tocart ap;
	checkout_page cp;
	  int c=0;
	
	String url="https://www.demoblaze.com/";
	
	@BeforeMethod
	public void bm() {
		ut=new utilities();
		dr=ut.launch_browser("CHROME", url);
		
	}
	
	
  @Test(dataProvider="project")
  public void f(String s_uid,String s_pwd,String l_uid,String l_pwd,String el,String cn,String tm,String a) throws InterruptedException {
	  
	  
	  wt=new wait_type(dr);
	  ut=new utilities();
	  
	  rp=new reg_pom(dr);
	  rp.do_reg(s_uid, s_pwd);	 
	  rp.alert();
      	
     
      rp.do_login(l_uid, l_pwd); 
	  
	  Thread.sleep(5000);
	  
	  hp=new homepage(dr);
	  String act_usr= hp.read_name();	
	  Assert.assertTrue(act_usr.contains(a));
	  
      hp.add_product1();
	  	  
	  Thread.sleep(3000);
	  ap=new add_tocart(dr);
	  ap.set_cart();
	  ap.add_cart(el, cn, tm);
	  
	  hp.add_laptop();
	  hp.select_laptop();

	  ap.set_cart();
	  ap.add_alert();
	  ap.goto_cart();
	  
	  cp=new checkout_page(dr);

	  String total_price= cp.get_totalprice();
	  System.out.println(total_price);
	  Assert.assertTrue(total_price.contains("1490"));
	  
	    cp.dele_product();
		String final_price = cp.total_price_afterdel();
		System.out.println(final_price);
		Assert.assertTrue(final_price.contains("700"));
		
		Thread.sleep(5000);
        
       
  }
	 
  @DataProvider(name="project")
  public String[][] prov_data(){
	  
	  get_test_data();
	  return testdata;
  } 
  
  @AfterMethod
  public void am()
  {
	  dr.close();
	  c++;
  }
}
