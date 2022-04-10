package com.qa.hs.tests;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeyWordEngine;

public class LoginTest {

	public KeyWordEngine keywordEngine;
	
	
	
	@Test
	public void loginTest() {
		
		keywordEngine = new KeyWordEngine();
		keywordEngine.startExecution("login");
		//Update done via off laptop
		System.out.println("KabindraUpdategor Git Hub");
		//Kbin New Laptop
		System.out.println("My new laptop to office via git hub");
	}
	
}
