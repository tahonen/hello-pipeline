package com.tahonen.openshift.hello.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/")
public class HelloEndpoint {

	@GET
	@Path("/hello")
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("Hello pipeline").build();
	}

}