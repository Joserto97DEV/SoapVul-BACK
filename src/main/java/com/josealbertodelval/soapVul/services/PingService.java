package com.josealbertodelval.soapVul.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.stereotype.Service;


@Service
public class PingService {

	public String doPing(String ipNumber) throws IOException {

		Process process = Runtime.getRuntime().exec("ping -c 1 "+ipNumber);
		InputStream inputStream = process.getInputStream();
		
		Scanner s = new Scanner(inputStream).useDelimiter("\\A");
		String toReturn = s.hasNext() ? s.next() : "";
		return toReturn;
	}

}
