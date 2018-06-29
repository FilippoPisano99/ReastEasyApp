package com.pisi.resteasyapp;

import javax.ws.rs.*;

@Path("/api")
public class Hello {

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String gethello() {
        return "HELLO";
    }

}
