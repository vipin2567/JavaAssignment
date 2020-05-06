package auction;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class stepDefinition {
	public static WebDriver driver;
	
	@Before
	public void setUpDriver(){
	
	}
	
	

@Given("^user navigate to the bid url$")
public void user_navigate_to_the_bid_url() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Given statement executed successfully");
	//driver = new ChromeDriver();
	String driverPath = System.getProperty("user.dir") + "//src//test//java//drivers//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8090/Bid/index.jsp");
	System.out.println("inside given");
    
}

@When("^user click on user bid link$")
public void user_click_on_user_bid_link()  {
    // Write code here that turns the phrase above into concrete actions
	  System.out.println("When statement execueted successfully");
      System.out.println("inside when ");
      
      WebElement userlink = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/a[1]"));
      userlink.click();
      
      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
   
}

@Then("^should not see the items in the list to bid and navigate back to home page$")
public void should_not_see_the_items_in_the_list_to_bid_and_navigate_back_to_home_page() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Then statement executed successfully");

     WebElement userpagemsg = driver.findElement(By.xpath("/html/body/form"));
     String url = "http://localhost:8090/Bid/userItems.jsp";
     if(driver.getCurrentUrl().equals(url))
     {
  	  System.out.println("user page is displayed"); 
     }   
     else {
  	   System.out.println("user page is not displayed");
     }
     
     WebElement homepage = driver.findElement(By.xpath("/html/body/form/a"));
     homepage.click();
     String homeurl = "http://localhost:8090/Bid/index.jsp";
     
    
     if(driver.getCurrentUrl().equals(homeurl))
     {
  	  System.out.println("home page is displayed"); 
     }
     else {
  	   System.out.println("home page is not displayed");
     }
     
}


@Given("^seller navigate to the bid url$")
public void seller_navigate_to_the_bid_url()  {
    // Write code here that turns the phrase above into concrete actions
	/*	String homeurltosignup = "http://localhost:8090/Bid/index.jsp";
	if(driver.getCurrentUrl().equals(homeurltosignup))
    {
 	  System.out.println("home page is displayed ready to navigate to sign up"); 
    }
    else {
 	   System.out.println("home page is not displayed and not ready navigate to sign up");
    } */
	System.out.println(" @ home page");
	//driver.get("http://localhost:8090/Bid/index.jsp");
	   
} 

@When("^seller click on seller signup link$")
public void seller_click_on_seller_signup_link()  {
    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		WebElement signuplink = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/a[2]"));
	signuplink.click();
	
    
}

