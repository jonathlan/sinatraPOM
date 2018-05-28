package com.herokuapp.sinatra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SongsPage {
	WebDriver driver;
	
	public SongsPage(WebDriver driver2) {
		this.driver = driver2;
	}
		//elements:
		WebElement songsLbl; //, xpath: //h1[text() = 'Songs']
		WebElement songList; //, id: songs
		WebElement createSongLnk; //, linkText: Create a new song

	//	methods:
		public void validateSongExists(String songName) {
			
		}
		public void createSong(String songName, int length, String date, String lyrics) {
			
		}
		public void login(String user, String pass) {
			
		}
		public void logout() {
			
		}
}
