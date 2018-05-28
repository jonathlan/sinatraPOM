package com.herokuapp.sinatra.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.herokuapp.sinatra.pages.HomePage;
import com.herokuapp.sinatra.pages.SongsPage;

//import paginas.AddFriend;
//import paginas.LoginPage;
//import paginas.SearchPage;

public class SinatraTestBasePOM {
	private final String CHROME_DRIVER_NAME = "webdriver.chrome.driver";
	private final String GENERIC_DRIVER_LOCATION = "C:\\testautomation\\libs\\drivers\\";
	private final String CHROME_DRIVER_LOCATION = GENERIC_DRIVER_LOCATION + "chromedriver.exe";
	private final String FIREFOX_DRIVER_NAME = "webdriver.gecko.driver";
	private final String FIREFOX_DRIVER_LOCATION = GENERIC_DRIVER_LOCATION + "geckodriver.exe";
	public WebDriver driver = null;
	HomePage home;
	SongsPage songs;
//	LoginPage login;
//	SearchPage searchPage;
//	AddFriend friend;
	
	@Before
	public void setUp() {
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		System.setProperty(CHROME_DRIVER_NAME, CHROME_DRIVER_LOCATION);
	    driver = new ChromeDriver(ops);			
	    driver.get("http://songs-by-sinatra.herokuapp.com");
	    home = new HomePage(driver);
	    songs = new SongsPage(driver);
//	    login = new LoginPage(driver);	 
//	    searchPage = new SearchPage(driver);
//	    friend = new AddFriend(driver);
	}
	
	@After
	public void baBye() {		
		driver.quit();
	}
	public void searchFrinedTest() {
		
	}
}
