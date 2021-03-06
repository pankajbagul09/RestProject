/**
 * 
 */
package com.cftf.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author pankajbagul
 *
 */
	
@Path("/restapp")	
public class GetMessageService {

	
	HelloWorld helloWorldImpl = new HelloWorldImpl();
	
	@GET
	@Path("/getmessage")
	public Response getMessage() {
		String result = helloWorldImpl.getMessage("Pankaj");
		return Response.status(200).entity(result).build();
	}
	
	public void setHelloWorldImpl(HelloWorld helloWorldImpl) {
		this.helloWorldImpl = helloWorldImpl;
	}
	

}
