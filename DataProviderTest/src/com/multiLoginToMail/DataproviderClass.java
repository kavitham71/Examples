package com.multiLoginToMail;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataproviderClass {

	@DataProvider(name = "SearchProvider")
	public static Object[][] getDataFromDataprovider(Method m) {
		if (m.getName().equalsIgnoreCase("login")) {
			System.out.println("Method name: "+m.getName());
			return new Object[][] { {"tweetatkavi7", "Jan12018"   }, { "ab@abc.com", "abc123" }

			};
		} else {
			
			return new Object[][] { {"def", "mgr!23" }, { "abc@gmail.com", "aa" }

			};
	}}

}


