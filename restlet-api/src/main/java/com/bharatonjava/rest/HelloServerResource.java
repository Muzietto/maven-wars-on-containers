package com.bharatonjava.rest;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloServerResource extends ServerResource {

    @Get
    public String greet() {
        return "Hello Bharat-Marco! here goes REST!";
    }

    @Delete
    public void deleteSomething() {
        System.out.println("server delete method called by Marco.");
    }
}