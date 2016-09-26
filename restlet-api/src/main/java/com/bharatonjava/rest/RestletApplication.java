package com.bharatonjava.rest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RestletApplication extends Application {
    public synchronized Restlet createInboundRoot() {
        Router router = new Router(getContext());
        router.attach("/hello", HelloServerResource.class);
        return router;
    }
}