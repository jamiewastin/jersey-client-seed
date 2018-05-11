package com.github.jamiewastin.jerseyclientseed.examples;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.Test;

public class AssertStatusCode {

	@Test
	public void statusCode() {
		// Ask the JAX-RS API to create a client, will be implemeted by Jersey
		Client client = ClientBuilder.newClient();
		
		Response response = client.target("http://www.google.com/url-that-does-not-exist")
			.request()
			.get();
		
		assertThat("Validate the server returned a 2XX status code",  
				response.getStatusInfo().getFamily(), is(Status.Family.SUCCESSFUL));
	}
	
}
