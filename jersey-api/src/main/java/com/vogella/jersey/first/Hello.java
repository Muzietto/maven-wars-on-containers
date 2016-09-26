package com.vogella.jersey.first;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello Marco Jersey";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String sayJsonTextHello() {
        return "Hello Marco Jersey";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello MarcoXMEllo Jersey" + "</hello>";
    }

    // This method is called if HTML is request
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> " + "<title>" + "Hello Marco" + "</title>"
                + "<body><h1>" + "Hello MarcoHTMello Jersey" + "</body></h1>" + "</html> ";
    }
}