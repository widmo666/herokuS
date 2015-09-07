package org.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/web")
public class Webservice {

	@GET
	@Path("/message")
	@Produces("text/plain")
	public String getMessage() {
		return "Hello";
	}

}
