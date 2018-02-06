package com.cubic.ehr.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldRest {
	@GET
	public String welcome() {
		return "Welcome to Multi-Module REST Webservices";
	}
}
