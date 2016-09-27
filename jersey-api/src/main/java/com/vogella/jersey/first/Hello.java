package com.vogella.jersey.first;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hellovogella")
public class Hello {

    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public Response sayPlainTextHello() {
        String output = "Hello Marco Plaintext Jersey";
        return Response.status(200).entity(output).build();
    }

    //@POST
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayJsonTextHello() {
        String output = "Hello Marco JSON Jersey";
        return Response.status(200).entity(output).build();
    }

    @GET
    @Consumes(MediaType.TEXT_XML)
    @Produces(MediaType.TEXT_XML)
    public Response sayXMLHello() {
        String output = "<?xml version=\"1.0\"?>" + "<hello> Hello MarcoXMEllo Jersey" + "</hello>";
        return Response.status(200).entity(output).build();
    }

    // This method is called if HTML is request
    @GET
    @Consumes(MediaType.TEXT_HTML)
    @Produces(MediaType.TEXT_HTML)
    public Response sayHtmlHello() {
        String output = "<html> " + "<title>" + "Hello Marco" + "</title>"
                + "<body><h1>" + "Hello MarcoHTMello Jersey" + "</body></h1>" + "</html> ";
        return Response.status(200).entity(output).build();
    }
}