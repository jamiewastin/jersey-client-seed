package com.github.jamiewastin.jerseyclientseed.examples;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class GetAndCheckStatus {

	public static void main(String[] args) {
		// Ask the JAX-RS API to create a client, will be implemeted by Jersey
		Client client = ClientBuilder.newClient();
		
		Response response = client.target("http://www.google.com")
			.request()
			.get();
		
		System.out.println("Status code is: " + response.getStatus());
		System.out.println("Status code family: " + response.getStatusInfo().getFamily());
	}
	
}
