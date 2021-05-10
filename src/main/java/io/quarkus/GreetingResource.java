package io.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class GreetingResource {

    @GET
    public String hello() {
        return "Hello";
    }

    @GET
    @Path("2")
    public String hello2() {
        return "Hello 2";
    }


}