@Then("^should show the sign up page$")
public void should_show_the_sign_up_page()  {
	String signupurl = "http://localhost:8090/Bid/sellerSignUp.jsp";
	//assert.assertEquals("signupurl", "http://localhost:8090/Bid/sellerSignUp.jsp");
	if(driver.getCurrentUrl().equals(signupurl))
    {
 	  System.out.println("signup page is displayed"); 
    }
    else {
 	   System.out.println("sign up page is not displayed");
    }
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("^seller navigate to the sign up page$")
public void seller_navigate_to_the_sign_up_page()  {
    // Write code here that turns the phrase above into concrete actions
//	String signupurl = "http://localhost:8090/Bid/sellerSignUp.jsp";
	//assert.assertEquals("signupurl", "http://localhost:8090/Bid/sellerSignUp.jsp");
/*	if(driver.getCurrentUrl().equals(signupurl))
    {
 	  System.out.println("signup page is displayed"); 
    }
    else {
 	   System.out.println("sign up page is not displayed");
    } */
	
	//driver.get("http://localhost:8090/Bid/sellerSignUp.jsp");
	System.out.println("@ signup page");
    
}

@When("^seller rovide sellername, username, password, email and  address$")
public void seller_rovide_sellername_username_password_email_and_address()  {
    // Write code here that turns the phrase above into concrete actions
	WebElement sellername = driver.findElement(By.xpath("/html/body/form/div/input[2]"));
	sellername.sendKeys("vipin");
	WebElement sellerusername = driver.findElement(By.xpath("/html/body/form/div/input[3]"));
	sellerusername.sendKeys("admin");
	WebElement sellerpassword = driver.findElement(By.xpath("/html/body/form/div/input[4]"));
	sellerpassword.sendKeys("admin");
	WebElement sellerphone = driver.findElement(By.xpath("/html/body/form/div/input[5]"));
	sellerphone.sendKeys("test@gmail.com");
	WebElement selleraddress = driver.findElement(By.xpath("/html/body/form/div/input[6]"));
	selleraddress.sendKeys("23 street, san francisco, us");
	WebElement sellerbutton = driver.findElement(By.xpath("/html/body/form/div/div/button[1]"));
	sellerbutton.click();
	
}

@Then("^should be able to sign up and should show the items page for seller to add$")
public void should_be_able_to_sign_up_and_should_show_the_items_page_for_seller_to_add()  {
    // Write code here that turns the phrase above into concrete actions
	String selleraddnew = "http://localhost:8090/Bid/sellerItems";
		if(driver.getCurrentUrl().equals(selleraddnew))
	    {
	 	  System.out.println("Add new item page is displayed"); 
	    }
	    else {
	 	   System.out.println("Add new item page is not displayed");
	    }
}


@Given("^seller is at home page and seller cick on seller login link$")
public void seller_is_at_home_page_and_seller_cick_on_seller_login_link()  {
    // Write code here that turns the phrase above into concrete actions
    
	WebElement backtohomepage = driver.findElement(By.xpath("/html/body/form/a"));
	backtohomepage.click();
	WebElement sellerloginlink = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/a[3]"));
	sellerloginlink.click();
	
	String selleraddnew = "http://localhost:8090/Bid/sellerLogin.jsp";
	if(driver.getCurrentUrl().equals(selleraddnew))
    {
 	  System.out.println("seller login page is displayed"); 
    }
    else {
 	   System.out.println("seller login page is not displayed ");
    }
}

@When("^seller add valid username and password$")
public void seller_add_valid_username_and_password()  {
    // Write code here that turns the phrase above into concrete actions
	
	WebElement sellerusername = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	sellerusername.sendKeys("admin");
	WebElement sellerpassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	sellerpassword.sendKeys("admin");
	WebElement sellerlogin = driver.findElement(By.xpath("//*[@id=\"sellerlogin\"]/div/div/button[1]"));
	sellerlogin.click();
    
}

@Then("^seller should login successfully$")
public void seller_should_login_successfully()  {
    // Write code here that turns the phrase above into concrete actions
	WebElement sellerlogin = driver.findElement(By.xpath("/html/body/form/button"));
	if(sellerlogin.isDisplayed())
		System.out.println("seller logged in successfully ");
	else
		System.out.println("seller not logged in successfully ");
}

@Given("^seller login and is at add new item page$")
public void seller_login_and_is_at_add_new_item_page()  {
    // Write code here that turns the phrase above into concrete actions
	WebElement sellerAddnewbutton = driver.findElement(By.xpath("/html/body/form/button"));
	sellerAddnewbutton.click();
	
}

@When("^seller provide the itemname and click on add$")
public void seller_provide_the_itemname_and_click_on_add()  {
    // Write code here that turns the phrase above into concrete actions
	WebElement itemname =  driver.findElement(By.xpath("/html/body/form/div/input[3]"));
	itemname.sendKeys("Laptop");
	WebElement addbuttontoadditem = driver.findElement(By.xpath("/html/body/form/div/div/button"));
	addbuttontoadditem.click();
}

@Then("^item added should get added and be displayed$")
public void item_added_should_get_added_and_be_displayed()  {
    // Write code here that turns the phrase above into concrete actions
	driver.navigate().refresh();
	WebElement backtohome = driver.findElement(By.xpath("/html/body/form/a[2]"));
	
	backtohome.click();
	
}

@Given("^user is at home page$")
public void user_is_at_home_page()  {
    // Write code here that turns the phrase above into concrete actions
	String homeurl = "http://localhost:8090/Bid/index.jsp";
	if(driver.getCurrentUrl().equals(homeurl))
    {
 	  System.out.println("home page is displayed"); 
    }
    else {
 	   System.out.println("home  page is not displayed ");
    }
}

@When("^user click on the item name and fill the form$")
public void user_click_on_the_item_name_and_fill_the_form()  {
    // Write code here that turns the phrase above into concrete actions
	WebElement userLink = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/a[1]"));
	userLink.click();
	WebElement userSelectItem = driver.findElement(By.xpath("/html/body/form/a[1]"));
	userSelectItem.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement username = driver.findElement(By.xpath("/html/body/form/input[1]"));
	username.sendKeys("Mark");
	WebElement email = driver.findElement(By.xpath("/html/body/form/input[3]"));
	email.sendKeys("Mark25@gmail.com");
	WebElement phone = driver.findElement(By.xpath("/html/body/form/input[4]"));
	phone.sendKeys("9895698541");
	WebElement address = driver.findElement(By.xpath("/html/body/form/input[5]"));
	address.sendKeys("245, santa street, Ney York");
	WebElement maxbid = driver.findElement(By.xpath("/html/body/form/input[6]"));
	maxbid.sendKeys("1000");
	WebElement save = driver.findElement(By.xpath("/html/body/form/input[7]"));
	save.click();
	
		
	
}

@Then("^should show user has placed a bid for the item$")
public void should_show_user_has_placed_a_bid_for_the_item()  {
    // Write code here that turns the phrase above into concrete actions
	String biddetail1 = "http://localhost:8090/Bid/BidDetails";
	if(driver.getCurrentUrl().equals(biddetail1))
    {
 	  System.out.println("Bid details page is displayed "); 
    }
    else {
 	   System.out.println("Bid details page is not displayed ");
    }
}

@Then("^should show user has placed a bid for the item with different price$")
public void should_show_user_has_placed_a_bid_for_the_item_with_different_price() {
    // Write code here that turns the phrase above into concrete actions
	
	WebElement userbackhome = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/a"));
	userbackhome.click();
	String homeurl = "http://localhost:8090/Bid/index.jsp";
	if(driver.getCurrentUrl().equals(homeurl))
    {
 	  System.out.println("home page is displayed to add second user"); 
    }
    else {
 	   System.out.println("home  page is not displayed ");
    }
	
	WebElement userLink = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/a[1]"));
	userLink.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement userSelectItem = driver.findElement(By.xpath("/html/body/form/a[1]"));
	userSelectItem.click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement username = driver.findElement(By.xpath("/html/body/form/input[1]"));
	username.sendKeys("miley");
	WebElement email = driver.findElement(By.xpath("/html/body/form/input[3]"));
	email.sendKeys("miley1256@gmail.com");
	WebElement phone = driver.findElement(By.xpath("/html/body/form/input[4]"));
	phone.sendKeys("999767543");
	WebElement address = driver.findElement(By.xpath("/html/body/form/input[5]"));
	address.sendKeys("123, gaza street, Okalahoma");
	WebElement maxbid = driver.findElement(By.xpath("/html/body/form/input[6]"));
	maxbid.sendKeys("5000");
	WebElement save = driver.findElement(By.xpath("/html/body/form/input[7]"));
	save.click();
	String biddetail1 = "http://localhost:8090/Bid/BidDetails";
	if(driver.getCurrentUrl().equals(biddetail1))
    {
 	  System.out.println("Bid details page is displayed for miley"); 
    }
    else {
 	   System.out.println("Bid details page is not displayed ");
    }
	
	WebElement backtohome = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/a"));
	backtohome.click();
	
	
}

@Given("^Login as seller and close the bid$")
public void login_as_seller_and_close_the_bid() {
    // Write code here that turns the phrase above into concrete actions
	WebElement sellerloginlink = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/a[3]"));
	sellerloginlink.click();
	WebElement sellerusername = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	sellerusername.sendKeys("admin");
	WebElement sellerpassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	sellerpassword.sendKeys("admin");
	WebElement sellerlogin = driver.findElement(By.xpath("//*[@id=\"sellerlogin\"]/div/div/button[1]"));
	sellerlogin.click();
    
	
}

@When("^seller cick on cose bid$")
public void seller_cick_on_cose_bid()  {
    // Write code here that turns the phrase above into concrete actions
	WebElement itemselected = driver.findElement(By.xpath("/html/body/form/a[1]"));
	itemselected.click();
	WebElement closebid = driver.findElement(By.xpath("/html/body/form/button"));
	closebid.click();
	
	
}

@Then("^should show the user has placed maximum bid$")
public void should_show_the_user_has_placed_maximum_bid()  {
    // Write code here that turns the phrase above into concrete actions
	String winner = driver.findElement(By.xpath("/html/body")).getText();
	if(winner.contains("miley") && winner.contains("5000"))
		System.out.println("winner name and max bid is displayed");
	else
		System.out.println("winner name and max bid is not displayed");
}






}









