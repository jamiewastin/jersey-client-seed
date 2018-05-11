package com.github.jamiewastin.jerseyclientseed.examples;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.HttpHeaders;

public class GetWithHeaders {

	public static void main(String[] args) {
		// Ask the JAX-RS API to create a client, will be implemeted by Jersey
		Client client = ClientBuilder.newClient();
		
		client.target("http://www.google.com")
			.request()
			// Pretend to be a Firefox browser
			.header(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Android 4.4; Mobile; rv:41.0) Gecko/41.0 Firefox/41.0")
			.get();
		
	}
	
}
