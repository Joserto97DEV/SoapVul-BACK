package com.josealbertodelval.soapVul.endpoints;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.josealbertodelval.beans.ping.GetPingIpRequest;
import com.josealbertodelval.beans.ping.GetPingResultResponse;
import com.josealbertodelval.beans.ping.PingRes;
import com.josealbertodelval.soapVul.services.PingService;

@Endpoint
public class PingEndpoint {

	private static final String NAMESPACE_URI = "http://www.josealbertodelval.com/beans/ping";
	
	@Autowired
	private PingService pingService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPingIpRequest")
	@ResponsePayload
	public GetPingResultResponse getPingIpRequest(@RequestPayload GetPingIpRequest request){
		
		
		GetPingResultResponse response = new GetPingResultResponse();
		
		try{
			String pingResult= pingService.doPing(request.getIpNumber(),request.isIsSafe());
			PingRes res = new PingRes();
			res.setResult(pingResult);
			response.setResult(res);
			return response;
		}catch(IOException e) {
			return null;

		}
	}
	
	
}
