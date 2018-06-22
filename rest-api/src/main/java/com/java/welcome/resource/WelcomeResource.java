package com.java.welcome.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("welcome")
public class WelcomeResource {

	
	@GET
	public String welcome() {
		return "Welcome";
	}
	
}