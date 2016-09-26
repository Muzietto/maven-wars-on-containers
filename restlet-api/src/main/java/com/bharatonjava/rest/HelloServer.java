package com.bharatonjava.rest;

import org.restlet.Server;
import org.restlet.data.Protocol;

public class HelloServer {

    public static void main(String[] args) throws Exception {

        Server server = new Server(Protocol.HTTP, 8081, HelloServerResource.class);
        server.start();
    }
}