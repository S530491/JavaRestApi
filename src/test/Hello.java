package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//adding two imports statements such that it will ensure to make the application run on tomcat
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {
//	@get is used to retreive the values as it is mention it is agent
//	@Produces indicates which type of resource it will come like text_html,text_json like that
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello() {
		String reso="<?xml version='1.0'?>"+
	"<hello>this is xml content</hello>";
		return reso;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML() {
		String resource=null;
		return resource;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJSON() {
		String resource=null;
		return resource;
	}

}
