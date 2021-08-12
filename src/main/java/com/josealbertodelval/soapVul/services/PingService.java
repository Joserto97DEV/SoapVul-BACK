package com.josealbertodelval.soapVul.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.stereotype.Service;


@Service
public class PingService {

	public String doPing(String ipNumber) throws IOException {

		String cmd = "ping -c 1 "+ipNumber;
		Process process;
		
		if(isLinux()){
	        process = Runtime.getRuntime().exec(new String[] {"/bin/sh", "-c", cmd}, null);
			InputStream inputStream = process.getInputStream();
			Scanner s = new Scanner(inputStream).useDelimiter("\\A");
			String toReturn = s.hasNext() ? s.next() : "";
			return toReturn;

	    }else if(isWindows()){
	        process = Runtime.getRuntime().exec("cmd /c start " + cmd);
			InputStream inputStream = process.getInputStream();
			Scanner s = new Scanner(inputStream).useDelimiter("\\A");
			String toReturn = s.hasNext() ? s.next() : "";
			return toReturn;
	    }
		
		return null;
	}
	
	private boolean isLinux(){
	    String os = System.getProperty("os.name");  
	    return os.toLowerCase().indexOf("mac") >= 0;
	}

	private boolean isWindows(){
	    String os = System.getProperty("os.name");
	    return os.toLowerCase().indexOf("windows") >= 0;
	}

}
