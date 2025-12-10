package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mytestcases {
	
	
	String myWebsite = "https://www.saucedemo.com/";
	WebDriver driver= new EdgeDriver() ;
	
	String userName = "standard_user";	
	String password = "secret_sauce";
	String userName2 = "Mohammed" ;
	String lastname = "alzoubi";
	String postalcode = "21110";
	
	@BeforeTest
	public void mySetUp() {
		
		driver.get(myWebsite);
		
		driver.manage().window().maximize();
		
		
		
		
		
	}
	
	
	
	@Test
    public void login() {
			
		driver.findElement(By.id("user-name")).sendKeys(userName);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.findElement(By.name("checkout")).click();
		
        driver.findElement(By.id("first-name")).sendKeys(userName2);
		
		driver.findElement(By.id("last-name")).sendKeys(lastname);
		
		driver.findElement(By.id("postal-code")).sendKeys(postalcode);
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("finish")).click();
	}
	
	
	
	@AfterTest
    public void AfterMyTest() {
		//driver.close();
	}

}
