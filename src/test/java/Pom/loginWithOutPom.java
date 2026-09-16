package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginWithOutPom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    // launch chrome Browser//
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 //open the Url //
		 driver.get("https://www.saucedemo.com/");
		 
		 //enter the user name //
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 //enter the password//
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 //find and click on login button //
		 driver.findElement(By.id("login-button")).click();
		 
		 
		 

	}

}
