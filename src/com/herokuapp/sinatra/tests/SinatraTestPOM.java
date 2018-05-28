package com.herokuapp.sinatra.tests;

import org.junit.Test;

public class SinatraTestPOM extends SinatraTestBasePOM {
	
	@Test
	public void searchFriendTest() {
		home.login("frank", "sinatra");
		songs.createSong("NewSong", 35, "05/26/1989", "This is my new song...");
	}
}
