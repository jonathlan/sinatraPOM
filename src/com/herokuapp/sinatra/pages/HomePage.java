package com.herokuapp.sinatra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
		private WebDriver driver;
		
		public HomePage(WebDriver driver2) {
			this.driver = driver2;			
		}
		
//	elements:		
		WebElement sinatraImg; //, xpath: //img[@src='/images/sinatra.jpg']
		WebElement welcomeLbl; //, xpath: //p[contains(text(), 'Welcome')]
		WebElement navBar; //, xpath: //
		
		
//		methods:
		public void login(String user, String pass) {
			
		}
		
		public void logout() {
			
		}	
}
