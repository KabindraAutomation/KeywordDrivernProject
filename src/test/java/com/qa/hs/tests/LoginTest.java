package com.qa.hs.tests;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeyWordEngine;

public class LoginTest {

	public KeyWordEngine keywordEngine;
	
	
	
	@Test
	public void loginTest() {
		
		keywordEngine = new KeyWordEngine();
		keywordEngine.startExecution("login");
	}
	
}
