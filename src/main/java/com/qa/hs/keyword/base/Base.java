package com.qa.hs.keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public WebDriver driver;
	public Properties prop; 
	
	public  WebDriver   init_driver(String browserName) {
		if(browserName.equals("chrome"));
		System.setProperty("Webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		if(prop.getProperty("headless").equals("yes")) {
			
			//headLess mode:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
			
		}else {
			driver = new ChromeDriver();
		}
		return driver;
		
	}
	public Properties init_Properties() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\JavaWorkSpace\\KeywordDrivenProject\\src\\main\\java\\com\\qa\\hs\\keyword\\cofig\\config.properties");
			
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
	}
	

}
