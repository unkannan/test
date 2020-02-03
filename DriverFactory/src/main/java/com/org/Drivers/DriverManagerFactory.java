package com.org.Drivers;

import com.org.enums.DriverType;

public class DriverManagerFactory {
	public static DriverManager getManager(DriverType type) {
		
		DriverManager driverManager = null;
		
		switch(type) {
		case CHROME:
			driverManager=new ChromeDriverManager();
			break;
		case FIREFOX:
			driverManager=new FirefoxDriverManager();	
		
		}
		
		return driverManager;
		
	}
}
