package com.itview.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_Test {
	
WebDriver w;
	
	@Given("Browser should be with login page")
	public void browser_should_be_with_login_page() {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		w=new ChromeDriver(co);
		w.get("http://altoromutual.com:8080/login.jsp");
	    
	}

	@When("User should logs in using valid Username and Password and Click on Login button")
	public void user_should_logs_in_using_valid_username_and_password_and_click_on_login_button() throws Exception {
	   
		
		w.findElement(By.id("uid")).sendKeys("admin");		
		w.findElement(By.id("passw")).sendKeys("admin");		
        w.findElement(By.name("btnSubmit")).click();        
        Thread.sleep(3000);
      
	}

	@Then("Home Page should get open and verify page title and Close browser")
	public void home_page_should_get_open_and_verify_page_title_and_close_browser() {
	   
		String pageTitle=w.getTitle();
		Assert.assertEquals("Altoro Mutual", pageTitle);		
		w.findElement(By.linkText("Sign Off")).click();        
        w.close();
	}

	
}
