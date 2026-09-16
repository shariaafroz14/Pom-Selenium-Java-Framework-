package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class LoginPage {
	
	    WebDriver driver;
	    
	    //constructor//
	    LoginPage(WebDriver d)
	    {
	    	driver =d;
	    }
	    
	    //locate the webElements//
	    
	    By username=By.id("user-name");
	    By password=By.id("password");
	    By loginBtn=By.id("login-button");
	    
	    public void enterusername(String uname)
	    {
	    	driver.findElement(username).sendKeys("standard_user");
	    }
	    public void enterPassword(String pwd)
	    
	    {
	    	driver.findElement(password).sendKeys("secret_sauce");
	    }
	   
		public void clickOnLoginBtn() {
			{
				driver.findElement(loginBtn).click();
			}
			
		}
}
